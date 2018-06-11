package com.macdao.ecommerce.service.order.adapter.mysql;

import com.macdao.ecommerce.service.order.domain.model.order.Order;
import com.macdao.ecommerce.service.order.domain.model.order.OrderId;
import com.macdao.ecommerce.service.order.domain.model.order.OrderRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MysqlOrderRepository implements OrderRepository {

    private final JdbcTemplate jdbcTemplate;

    public MysqlOrderRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Optional<Order> findById(OrderId id) {
        return jdbcTemplate.query("select * from ecommerce_order where id = ?",
            new Object[]{id.getValue()},
            (rs, rowNum) -> new Order(new OrderId(rs.getString("id"))))
            .stream().findFirst();
    }
}
