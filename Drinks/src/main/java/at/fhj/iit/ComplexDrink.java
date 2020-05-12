package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

/**
 * Class represents a complex drink liquid which can be used in drinks
 */
public class ComplexDrink extends Drink {
    /**
     * class uses up to 10 liqids;
     */
    private List<Liquid> liquids = new ArrayList<>();

    /**
     * Creates a ComplexDrink object with given name
     * 
     * @param name name of drink
     */
    public ComplexDrink(String name) {
        super(name);
    }

    /**
     * Creates a ComplexDrink object with given name and one liquid
     * 
     * @param name   name of drink
     * @param liquid the desired liquid to add
     */
    public ComplexDrink(String name, Liquid liquid) {
        super(name);
        liquids.add(liquid);
    }

    /**
     * Creates a ComplexDrink object with given name and list of liquids
     * 
     * @param name    name of drink
     * @param liquids list of liquids
     */
    public ComplexDrink(String name, List<Liquid> liquids) {
        super(name);
        liquids.addAll(liquids);
    }

    /**
     * Returns volume of all liquids
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid l : liquids) {
            volume += l.getVolume();
        }
        return volume;
    }

    /**
     * Returns alcohol volume percent of the drink
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        double percent = 0;
        for (Liquid l : liquids) {
            percent += l.getAlcoholPercent() * l.getVolume() / getVolume();
        }
        return Math.round(percent * 100) / 100d;
    }

    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if (getAlcoholPercent() > 0) {
            return true;
        }
        return false;
    }

    /**
     * Adds a liquid to the drink
     * 
     * @param liquid the liquid to add
     * @throws TooManyIngredientsException exception could be thrown
     */
    public void addLiquid(Liquid liquid) throws TooManyIngredientsException {
        if (liquids.size() >= 10) {
            System.out.println("here");
            throw new TooManyIngredientsException(liquid);
        } else {
            liquids.add(liquid);
        }
    }

    /**
     * Class Exception for the limit of liquids in a drink
     */
}

class TooManyIngredientsException extends Exception {
    public TooManyIngredientsException(Liquid liquid) {
        super("Drink has too many Ingredients.\nLiquid " + liquid.getName() + " was not added.");
    }

}