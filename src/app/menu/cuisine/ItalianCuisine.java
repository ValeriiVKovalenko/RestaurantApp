package app.menu.cuisine;

import java.math.BigDecimal;

public class ItalianCuisine extends Cuisine {
    public ItalianCuisine() {
        super("Italian");
    }

    @Override
    public MainCourse createMainCourse(String name, BigDecimal price) {
        return new MainCourse(name, price);
    }

    @Override
    public Dessert createDessert(String name, BigDecimal price) {
        return new Dessert(name, price);
    }
}