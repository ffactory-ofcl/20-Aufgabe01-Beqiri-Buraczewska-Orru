package at.fhj.iit;

import java.util.List;

/**
 * Class represents a colored drink which extends {@link ComplexDrink} with the
 * possibility to set a custom color
 */
public class ColoredDrink extends ComplexDrink {
    /**
     * The color of the drink as a string
     */
    private String color;

    /**
     * Creates a ColoredDrink object from the given name, color and one liquid
     * 
     * @param name   the name of the drink
     * @param liquid the one liquid that makes up the drink
     * @param color  the color of the drink as a string
     * 
     * @throws InvalidColorException Thrown when a color other than [red, blue,
     *                               green, yellow, pink] is supplied
     *
     * @throws TooManyIngredientsException thrown when more than 10 liquids
     *                                     are added.
     */
    public ColoredDrink(String name, Liquid liquid, String color) throws InvalidColorException,TooManyIngredientsException {
        super(name, liquid);
        setColor(color);
    }

    /**
     * Creates a ColoredDrink object from the given name, color and a list of
     * liquids
     * 
     * @param name    the name of the drink
     * @param liquids the list of liquids that make up the drink
     * @param color   the color of the drink as a string
     * 
     * @throws InvalidColorException Thrown when a color other than [red, blue,
     *                               green, yellow, pink] is supplied
     *
     * @throws TooManyIngredientsException thrown when more than 10 liquids
     *                                     are added.
     */
    public ColoredDrink(String name, List<Liquid> liquids, String color) throws InvalidColorException,TooManyIngredientsException {
        super(name, liquids);
        setColor(color);
    }

    /**
     * Returns the color of the drink
     * 
     * @return color of the drink as a string
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the color of the drink
     * 
     * @param color desired color of the drink as a string
     * 
     * @throws InvalidColorException Thrown when a color other than [red, blue,
     *                               green, yellow, pink] is supplied
     */
    public void setColor(String color) throws InvalidColorException {
        switch (color) {
            case "red":
            case "blue":
            case "green":
            case "yellow":
            case "pink":
                this.color = color;
                break;

            default:
                throw new InvalidColorException();
        }
    }
}

/**
 * Class that describes the exception thrown when a ColoredDrink is created with
 * a (string) color that is not allowed
 */
class InvalidColorException extends Exception {
    public InvalidColorException() {
        super("Invalid color. Allowed are only: [red, blue, green, yellow, pink]");
    }
}