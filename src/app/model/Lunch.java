package app.model;

import app.model_interface.CourseItem;
import app.model_interface.DessertItem;

public class Lunch {
    private CourseItem courseItem;
    private DessertItem dessertItem;

    public CourseItem getCourseItem() {
        return courseItem;
    }

    public DessertItem getDessertItem() {
        return dessertItem;
    }

    public void setCourseItem(CourseItem courseItem) {
        this.courseItem = courseItem;
    }

    public void setDessertItem(DessertItem dessertItem) {
        this.dessertItem = dessertItem;
    }

    @Override
    public String toString() {
        return "Lunch{" +
               courseItem.getName() +
               ", " + dessertItem.getName() +
               '}';
    }
}