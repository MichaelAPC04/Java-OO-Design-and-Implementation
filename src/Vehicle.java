import java.util.ArrayList;
import java.util.List;

public class Vehicle implements ActionCapable{
    private double price;   // Declare price, brand, year, EngineType enum (called in child classes) fields.
    private String brand;
    private int year;

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        Booking booking = new Booking(this);
        actions.add(new AddBookingAction(booking));
        return actions;
    }

    public enum EngineType {
        PETROL,
        ELECTRIC,
        DIESEL
    }

    /**
     * Vehicle class constructor.
     * @param price a car's price.
     * @param brand a car's brand.
     * @param year a car's make year.
     */
    public Vehicle(double price, String brand, int year) {
        this.price = price;
        this.brand = brand;
        this.year = year;
    }

    /**
     * toString method to print passed constructor parameters as a string.
     * @return string of the car objects' brand, year, price
     */
    @Override
    public String toString() {
        String string;
        string = "\nBrand: " + brand + "\nYear: " + year + "\nPrice: $" + String.format("%.2f", price) + " per day";
        return string;
    }

}