package at.fhj.iit;

/**
 * This class represents a soda drink and extends a SimpleDrink class
 */
public class Soda extends SimpleDrink {

    private String manufacturer;
    /**
     * Creates a Soda object with given name and liquid
     *
     * @param name name of drink
     * @param l    only liquid in drink
     */
    Soda(String name, Liquid l) {
        super(name, l);
    }

    /**
     * Creates a Soda object with given name, liquid and manufacturer
     *
     * @param name name of the drink
     * @param l liquid which soda is produced from
     * @param manufacturer manufactuerr which produced the soda
     */
    public Soda(String name, Liquid l, String manufacturer) {
        super(name, l);
        this.manufacturer = manufacturer;
    }

    /**
     * Get which manufacturer produced the soda
     *
     * @manufacturer the manufacturer the soda if produced by
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Set which manufacturer produced the soda
     *
     * @param manufacturer the manufacturer which produced the soda
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
