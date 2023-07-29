package app.menu.cuisine;

import app.Dessert;
import app.MainCourse;

import java.util.ArrayList;
import java.util.List;

public class Cuisine<T extends Enum<T> & MainCourse, U extends Enum<U> & Dessert>{
    private final List<T> mainCourseCuisines;
    private final List<U> dessertCuisines;
    private final String name;

    public Cuisine(String name) {
        this.name = name;
        mainCourseCuisines = new ArrayList<>();
        dessertCuisines = new ArrayList<>();
    }

    public void addMainCourse(T mainCourse) {
        mainCourseCuisines.add(mainCourse);
    }

    public void addDessert(U dessert) {
        dessertCuisines.add(dessert);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cuisine{" +
               "mainCourseCuisines=" + mainCourseCuisines +
               ", dessertCuisines=" + dessertCuisines +
               ", name='" + name + '\'' +
               '}';
    }
}