public class Truck extends Vehicle {
    private double loading;

    public Truck(double price, String brand, int year, double loading) {
        super(price, brand, year);
        this.loading = loading;
    }

    @Override
    public String toString() {
        String string;
        string = super.toString() + "\nLoading: " + loading;
        return string;
    }

}