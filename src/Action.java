public interface Action {
    String execute(User user, BookingSystem bookingSystem);

    String menuDescription();

}