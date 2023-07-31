package app.cuisine;


import app.model_interface.CourseItem;
import app.model_interface.DessertItem;

import java.util.List;

public class Cuisine {
    private final List<CourseItem> mainCourses;
    private final List<DessertItem> desserts;
    private final String name;

    public Cuisine(List<CourseItem> mainCourses, List<DessertItem> desserts, String name) {
        this.mainCourses = mainCourses;
        this.desserts = desserts;
        this.name = name;
    }

    public List<CourseItem> getMainCourses() {
        return mainCourses;
    }

    public List<DessertItem> getDesserts() {
        return desserts;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cuisine{" +
               "mainCourses=" + mainCourses +
               ", desserts=" + desserts +
               ", name='" + name + '\'' +
               '}';
    }
}