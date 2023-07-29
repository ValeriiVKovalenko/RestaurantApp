package app.ui;

import app.menu.*;
import app.menu.cuisine.*;
import app.order.Order;
import app.order.OrderBuilder;

import java.math.BigDecimal;
import java.util.Scanner;

public class UI {
    private final Scanner scanner;

    public UI() {
        scanner = new Scanner(System.in);
    }

    public void start() {
//        System.out.println("Welcome to the restaurant!");
//
//        OrderBuilder builder = new OrderBuilder();
//        addItemsToOrder(scanner, builder);
//
//        Order order = builder.build();
//
//        if (order.getLunches().isEmpty()) {
//            BigDecimal drinksPrice = order.getDrinksPrice();
//            System.out.println("Total price is: " + drinksPrice + "₴");
//        } else {
//            BigDecimal total = order.getDrinksPrice().add(order.getLunchesPrice());
//            System.out.println("Total price is: " + total + "₴");
//        }
////        System.out.println(order);
//    }
//
//    private void addItemsToOrder(Scanner scanner, OrderBuilder builder) {
//        System.out.print("Do you want to order a lunch?(yes/no): ");
//        String lunchChoice = scanner.nextLine();
//        if (lunchChoice.equalsIgnoreCase("yes")) {
//            Cuisine cuisine = selectCuisine(scanner);
//            if (cuisine != null) {
//                addLunchToOrder(scanner, builder, cuisine);
//            }
//        }
//
//        System.out.print("Do you want to order a drink?(yes/no): ");
//        String drinkChoice = scanner.nextLine();
//        if (drinkChoice.equalsIgnoreCase("yes")) {
//            addDrinkToOrder(scanner, builder);
//        }
//    }
//
//    private void addDrinkToOrder(Scanner scanner, OrderBuilder builder) {
//        System.out.print("Enter the name of the drink: ");
//        String drinkName = scanner.nextLine();
//        System.out.print("Enter the price of the drink: ");
//        BigDecimal drinkPrice = scanner.nextBigDecimal();
//        scanner.nextLine();
//
//        Drink drink = new Drink(drinkName, drinkPrice);
//        builder.addDrink(drink);
//
//        System.out.println("Do you want ice cubes in your drink? (yes/no)");
//        String drinkWithIceCubes = scanner.nextLine();
//        if (drinkWithIceCubes.equalsIgnoreCase("yes")) {
//            builder.addIceCubes();
//        }
//
//        System.out.println("Do you want lemon in your drink? (yes/no)");
//        String drinkWithLemon = scanner.nextLine();
//        if (drinkWithLemon.equalsIgnoreCase("yes")) {
//            builder.addLemon();
//        }
//    }
//
//    private void addLunchToOrder(Scanner scanner, OrderBuilder builder, Cuisine cuisine) {
//        System.out.print("Enter the name of the main cause: ");
//        String mainCauseName = scanner.nextLine();
//        System.out.print("Enter the price of the main cause: ");
//        BigDecimal mainCausePrice = scanner.nextBigDecimal();
//        scanner.nextLine();
//
//        MainCourse mainCourse = cuisine.createMainCourse(mainCauseName, mainCausePrice);
//        builder.addMainMenu(mainCourse);
//
//        System.out.print("Enter the name of the dessert: ");
//        String dessertName = scanner.nextLine();
//        System.out.print("Enter the price of the dessert: ");
//        BigDecimal dessertPrice = scanner.nextBigDecimal();
//        scanner.nextLine();
//
//        Dessert dessert = cuisine.createDessert(dessertName, dessertPrice);
//        builder.addDessert(dessert);
//    }
//
//    private Cuisine selectCuisine(Scanner scanner) {
//        System.out.println("Select a cuisine:");
//        System.out.println("1. Polish.");
//        System.out.println("2. Mexican.");
//        System.out.println("3. Italian.");
//        System.out.println("4. None.");
//        System.out.print("Select option: ");
//
//        int option = scanner.nextInt();
//        scanner.nextLine();
//
//        switch (option) {
//            case 1 -> {
//
//            }
//            case 2 -> {
//
//            }
//            case 3 -> {
//
//            }
//            default -> {
//                System.out.println("No cuisine.");
//                return null;
//            }
//        }
    }
}