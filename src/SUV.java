public class SUV extends Vehicle {
    private int seats;
    private final EngineType ENGINETYPE;

    public SUV(double price, String brand, int year, int seats, EngineType ENGINETYPE) {
        super(price, brand, year);
        this.seats = seats;
        this.ENGINETYPE = ENGINETYPE;
    }

    @Override
    public String toString() {
        String string;
        string = super.toString() + "\nSeats: " + seats + "\nEngine Type: " + ENGINETYPE;
        return string;
    }

}