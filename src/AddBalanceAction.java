import java.util.Scanner;

public class AddBalanceAction implements Action{
    @Override
    public String execute(User user, BookingSystem bookingSystem) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to add to your current balance: ");
        float balance = Float.parseFloat(scanner.nextLine());
        user.setBalance(balance);
        return String.format("%.2f is added to the user balance!", balance);
    }

    @Override
    public String menuDescription() {
        return "add balance.";
    }
}
