package app.menu;

import java.math.BigDecimal;

public abstract class MenuItem {
    protected String name;
    protected BigDecimal price;

    protected MenuItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}