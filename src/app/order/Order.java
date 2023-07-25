package app.order;

import app.menu.cuisine.Cuisine;
import app.menu.Drink;
import app.menu.Lunch;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Lunch> lunches;
    private final List<Drink> drinks;
    private Cuisine cuisine;

    public Cuisine getCuisine() {
        return cuisine;
    }

    public void setCuisine(Cuisine cuisine) {
        this.cuisine = cuisine;
    }

    public Order() {
        lunches = new ArrayList<>();
        drinks = new ArrayList<>();
    }

    public void addLunch(Lunch lunch) {
        lunches.add(lunch);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public BigDecimal getLunchesPrice() {
        BigDecimal total = BigDecimal.ZERO;

        for (Lunch lunch : lunches) {
            total = total.add(lunch.getTotalPrice());
        }

        return total;
    }

    public BigDecimal getDrinksPrice() {
        BigDecimal total = BigDecimal.ZERO;

        for (Drink drink : drinks) {
            total = total.add(drink.getPrice());
        }

        return total;
    }

    public List<Lunch> getLunches() {
        return lunches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    @Override
    public String toString() {
        return "Order{" +
               "lunches=" + lunches +
               ", drinks=" + drinks +
               '}';
    }
}