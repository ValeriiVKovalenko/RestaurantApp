package app.menu;


import java.math.BigDecimal;

public class MainCourseItem extends MenuItem {
    protected MainCourseItem(String name, BigDecimal price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "MainCourse{" +
               "name='" + name + '\'' +
               ", price=" + price +
               '}';
    }
}