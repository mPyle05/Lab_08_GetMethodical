import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalPrice = 0.00;
        double itemPrice;
        boolean exit;
        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the items price", .50, 10.00);
            totalPrice = totalPrice + itemPrice;
            exit = SafeInput.getYNConfirm(in, "Would you like to continue? (Y/N)");

        } while (exit);

        System.out.printf("\nYour total price is: $%.2f", totalPrice);


    }
}
