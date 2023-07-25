package app.menu.cuisine;

import java.math.BigDecimal;

public abstract class Cuisine {
    protected String name;
    protected Cuisine(String name) {
        this.name = name;
    }

    public abstract MainCourse createMainCourse(String name, BigDecimal price);

    public abstract Dessert createDessert(String name, BigDecimal price);

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cuisine{" +
               "name='" + name + '\'' +
               '}';
    }
}