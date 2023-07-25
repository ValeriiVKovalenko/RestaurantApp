package app.menu;


import java.math.BigDecimal;

public class Lunch {
    private MenuItem mainCourse;
    private MenuItem desserts;

    public Lunch(MenuItem mainCourse, MenuItem desserts) {
        this.mainCourse = mainCourse;
        this.desserts = desserts;
    }

    public MenuItem getMainCourse() {
        return mainCourse;
    }

    public void setMainCourse(MenuItem mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setDesserts(MenuItem desserts) {
        this.desserts = desserts;
    }

    @Override
    public String toString() {
        return "Lunch{" +
               "mainCourse=" + mainCourse +
               ", desserts=" + desserts +
               '}';
    }

    public MenuItem getDesserts() {
        return desserts;
    }

    public BigDecimal getTotalPrice() {
        return mainCourse.getPrice().add(desserts.getPrice());
    }
}
