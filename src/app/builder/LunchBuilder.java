package app.builder;

import app.model_interface.CourseItem;
import app.model_interface.DessertItem;
import app.model.Lunch;

public class LunchBuilder {
    private final Lunch lunch;

    public LunchBuilder() {
        lunch = new Lunch();
    }

    public LunchBuilder addMainCourse(CourseItem courseItem) {
        lunch.setCourseItem(courseItem);
        return this;
    }

    public LunchBuilder addDessert(DessertItem dessertItem) {
        lunch.setDessertItem(dessertItem);
        return this;
    }

    public Lunch build() {
        return lunch;
    }
}
