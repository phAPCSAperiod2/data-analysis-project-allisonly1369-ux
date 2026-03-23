/**
 * Main application class used to test the CountryData class.
 */
public class App {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create a sample CountryData object
        CountryData data = new CountryData(
                "Canada",
                2020,
                1640000000000.0,
                38000000,
                550.5,
                84.0,
                80.0
        );

        // Display object using toString()
        System.out.println(data);

        // Access individual fields
        System.out.println("Country: " + data.getCountry());
        System.out.println("Year: " + data.getYear());
        System.out.println("Average Life Expectancy: " + data.getAverageLifeExpectancy());
    }
}