public class AddBookingAction implements Action {

    private Booking myBooking;

    public AddBookingAction(Booking myBooking){
        this.myBooking = myBooking;
    }

    @Override
    public String execute(User user, BookingSystem bookingSystem) {
        user.addBookings(myBooking);
        return myBooking + "\nis successfully added to the Booking System!";
    }

    @Override
    public String menuDescription() {
        return "Add the following vehicle to the Booking System:\n" + myBooking;
    }

}