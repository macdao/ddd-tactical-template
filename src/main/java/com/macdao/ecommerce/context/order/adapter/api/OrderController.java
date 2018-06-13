package com.macdao.ecommerce.context.order.adapter.api;

import com.macdao.ecommerce.context.order.application.OrderApplicationService;
import com.macdao.ecommerce.context.order.domain.model.order.Order;
import com.macdao.ecommerce.context.order.domain.model.order.OrderId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order/orders")
public class OrderController {
    private final OrderApplicationService orderApplicationService;

    public OrderController(OrderApplicationService orderApplicationService) {
        this.orderApplicationService = orderApplicationService;
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrder(@PathVariable OrderId orderId) {
        return orderApplicationService.getOrder(orderId)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
