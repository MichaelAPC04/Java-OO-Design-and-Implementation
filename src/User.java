import java.util.ArrayList;
import java.util.List;

public class User implements ActionCapable {

    private double Balance;
    private boolean isUserDone = false;
    private ArrayList<Booking> bookings = new ArrayList<Booking>();

    public void addBookings(Booking myBooking) {
        bookings.add(myBooking);

    }

    // Change arrayOfVehicles to bookings (use the arraylist instead of the array)
    public void displayVehicles() {
        for(int i = 0; i < bookings.size(); i++) {
            System.out.println("\nBooking Item " + "(" + (i + 1) + ")");   // Keep track of item number starting from 1.
            System.out.println(bookings.get(i));   // Print each array (vehicle) item that has been iterated over.
        }

    }

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        Booking booking = new Booking(this);
        actions.add(new AddBookingAction(booking));
        return actions;
    }

    public double getBalance() {
        return Balance;
    }

    public boolean getIsUserDone() {
        return isUserDone;
    }

    public void setIsUserDone(boolean userDone) {
        isUserDone = userDone;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

}