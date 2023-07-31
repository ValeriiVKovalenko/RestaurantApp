package app.builder;

import app.drink.Drink;
import app.drink.DrinkAdditiveCollection;
import app.drink.DrinkCollection;

public class DrinkBuilder {
    private final Drink drink;

    public DrinkBuilder() {
        drink = new Drink();
    }

    public DrinkBuilder addDrink(DrinkCollection drinkCollection) {
        drink.setDrinkCollection(drinkCollection);
        return this;
    }

    public DrinkBuilder addDrinkAdditive(DrinkAdditiveCollection drinkAdditiveItem) {
        drink.setDrinkAdditive(drinkAdditiveItem);
        return this;
    }

    public Drink build() {
        return drink;
    }
}
