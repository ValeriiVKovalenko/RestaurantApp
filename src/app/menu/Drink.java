package app.menu;

import app.menu.MenuItem;

import java.math.BigDecimal;

public class Drink extends MenuItem {
    private boolean hasIceCubes;
    private boolean hasLemon;

    public Drink(String name, BigDecimal price) {
        super(name, price);
    }

    public boolean getIceCubes() {
        return hasIceCubes;
    }

    public boolean getLemon() {
        return hasLemon;
    }

    @Override
    public String toString() {
        return "Drink{" +
               "hasIceCubes=" + hasIceCubes +
               ", hasLemon=" + hasLemon +
               '}';
    }

    public void setIceCubes(boolean hasIceCubes) {
        this.hasIceCubes = hasIceCubes;
    }

    public void setLemon(boolean hasLemon) {
        this.hasLemon = hasLemon;
    }
}