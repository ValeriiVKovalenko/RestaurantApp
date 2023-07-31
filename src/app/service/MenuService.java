package app.service;

import app.cuisine.Cuisine;
import app.model_interface.CourseItem;
import app.model_interface.DessertItem;
import app.drink.DrinkAdditiveCollection;
import app.drink.DrinkCollection;
import app.exeption.DishNotFoundException;
import app.model.Menu;
import app.repository.CuisineRepository;
import app.repository.DrinkAdditiveRepository;
import app.repository.DrinkRepository;

import java.util.ArrayList;
import java.util.List;

public class MenuService {
    private final CuisineRepository cuisineRepository;
    private final DrinkRepository drinkRepository;
    private final DrinkAdditiveRepository drinkAdditiveRepository;
    private final Menu menu;

    public MenuService() {
        cuisineRepository = new CuisineRepository();
        drinkRepository = new DrinkRepository();
        drinkAdditiveRepository = new DrinkAdditiveRepository();
        menu = new Menu();
    }

    public void initMenu() {
        List<Cuisine> cuisines = cuisineRepository.findAll();
        for (Cuisine cuisine : cuisines) {
            menu.getLunches().add(cuisine);
        }
        List<DrinkCollection> drinkCollections = drinkRepository.findAll();
        for (DrinkCollection drink : drinkCollections) {
            menu.getDrinks().add(drink);
        }
        List<DrinkAdditiveCollection> drinkAdditiveCollections = drinkAdditiveRepository.findAll();
        for (DrinkAdditiveCollection drinkAdditiveCollection : drinkAdditiveCollections) {
            menu.getDrinkAdditives().add(drinkAdditiveCollection);
        }
    }

    public List<String> getCuisineType() {
        List<String> cuisinesTypes = new ArrayList<>();
        List<Cuisine> cuisines = cuisineRepository.findAll();
        for (Cuisine cuisine : cuisines) {
            cuisinesTypes.add(cuisine.getName());
        }
        return cuisinesTypes;
    }

    public List<CourseItem> getMainCurseRequiredCuisine(String requiredCuisine) {
        List<Cuisine> cuisines = cuisineRepository.findAll();

        if (cuisines != null) {
            for (Cuisine cuisine : cuisines) {
                if (cuisine.getName().equalsIgnoreCase(requiredCuisine)) {
                    return cuisine.getMainCourses();
                }
            }
        }

        throw new DishNotFoundException(requiredCuisine);
    }

    public List<DessertItem> getDessertRequiredCuisine(String requiredCuisine) {
        List<Cuisine> cuisines = cuisineRepository.findAll();

        if (cuisines != null) {
            for (Cuisine cuisine : cuisines) {
                if (cuisine.getName().equalsIgnoreCase(requiredCuisine)) {
                    return cuisine.getDesserts();
                }
            }
        }

        throw new DishNotFoundException(requiredCuisine);

    }

    public CourseItem getMainCourseByName(String cuisine, String clientMainCourse) {
        CourseItem mainCurseByName = cuisineRepository.findMainCurseByName(cuisine, clientMainCourse);

        if (mainCurseByName != null) {
            return mainCurseByName;
        }

        throw new DishNotFoundException(clientMainCourse);
    }

    public DessertItem getDessertByName(String cuisine, String clientDessert) {
        DessertItem dessertByName = cuisineRepository.findDessertByName(cuisine, clientDessert);

        if (dessertByName != null) {
            return dessertByName;
        }

        throw new DishNotFoundException(clientDessert);
    }

    public List<DrinkCollection> getDrinks() {
        return drinkRepository.findAll();
    }

    public DrinkCollection getDrinkByName(String drinkName) {
        DrinkCollection drinkByName = drinkRepository.findByName(drinkName);
        if (drinkByName != null) {
            return drinkByName;
        }
        throw new DishNotFoundException(drinkName);
    }

    public List<DrinkAdditiveCollection> getDrinkAdditive() {
        return drinkAdditiveRepository.findAll();
    }

    public DrinkAdditiveCollection getDrinkAdditiveByName(String drinkAdditiveName) {
        DrinkAdditiveCollection drinkAdditiveByName = drinkAdditiveRepository.findByName(drinkAdditiveName);
        if (drinkAdditiveByName != null) {
            return drinkAdditiveByName;
        }
        throw new DishNotFoundException(drinkAdditiveName);
    }
}