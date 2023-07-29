package app;

import app.menu.cuisine.Cuisine;
import app.repository.CuisineRepository;

public class Test {
    public static void main(String[] args) {
        CuisineRepository cuisineRepository = new CuisineRepository();
        for (Cuisine<?, ?> cuisine : cuisineRepository.findAll()) {
            System.out.println(cuisine.toString());
        }}
}
