package app.cuisine;

import app.model_interface.CourseItem;

import java.math.BigDecimal;

public enum MexicanCourse implements CourseItem {
    MEXICAN_SOUP("mexican soup", BigDecimal.valueOf(22.1));

    private final String name;
    private final BigDecimal price;

    MexicanCourse(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
