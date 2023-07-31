package app.repository;

import app.cuisine.*;
import app.model_interface.CourseItem;
import app.model_interface.DessertItem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CuisineRepository {
    private final List<Cuisine> cuisines;

    public CuisineRepository() {
        cuisines = new ArrayList<>();

        List<CourseItem> polishMainCourses = Arrays.asList(PolishCourse.values());
        List<DessertItem> polishDesserts = Arrays.asList(PolishDessert.values());
        cuisines.add(new Cuisine(polishMainCourses, polishDesserts, "polish"));

        List<CourseItem> mexicanCourses = Arrays.asList(MexicanCourse.values());
        List<DessertItem> mexicanDesserts = Arrays.asList(MexicanDessert.values());
        cuisines.add(new Cuisine(mexicanCourses, mexicanDesserts, "mexican"));

        List<CourseItem> italianCourses = Arrays.asList(ItalianCourse.values());
        List<DessertItem> italianDesserts = Arrays.asList(ItalianDessert.values());
        cuisines.add(new Cuisine(italianCourses, italianDesserts, "italian"));
    }

    public List<Cuisine> findAll() {
        return cuisines;
    }

    public CourseItem findMainCurseByName(String cuisine, String clientMainCurse) {
        List<Cuisine> all = findAll();
        for (Cuisine cuisine1 : all) {
            if (cuisine1.getName().equalsIgnoreCase(cuisine)) {
                for (CourseItem courseItem : cuisine1.getMainCourses()) {
                    if (courseItem.getName().equalsIgnoreCase(clientMainCurse)) {
                        return courseItem;
                    }
                }
            }
        }
        return null;
    }

    public DessertItem findDessertByName(String cuisine, String clientMainCurse) {
        List<Cuisine> all = findAll();
        for (Cuisine cuisine1 : all) {
            if (cuisine1.getName().equalsIgnoreCase(cuisine)) {
                for (DessertItem dessertItem : cuisine1.getDesserts()) {
                    if (dessertItem.getName().equalsIgnoreCase(clientMainCurse)) {
                        return dessertItem;
                    }
                }
            }
        }
        return null;
    }
}