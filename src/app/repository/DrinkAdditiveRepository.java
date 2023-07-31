package app.repository;

import app.drink.DrinkAdditiveCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrinkAdditiveRepository {
    private final List<DrinkAdditiveCollection> drinkAdditiveCollections;

    public DrinkAdditiveRepository() {
        drinkAdditiveCollections = new ArrayList<>();
        drinkAdditiveCollections.addAll(Arrays.asList(DrinkAdditiveCollection.values()));
    }

    public List<DrinkAdditiveCollection> findAll() {
        return drinkAdditiveCollections;
    }

    public DrinkAdditiveCollection findByName(String drinkAdditiveName) {
        List<DrinkAdditiveCollection> all = findAll();
        for (DrinkAdditiveCollection drinkAdditiveCollection : all) {
            if (drinkAdditiveCollection.getName().equalsIgnoreCase(drinkAdditiveName)) {
                return drinkAdditiveCollection;
            }
        }
        return null;
    }
}