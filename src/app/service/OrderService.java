package app.service;

import app.model.Order;
import app.repository.OrderRepository;

public class OrderService {
    private OrderRepository orderRepository;

    public OrderService() {
        orderRepository = new OrderRepository();
    }

    public void create(Order order) {
        orderRepository.create(order);
    }

    public Order getById(Long id) {
        return orderRepository.findById(id);
    }

}
