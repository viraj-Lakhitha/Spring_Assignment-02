package lk.ijse.gdse.repo;


import lk.ijse.gdse.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders,String> {
}
