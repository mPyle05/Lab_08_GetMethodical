public class CtoFTableDisplay {

    public static void main(String[] args) {
        // Display the table header
        System.out.println("Celsius\tFahrenheit");

        // Loop through Celsius values from -100 to 100 in 1 degree increments
        for (int celsius = -100; celsius <= 100; celsius++) {
            // Call the method to compute the equivalent Fahrenheit value
            double fahrenheit = CtoF(celsius);
            // Display the Celsius and Fahrenheit values in tabular format
            System.out.println(celsius + "\t" + fahrenheit);
        }
    }

    /**
     * Converts Celsius temperature to Fahrenheit.
     *
     * @param celsius the temperature in Celsius
     * @return the equivalent temperature in Fahrenheit
     */
    public static double CtoF(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
