import java.util.Scanner;

public class Reggie {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ssn;
        String uc;
        String menu;

        ssn = SafeInput.getRegExString(in, "Enter SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        uc = SafeInput.getRegExString(in, "Enter UC Student M number", "^(M|m)\\d{5}$");
        menu = SafeInput.getRegExString(in, "Enter Menu Choice (O,S,V,Q)", "^[OoSsVvQq]$");
        System.out.println("\nYour ssn is " + ssn);
        System.out.println("\nYour UC M ID is " + uc);
        System.out.println("\nYour menu choice is " + menu);
    }
}
