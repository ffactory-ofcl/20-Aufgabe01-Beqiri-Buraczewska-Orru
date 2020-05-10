package at.fhj.iit;

/**
 * Class represents a kids drink liquid which can be used in
 * drinks
 */
public class KidsDrink extends Drink{
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
     * @param toy if toy should be served
     */
    public KidsDrink(Liquid liquid,boolean toy){
        super(liquid.getName());
        this.liquid=liquid;
        this.toy=toy;
    }

    /**
    * Returns volume liquid liquid
    *
    * @return the volume of drink in litre
    */
    @Override
    public double getVolume() {
        // TODO Auto-generated method stub

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
        if(liquid.getAlcoholPercent()>0){
            return true;}
        return false;
    }

    /**
     * Gives information if drink is served with a toy
     * 
     * @return true if a toy is served with the drink
     */
    public boolean hasToy(){
        return toy;
    }
    
}