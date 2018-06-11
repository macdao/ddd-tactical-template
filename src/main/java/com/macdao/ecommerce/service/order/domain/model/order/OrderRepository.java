package com.macdao.ecommerce.service.order.domain.model.order;

import java.util.Optional;

public interface OrderRepository {
    Optional<Order> findById(OrderId id);
}
