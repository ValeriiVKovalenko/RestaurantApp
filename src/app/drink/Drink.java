package app.drink;

import java.util.ArrayList;
import java.util.List;

public class Drink {
    private DrinkCollection drinkCollection;
    private final List<DrinkAdditiveCollection> drinkAdditiveCollection;

    public Drink() {
        drinkAdditiveCollection = new ArrayList<>();
    }

    public DrinkCollection getDrinkCollection() {
        return drinkCollection;
    }

    public void setDrinkCollection(DrinkCollection drinkCollection) {
        this.drinkCollection = drinkCollection;
    }

    public void setDrinkAdditive(DrinkAdditiveCollection drinkAdditive) {
        drinkAdditiveCollection.add(drinkAdditive);
    }

    @Override
    public String toString() {
        return drinkCollection.getName() +
               " with " + drinkAdditiveCollection +
               '}';
    }
}