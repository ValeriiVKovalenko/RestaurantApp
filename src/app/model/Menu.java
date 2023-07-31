package app.model;

import app.cuisine.Cuisine;
import app.drink.DrinkAdditiveCollection;
import app.drink.DrinkCollection;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final List<Cuisine> lunches;
    private final List<DrinkCollection> drinks;
    private final List<DrinkAdditiveCollection> drinkAdditiveCollections;

    public Menu() {
        lunches = new ArrayList<>();
        drinks = new ArrayList<>();
        drinkAdditiveCollections = new ArrayList<>();
    }

    public List<Cuisine> getLunches() {
        return lunches;
    }

    public List<DrinkCollection> getDrinks() {
        return drinks;
    }

    public List<DrinkAdditiveCollection> getDrinkAdditives() {
        return drinkAdditiveCollections;
    }
}
