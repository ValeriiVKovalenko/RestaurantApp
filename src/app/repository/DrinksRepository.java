package app.repository;

import app.menu.cuisine.drinks.Drinks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DrinksRepository {
    private final List<Drinks> drinks;

    public DrinksRepository() {
        drinks = new ArrayList<>();
        drinks.addAll(Arrays.asList(Drinks.values()));
    }

    public List<Drinks> findAll() {
        return drinks;
    }
}