package selfstudy.tacocloud.repository;

import org.springframework.data.repository.CrudRepository;
import selfstudy.tacocloud.domain.Order;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
//    Order save(Order order);
    List<Order> findByDeliveryZip(String deliveryZip);
}
