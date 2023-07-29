package app.menu;


import java.math.BigDecimal;

public class DessertItem extends MenuItem {
    protected DessertItem(String name, BigDecimal price) {
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