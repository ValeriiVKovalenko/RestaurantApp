package app.builder;

import app.drink.Drink;
import app.model.Lunch;
import app.model.Order;

import java.math.BigDecimal;

public class OrderBuilder {
    private final Order order;

    public OrderBuilder() {
        order = new Order();
    }

    public OrderBuilder addLunch(Lunch lunch) {
        order.setLunch(lunch);
        return this;
    }

    public OrderBuilder addDrink(Drink drink) {
        order.setDrink(drink);
        return this;
    }

    public OrderBuilder addPrice(BigDecimal price) {
        order.setPrice(price);
        return this;
    }

    public Order build() {
        return order;
    }
}