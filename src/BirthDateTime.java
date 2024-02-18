import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hour;
        int minute;
        year = SafeInput.getRangedInt(in, "Enter your birth year (1950-2015)", 1950, 2015);
        month = SafeInput.getRangedInt(in, "Enter your birth month (1-12)", 1, 12);

        day = switch (month) {
            case 2 -> // February
                    SafeInput.getRangedInt(in, "Enter your birth day (1-29)", 1, 29);
            case 4, 6, 9, 11 -> // April, June, September, November
                    SafeInput.getRangedInt(in, "Enter your birth day (1-30)", 1, 30);
            default -> // January, March, May, July, August, October, December
                    SafeInput.getRangedInt(in, "Enter your birth day (1-31)", 1, 31);
        };
        hour = SafeInput.getRangedInt(in, "Enter your birth hour (1-24)", 1, 24);
        minute = SafeInput.getRangedInt(in, "Enter your birth minute (1-59)", 1, 59);

        System.out.println("Date and Time of Birth: " + year + "-" + month + "-" + day + " " + hour + ":" + minute);
    }
}
