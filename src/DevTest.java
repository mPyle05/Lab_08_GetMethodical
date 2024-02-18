import java.util.Scanner;
public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        double age = 0;
        boolean yesNo;
        String regEx;
        //firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        //lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        //age = SafeInput.getInt(in, "Whats your age?");
        //yesNo = SafeInput.getYNConfirm(in, "Please enter y/n");
        regEx = SafeInput.getRegExString(in, "Enter regEx", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("\nYour age is " + regEx);
    }
}
