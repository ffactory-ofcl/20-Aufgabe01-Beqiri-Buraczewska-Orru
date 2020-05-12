package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

/**
 * Class represents a complex drink liquid which can be used in drinks
 */
public class ComplexDrink extends Drink {
    /**
     * class uses up to 10 liquids;
     */
    private List<Liquid> liquids = new ArrayList<>();

    /**
     * Creates a ComplexDrink object with given name
     * and liquid
     *
     * @param name name of drink
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
        try {
            controlLimit();
        } catch (TooManyIngredientsException e) {
            e.printStackTrace();
        }
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
     * Returns alcohol volume percent of all liquids
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
     */
    public void addLiquid(Liquid liquid) {
        liquids.add(liquid);
        try {
            controlLimit();
        } catch (TooManyIngredientsException e) {
            e.printStackTrace();
        }

    }

    /**
     * Gives a list of liquids
     *
     * @return the list off included liquids
     */
    public List<Liquid> getLiquids() {
        return liquids;
    }

    /**
     * Changes the current liquids of the drink
     *
     * @param liquids the new list<Liquid> of liquids
     */
    public void setLiquids(List<Liquid> liquids) {
        this.liquids = liquids;
        try {
            controlLimit();
        } catch (TooManyIngredientsException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gives the Name of the drink back.
     *
     * @return name of the ComplexDrink
     */
    public String getName() {
        return name;
    }

    /**
     * Controls if the amount of liquids is over 10.
     *
     * @throws TooManyIngredientsException exception could be thrown
     */
    public void controlLimit() throws TooManyIngredientsException {
        if (liquids.size() > 10) {
            throw new TooManyIngredientsException();
        }
    }
}

/**
 * Class Exception for the limit of liquids in a drink
 */
class TooManyIngredientsException extends Exception {

    public TooManyIngredientsException() {
        super("Drink has too many Ingredients.");
    }

}
