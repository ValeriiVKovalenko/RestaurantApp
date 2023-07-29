package app.repository;

import app.menu.cuisine.Cuisine;
import app.menu.cuisine.italian.ItalianCourse;
import app.menu.cuisine.italian.ItalianDessert;
import app.menu.cuisine.mexican.MexicanCourse;
import app.menu.cuisine.mexican.MexicanDessert;
import app.menu.cuisine.polish.PolishCourse;
import app.menu.cuisine.polish.PolishDessert;

import java.util.ArrayList;
import java.util.List;

public class CuisineRepository {
    private final List<Cuisine<?, ?>> cuisines;

    public CuisineRepository() {
        cuisines = new ArrayList<>();
        Cuisine<ItalianCourse, ItalianDessert> italianCuisine = new Cuisine<>("Italian cuisine");
        for (ItalianCourse value : ItalianCourse.values()) {
            italianCuisine.addMainCourse(value);
        }

        for (ItalianDessert value : ItalianDessert.values()) {
            italianCuisine.addDessert(value);
        }

        Cuisine<PolishCourse, PolishDessert> polishCuisine = new Cuisine<>("Polish cuisine");
        for (PolishCourse value : PolishCourse.values()) {
            polishCuisine.addMainCourse(value);
        }
        for (PolishDessert value : PolishDessert.values()) {
            polishCuisine.addDessert(value);
        }

        Cuisine<MexicanCourse, MexicanDessert> mexicanCuisine = new Cuisine<>("Mexican cuisine");
        for (MexicanCourse value : MexicanCourse.values()) {
            mexicanCuisine.addMainCourse(value);
        }
        for (MexicanDessert value : MexicanDessert.values()) {
            mexicanCuisine.addDessert(value);
        }

        cuisines.add(italianCuisine);
        cuisines.add(polishCuisine);
        cuisines.add(mexicanCuisine);
    }

    public List<Cuisine<?, ?>> findAll() {
        return cuisines;
    }
}