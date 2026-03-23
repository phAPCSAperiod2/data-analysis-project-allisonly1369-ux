/**
 * Represents one row of country statistics data from the dataset.
 *
 * Each object stores economic, demographic, and social indicators
 * for a specific country in a specific year.
 *
 * attributes include:
 * - Country name
 * - Year
 * - GDP
 * - Population Total
 * - Life Expectancy (Female & Male)
 * - CO2 Emissions
 *
 * This class provides getter methods and a readable toString() method
 * for displaying country information.
 */
public class CountryData {

    /** The name of the country */
    private String country;

    /** The year of the data record */
    private int year; // FIXED: changed from String to int

    /** Gross Domestic Product (GDP) */
    private double gdp;

    /** Total population of the country */
    private long populationTotal;

    /** CO2 emissions */
    private double co2Emissions;

    /** Life expectancy of females */
    private double lifeExpectancyFemale;

    /** Life expectancy of males */
    private double lifeExpectancyMale;

    /**
     * Constructs a CountryData object with all attributes initialized.
     *
     * @param country Name of the country
     * @param year Year of the data record
     * @param gdp Gross Domestic Product
     * @param populationTotal Total population
     * @param co2Emissions CO2 emissions value
     * @param lifeExpectancyFemale Female life expectancy
     * @param lifeExpectancyMale Male life expectancy
     */
    public CountryData(String country, int year, double gdp, long populationTotal,
                       double co2Emissions, double lifeExpectancyFemale,
                       double lifeExpectancyMale) {

        if (country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Country cannot be empty");
        }

        this.country = country;
        this.year = year;
        this.gdp = gdp;
        this.populationTotal = populationTotal;
        this.co2Emissions = co2Emissions;
        this.lifeExpectancyFemale = lifeExpectancyFemale;
        this.lifeExpectancyMale = lifeExpectancyMale;
    }

    /** @return country name */
    public String getCountry() {
        return country;
    }

    /** @return year of the record */
    public int getYear() {
        return year;
    }

    /** @return GDP value */
    public double getGdp() {
        return gdp;
    }

    /** @return population total */
    public long getPopulationTotal() {
        return populationTotal;
    }

    /** @return CO2 emissions value */
    public double getCo2Emissions() {
        return co2Emissions;
    }

    /** @return female life expectancy */
    public double getLifeExpectancyFemale() {
        return lifeExpectancyFemale;
    }

    /** @return male life expectancy */
    public double getLifeExpectancyMale() {
        return lifeExpectancyMale;
    }

    /**
     * Calculates the average life expectancy.
     *
     * @return average of male and female life expectancy
     */
    public double getAverageLifeExpectancy() {
        return (lifeExpectancyFemale + lifeExpectancyMale) / 2.0;
    }

    /**
     * Returns a readable string representation of the object.
     *
     * @return formatted country data string
     */
    @Override
    public String toString() {
        return String.format(
                "CountryData{country='%s', year=%d, GDP=%.2f, population=%d, CO2=%.2f, AvgLifeExp=%.2f}",
                country, year, gdp, populationTotal, co2Emissions, getAverageLifeExpectancy()
        );
    }
}