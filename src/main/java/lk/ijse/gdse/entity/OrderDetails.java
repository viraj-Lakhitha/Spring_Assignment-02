package lk.ijse.gdse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@IdClass(OrderProject_PK.class)
public class OrderDetails {
    @Id
    private String oid;

    @Id
    private String projectId;
    private String cusName;
    private double price;

    @ManyToOne
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "pID" , referencedColumnName = "projectId", insertable = false,updatable = false)
    private Project project;


}
