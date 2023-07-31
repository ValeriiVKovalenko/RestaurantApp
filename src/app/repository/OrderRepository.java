package app.repository;

import app.model.Order;

import java.util.*;

public class OrderRepository {
    private final List<Order> orders;
    private long counter = 0;

    public OrderRepository() {
        orders = new ArrayList<>();
    }

    public void create(Order order) {
        order.setId(++counter);
        orders.add(order);
    }

    public Order findById(Long id) {
        for (Order order : findAll()) {
            if (Objects.equals(order.getId(), id)) {
                return order;
            }
        }
        return null;
    }

    public List<Order> findAll() {
        return orders;
    }
}
