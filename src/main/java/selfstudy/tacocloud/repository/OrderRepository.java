package selfstudy.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import selfstudy.tacocloud.data.Order;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByDeliveryZip(String deliveryZip);
}
