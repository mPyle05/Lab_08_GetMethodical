import java.util.Scanner;

public class FavNumbers {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favInt;
        double favDouble;
        favInt = SafeInput.getInt(in, "Enter your favorite int");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("\nYour fav int is: " + favInt + " and fav double is " + favDouble);
    }
}
