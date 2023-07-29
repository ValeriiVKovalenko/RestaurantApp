package app.menu;

import app.menu.cuisine.drinks.DrinkAdditives;

import java.math.BigDecimal;

public class DrinkItem extends MenuItem {
private DrinkAdditives drinkAdditives;
    public DrinkItem(String name, BigDecimal price) {
        super(name, price);
    }

    public DrinkAdditives getDrinkAdditives() {
        return drinkAdditives;
    }

    public void setDrinkAdditives(DrinkAdditives drinkAdditives) {
        this.drinkAdditives = drinkAdditives;
    }
}