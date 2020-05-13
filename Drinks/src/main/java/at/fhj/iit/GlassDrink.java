package at.fhj.iit;

import java.util.List;

/**
 * Class represents a drink with a glass and extends {@link ComplexDrink} with
 * the possibility to set what type of glass it is served in
 */
public class GlassDrink extends ComplexDrink {
    /**
     * The color of the drink as a string
     */
    private GlassType glass;

    /**
     * Creates a ColoredDrink object from the given name, type of glass and one
     * liquid
     * 
     * @param name   the name of the drink
     * @param liquid the one liquid that makes up the drink
     * @param glass  the type of glass the drink is served in
     */
    GlassDrink(String name, Liquid liquid, GlassType glass) {
        super(name, liquid);
        this.glass = glass;
    }

    /**
     * Creates a GlassDrink object from the given name, type of glass and a list of
     * liquids
     * 
     * @param name    the name of the drink
     * @param liquids the list of liquids that make up the drink
     * @param glass   the type of glass the drink is served in
     */
    GlassDrink(String name, List<Liquid> liquids, GlassType glass) {
        super(name, liquids);
        this.glass = glass;
    }

    /**
     * Get which type of glass the drink is served in
     * 
     * @return the type of glass as a GlassType
     */
    public GlassType getGlass() {
        return glass;
    }

    /**
     * Set which type of glass the drink is served in
     * 
     * @param glass the type of glass as GlassType
     */
    public void setGlass(GlassType glass) {
        this.glass = glass;
    }
}
