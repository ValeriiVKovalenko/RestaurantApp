package app.menu.cuisine;


import app.menu.MenuItem;

import java.math.BigDecimal;

public class Dessert extends MenuItem {
    protected Dessert(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Dessert{" +
               "name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}