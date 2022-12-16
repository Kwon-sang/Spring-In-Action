package selfstudy.tacocloud.repository;

import selfstudy.tacocloud.domain.Order;

public interface OrderRepository {

    Order save(Order order);
}
