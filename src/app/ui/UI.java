package app.ui;

import app.builder.DrinkBuilder;
import app.builder.LunchBuilder;
import app.builder.OrderBuilder;
import app.model_interface.CourseItem;
import app.model_interface.DessertItem;
import app.drink.DrinkAdditiveCollection;
import app.drink.DrinkCollection;
import app.model.Order;
import app.service.MenuService;
import app.service.OrderService;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class UI {
    public static final String YES = "yes";
    private final MenuService menuService;
    private final OrderService orderService;
    private final Scanner scanner;

    public UI() {
        menuService = new MenuService();
        scanner = new Scanner(System.in);
        orderService = new OrderService();
    }

    public void start() {
        menuService.initMenu();
        System.out.println("Welcome to the restaurant.");

        System.out.print("Do you want to eat?(yes/no): ");
        String lunchChoose = scanner.nextLine();

        OrderBuilder orderBuilder = new OrderBuilder();
        BigDecimal currentOrderPrice = BigDecimal.ZERO;

        if (lunchChoose.equalsIgnoreCase(YES)) {

            LunchBuilder lunchBuilder = new LunchBuilder();

            System.out.println("Can you choose a cuisine?");
            List<String> cuisineType = menuService.getCuisineType();
            showCuisineType(cuisineType);

            System.out.print("Select cuisine: ");
            String cuisineChoose = scanner.nextLine();

            System.out.println("What do want for main curse?");
            List<CourseItem> mainCourseRequiredCuisine = menuService.getMainCurseRequiredCuisine(cuisineChoose);
            showMainCurseCuisine(mainCourseRequiredCuisine);

            System.out.print("Select main course: ");
            String mainCourseSelect = scanner.nextLine();

            CourseItem mainCourseByName = menuService.getMainCourseByName(cuisineChoose, mainCourseSelect);

            System.out.println("What do you want for dessert?");
            List<DessertItem> dessertRequiredCuisine = menuService.getDessertRequiredCuisine(cuisineChoose);
            showDessertCuisine(dessertRequiredCuisine);

            System.out.print("Select dessert: ");
            String dessertSelection = scanner.nextLine();

            DessertItem dessertByName = menuService.getDessertByName(cuisineChoose, dessertSelection);
            lunchBuilder.addMainCourse(mainCourseByName)
                    .addDessert(dessertByName)
                    .build();

            orderBuilder.addLunch(lunchBuilder.build());
            currentOrderPrice = currentOrderPrice.add(mainCourseByName.getPrice().add(dessertByName.getPrice()));
        }

        System.out.print("Do you want to drink?(yes/no): ");
        String selectedVariant = scanner.nextLine();

        if (selectedVariant.equalsIgnoreCase(YES)) {
            List<DrinkCollection> drinks = menuService.getDrinks();
            showDrinks(drinks);

            System.out.print("Select drink: ");
            String drinkChoose = scanner.nextLine();

            DrinkCollection drinkByName = menuService.getDrinkByName(drinkChoose);

            DrinkBuilder drinkBuilder = new DrinkBuilder();
            drinkBuilder.addDrink(drinkByName);

            System.out.print("Do you want additives for drink?(yes/no): ");
            String answerChoose = scanner.nextLine();
            if (answerChoose.equalsIgnoreCase(YES)) {
                List<DrinkAdditiveCollection> drinkAdditiveCollection = menuService.getDrinkAdditive();
                showAdditives(drinkAdditiveCollection);

                boolean isChooseOver = false;

                while (!isChooseOver) {
                    System.out.print("Select additive: ");
                    String chooseAdditive = scanner.nextLine();
                    DrinkAdditiveCollection drinkAdditiveByName = menuService.getDrinkAdditiveByName(chooseAdditive);
                    drinkBuilder.addDrinkAdditive(drinkAdditiveByName);

                    System.out.print("Do you want more additives?(yes/no): ");
                    String chooseAnswer = scanner.nextLine();
                    if (chooseAnswer.equalsIgnoreCase("no")) {
                        isChooseOver = true;
                    }
                }
            }
            orderBuilder.addDrink(drinkBuilder.build());
            currentOrderPrice = currentOrderPrice.add(drinkByName.getPrice());
            orderBuilder.addPrice(currentOrderPrice);

        }

        Order currentOrder = orderBuilder.build();

        orderCheck(currentOrder);
    }

    private void orderCheck(Order currentOrder) {

        if (currentOrder.getDrink() != null || currentOrder.getLunch() != null) {
            orderService.create(currentOrder);
            System.out.println("Your order is done: ");
            showOrder(currentOrder);
        } else {
            System.out.println("You didn't order anything.");
        }
    }

    private void showCuisineType(List<String> cuisineType) {
        for (String cuisine : cuisineType) {
            System.out.println(cuisine);
        }
    }

    private void showMainCurseCuisine(List<CourseItem> courseItems) {
        for (CourseItem courseItem : courseItems) {
            System.out.println(courseItem.getName() + ", " + courseItem.getPrice());
        }
    }

    private void showDessertCuisine(List<DessertItem> dessertItems) {
        for (DessertItem dessertItem : dessertItems) {
            System.out.println(dessertItem.getName() + ", " + dessertItem.getPrice());
        }
    }

    private void showDrinks(List<DrinkCollection> drinkCollections) {
        for (DrinkCollection drinkCollection : drinkCollections) {
            System.out.println(drinkCollection.getName() + ", " + drinkCollection.getPrice());
        }
    }

    private void showAdditives(List<DrinkAdditiveCollection> drinkAdditiveCollections) {
        for (DrinkAdditiveCollection drinkAdditiveCollection : drinkAdditiveCollections) {
            System.out.println(drinkAdditiveCollection.getName());
        }
    }

    private void showOrder(Order order) {
        StringBuilder result = new StringBuilder();
        result.append(order.getId());
        if (order.getLunch() != null) {
            result.append(", ").append(order.getLunch());
        }
        if (order.getDrink() != null) {
            result.append(", ").append(order.getDrink());
        }
        result.append(" Total price: ").append(order.getPrice()).append(" USD");
        System.out.println(result);
    }
}