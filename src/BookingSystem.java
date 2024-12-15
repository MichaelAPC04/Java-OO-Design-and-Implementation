import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookingSystem {

    // Array of type vehicle, declared as a field so other methods here can access it.
    private Vehicle[] arrayOfVehicles;

    public void printStatus() {
        System.out.println("\nWelcome to the FIT2099 Booking System");

        createVehicles();
        //displayVehicles();
        addBookingForVehicle();

        // Vehicle vehicle = new Vehicle(80000, "BMW", 2000);
        // System.out.println(vehicle);

        System.out.println("Thank you for visiting FIT2099 Booking System!");
    }

    public void createVehicles() {
        // Initialise different vehicle objects.
        Sedan sedan1 = new Sedan(200, "Lexus", 2023, 500, Vehicle.EngineType.ELECTRIC);
        Sedan sedan2 = new Sedan(150, "BMW", 2022, 600, Vehicle.EngineType.PETROL);

        SUV suv1 = new SUV(300, "Tesla", 2023, 5, Vehicle.EngineType.ELECTRIC);
        SUV suv2 = new SUV(500, "Mercedes", 2020, 7, Vehicle.EngineType.DIESEL);

        Truck truck1 = new Truck(400, "Ford", 2019, 1);
        Truck truck2 = new Truck(450, "Volkswagen", 2020, 1.2);

        // Initialise vehicle array with the 6 new vehicles above.
        arrayOfVehicles = new Vehicle[]{sedan1, sedan2, suv1, suv2, truck1, truck2};

    }

//    public void displayVehicles() {
//        for(int i = 0; i < arrayOfVehicles.length; i++) {
//            System.out.println("\nBooking Item " + "(" + (i + 1) + ")");   // Keep track of item number starting from 1.
//            System.out.println(arrayOfVehicles[i]);   // Print each array (vehicle) item that has been iterated over.
//        }
//
//    }

    public void addBookingForVehicle(){
            List<Action> actions = new ArrayList<>();
            // Create a new user instance and pass it where the "this" error is (outside for loop as you dont want 6 users)

            for (Vehicle arrayOfVehicle : arrayOfVehicles) {
                Booking booking = new Booking(arrayOfVehicle);
                AddBookingAction addBookingAction = new AddBookingAction(booking);
                actions.add(addBookingAction);
            }

            System.out.println("#########################################");
            Action action = Menu.showMenu(actions);
            System.out.println(action.execute(this));

    }

}