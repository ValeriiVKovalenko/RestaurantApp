package app.order;

import app.menu.Drink;
import app.menu.MenuItem;

public interface OrderBuilder {
    OrderBuilder addMainMenu(MenuItem mainCourse);
    OrderBuilder addDessert(MenuItem dessert);
    OrderBuilder addDrink(Drink drink);
    OrderBuilder addIceCubes();
    OrderBuilder addLemon();
    Order build();
}