package app.repository;

import app.drink.DrinkCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrinkRepository {
    private final List<DrinkCollection> drinks;

    public DrinkRepository() {
        drinks = new ArrayList<>();
        drinks.addAll(Arrays.asList(DrinkCollection.values()));
    }

    public List<DrinkCollection> findAll() {
        return drinks;
    }

    public DrinkCollection findByName(String drinkName) {
        List<DrinkCollection> drinkCollections = findAll();
        for (DrinkCollection drinkCollection : drinkCollections) {
            if (drinkCollection.getName().equalsIgnoreCase(drinkName)) {
                return drinkCollection;
            }
        }
        return null;
    }
}