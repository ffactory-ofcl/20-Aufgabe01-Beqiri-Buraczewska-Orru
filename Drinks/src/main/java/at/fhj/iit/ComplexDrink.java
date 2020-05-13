package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;

/**
 * Class represents a complex drink liquid which extends {@link Drink } and
 * accepts up to 10 objects of class Liquid
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
     *
     * @throws TooManyIngredientsException thrown when more than 10 liquids
     *                                     are added.
     */
    public ComplexDrink(String name, Liquid liquid) throws TooManyIngredientsException{
        super(name);
        liquids.add(liquid);
    }

    /**
     * Creates a ComplexDrink object with given name and list of liquids
     *
     * @param name    name of drink
     * @param liquids list of liquids
     *
     * @throws TooManyIngredientsException thrown when more than 10 liquids
     *                                     are added.
     */
    public ComplexDrink(String name, List<Liquid> liquids) throws TooManyIngredientsException{
        super(name);
        liquids.addAll(liquids);
            controlLimit();
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
     * @throws TooManyIngredientsException thrown when more than 10 liquids
     *                                     are added.
     */
    public void addLiquid(Liquid liquid) throws TooManyIngredientsException{
        liquids.add(liquid);
            controlLimit();
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
     * @throws TooManyIngredientsException thrown when more than 10 liquids
     *                                     are added.
     */
    public void setLiquids(List<Liquid> liquids) throws TooManyIngredientsException{
        this.liquids = liquids;
            controlLimit();
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
     * @throws TooManyIngredientsException thrown when more than 10 liquids
     *                                     are added.
     */
    public void controlLimit() throws TooManyIngredientsException {
        if (liquids.size() > 10) {
            throw new TooManyIngredientsException();
        }
    }
}

/**
 * Class that describes the exception thrown when a ComplexDrink has too many
 * liquids.
 */
class TooManyIngredientsException extends Exception {
    public TooManyIngredientsException() {
        super("Drink has too many Ingredients. Allowed are up to 10 liquids.");
    }
}
