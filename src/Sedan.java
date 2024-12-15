public class Sedan extends Vehicle {
    private int range;

    // Declare ENGINETYPE of type EngineType (enum) from parent class, final as enum values will not change.
    private final EngineType ENGINETYPE;

    public Sedan(double price, String brand, int year, int range, EngineType ENGINETYPE) {
        super(price, brand, year);   // Call parent Vehicle class constructor parameters.
        this.range = range;
        this.ENGINETYPE = ENGINETYPE;
    }

    /**
     * toString method to print Sedan class specific values passed to its constructor.
     * Call Vehicle parent class toString to avoid code duplication.
     * @return string of Sedan's price, brand, year, range, engine type.
     */
    @Override
    public String toString() {
        String string;
        string = super.toString() + "\nRange: " + range + " km" + "\nEngine Type: " + ENGINETYPE;
        return string;

    }

}