package at.fhj.iit;

/**
 * Class represents a kids drink liquid which extends {@link Drink}
 */
public class KidsDrink extends Drink {
    /**
     * uses only one liquid
     * and if a toy is served
     */
    private Liquid liquid;
    private boolean toy;

    /**
     * Creates a KidsDrink object with given liquid
     * and toy
     *
     * @param liquid liquid in drink
     * @param toy    if toy should be served
     */
    public KidsDrink(Liquid liquid, boolean toy) {
        super(liquid.getName());
        if (liquid.getAlcoholPercent() > 0) {
            System.err.println("No alcohol for kids.\nAlcohol was not added to KidsDrink " + liquid.getName() + ".");
            liquid.setAlcoholPercent(0);
        }
        this.liquid = liquid;
        this.toy = toy;
    }

    /**
     * Returns name of liquid liquid
     *
     * @return the name of the liquid liquid
     */
    public String getName() {
        return liquid.getName();
    }

    /**
     * Returns volume liquid liquid
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {

        return liquid.getVolume();
    }

    /**
     * Returns alcohol volume percent of liquid liquid
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        return liquid.getAlcoholPercent();
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquid is present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if (liquid.getAlcoholPercent() > 0) {
            return true;
        }
        return false;

    }

    /**
     * Gives information if drink is served with a toy
     *
     * @return true if a toy is served with the drink
     */
    public boolean hasToy() {
        return toy;
    }

}