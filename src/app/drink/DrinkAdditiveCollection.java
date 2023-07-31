package app.drink;

public enum DrinkAdditiveCollection {
    ICE("Ice"),
    LEMON("Lemon");

    private final String name;

    DrinkAdditiveCollection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}