package app.repository;

import app.menu.cuisine.drinks.DrinkAdditives;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrinkAdditivesRepository {
    private final List<DrinkAdditives> drinkAdditives;

    public DrinkAdditivesRepository() {
        drinkAdditives = new ArrayList<>();
        drinkAdditives.addAll(Arrays.asList(DrinkAdditives.values()));
    }

    public List<DrinkAdditives> findAll() {
        return drinkAdditives;
    }
}