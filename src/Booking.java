import java.util.ArrayList;

public class Booking {

    private Vehicle vehicle;

    public Booking(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        String string;
        string = "Vehicle detail:" + vehicle;
        return string;
    }

}