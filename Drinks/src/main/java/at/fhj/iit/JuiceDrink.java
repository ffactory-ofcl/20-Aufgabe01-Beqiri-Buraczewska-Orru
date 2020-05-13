package at.fhj.iit;


/**
 * This class represents a juice drink and extends KidsDrink class
 */
public class JuiceDrink extends KidsDrink {
    /**
     * Type of the fruit used to prepare the JuiceDrink
     */
    private FruitType fruit1;
    private FruitType fruit2;
    /**
     * Creates a KidsDrink object with given liquid
     * and toy
     *
     * @param liquid liquid in drink
     * @param toy    if toy should be served
     */
    public JuiceDrink(Liquid liquid, boolean toy) {
        super(liquid, toy);
    }

    /**
     * @param liquid liquid used to prepare the JuiceDrink
     * @param toy if toy should be served with the JuiceDrink
     * @param fruit1 fruit that the JuiceDrink is made of
     * @param fruit2 fruit that the JuiceDrink is made of
     */
    public JuiceDrink(Liquid liquid, boolean toy, FruitType fruit1, FruitType fruit2) {
        super(liquid, toy);
        this.fruit1 = fruit1;
        this.fruit2 = fruit2;
    }


    /**
     * get which fruit is used to prepare the JuiceDrink
     *
     * @return fruit1
     */
    public FruitType getFruit1() {
        return fruit1;
    }

    /**
     * set which type of fruit is used to prepare the JuiceDrink
     *
     * @param fruit1
     */
    public void setFruit1(FruitType fruit1) {
        this.fruit1 = fruit1;
    }

    /**
     * get which fruit is used to prepare the JuiceDrink
     *
     * @return fruit2
     */
    public FruitType getFruit2() {
        return fruit2;
    }

    /**
     * set which type of fruit is used to prepare the JuiceDrink
     *
     * @param fruit2
     */
    public void setFruit2(FruitType fruit2) {
        this.fruit2 = fruit2;
    }
}
