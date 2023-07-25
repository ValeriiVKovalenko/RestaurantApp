package app.order;

import app.menu.Drink;
import app.menu.Lunch;
import app.menu.MenuItem;

public class OrderBuilderImpl implements OrderBuilder {
    private final Order order;

    public OrderBuilderImpl() {
        order = new Order();
    }

    @Override
    public OrderBuilder addMainMenu(MenuItem mainCourse) {
        order.addLunch(new Lunch(mainCourse, null));
        return this;
    }

    @Override
    public OrderBuilder addDessert(MenuItem dessert) {
        Lunch currentLunch = order.getLunches().get(order.getLunches().size() - 1);
        currentLunch.setDesserts(dessert);
        return this;
    }

    @Override
    public OrderBuilder addDrink(Drink drink) {
        order.addDrink(drink);
        return this;
    }

    @Override
    public OrderBuilder addIceCubes() {
        Drink currentDrink = order.getDrinks().get(order.getDrinks().size() - 1);
        currentDrink.setIceCubes(true);
        return this;
    }

    @Override
    public OrderBuilder addLemon() {
        Drink currentDrink = order.getDrinks().get(order.getDrinks().size() - 1);
        currentDrink.setLemon(true);
        return this;
    }

    @Override
    public Order build() {
        return order;
    }
}