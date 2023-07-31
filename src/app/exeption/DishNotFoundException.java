package app.exeption;

public class DishNotFoundException extends RuntimeException {
    public static final String IS_NOT_FOUND = " is not found.";
    public DishNotFoundException(String message) {
        super(message + IS_NOT_FOUND);
    }
}