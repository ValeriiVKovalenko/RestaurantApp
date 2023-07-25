package app.menu.cuisine;


import app.menu.MenuItem;

import java.math.BigDecimal;

public class MainCourse extends MenuItem {
    protected MainCourse(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "MainCourse{" +
               "name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}