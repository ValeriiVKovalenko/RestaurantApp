package app.order;

/*
    public BigDecimal getLunchesPrice() {
        BigDecimal total = BigDecimal.ZERO;

        for (Lunch lunch : lunches) {
            total = total.add(lunch.getTotalPrice());
        }

        return total;
    }

    public BigDecimal getDrinksPrice() {
        BigDecimal total = BigDecimal.ZERO;

        for (Drink drink : drinks) {
            total = total.add(drink.getPrice());
        }

        return total;
    }
 */

public class OrderBuilder {
    private final Order order;

    public OrderBuilder() {
        order = new Order();
    }

//    public OrderBuilder addMainMenu(MenuItem mainCourse) {
//        order.addLunch(new Lunch(mainCourse, null));
//        return this;
//    }
//
//    public OrderBuilder addDessert(MenuItem dessert) {
//        Lunch currentLunch = order.getLunches().get(order.getLunches().size() - 1);
//        currentLunch.setDesserts(dessert);
//        return this;
//    }
//
//    public OrderBuilder addDrink(Drink drink) {
//        order.addDrink(drink);
//        return this;
//    }
    public Order build() {
        return order;
    }
}