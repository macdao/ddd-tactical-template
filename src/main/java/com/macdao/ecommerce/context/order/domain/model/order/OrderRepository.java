package com.macdao.ecommerce.context.order.domain.model.order;

import java.util.Optional;

public interface OrderRepository {
    Optional<Order> findById(OrderId id);
}
