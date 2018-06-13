package com.macdao.ecommerce.context.order.application;

import com.macdao.ecommerce.context.order.domain.model.order.Order;
import com.macdao.ecommerce.context.order.domain.model.order.OrderId;
import com.macdao.ecommerce.context.order.domain.model.order.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderApplicationService {
    private final OrderRepository orderRepository;

    public OrderApplicationService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Optional<Order> getOrder(OrderId orderId) {
        return orderRepository.findById(orderId);
    }
}
