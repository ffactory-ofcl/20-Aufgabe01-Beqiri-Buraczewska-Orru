package at.fhj.iit;


import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

/**
 * Class that tests the behavior of ColoredDrink
 */
public class DrinkTest {
    private ComplexDrink cd;
    private KidsDrink kd;
    private static int testnmr = 1;


    /**
     * Gives information about when the test starts.
     */
    @BeforeEach
    public void setup() {
        // SETUP PHASE
        System.out.println("Start test " + testnmr);
    }

    /**
     * Gives information about when the test ends.
     */
    @AfterEach
    public void end() {
        // END TEST PHASE
        System.out.println("End test " + testnmr);
        testnmr++;
    }

    @Test
    @DisplayName("Testing Complex Drink")
    public void testComplexDrink() {
        try {
            cd = new ComplexDrink("Complex", new Liquid("pure", 1, 7));
        }catch (TooManyIngredientsException e){
            fail("Complex Drink cd with less than 10 liquids should not fail. Liquids: "+ cd.getLiquids().size());
        }
        assertEquals(cd.getName(), "Complex");
        assertEquals(cd.getVolume(), 1);
        assertEquals(cd.getAlcoholPercent(), 7);
        assertTrue(cd.isAlcoholic());

    }

    @Test
    @DisplayName("Testing Kids Drink")
    public void testKidsDrink() {
        kd = new KidsDrink(new Liquid("Kids", 2, 5), true);
        assertEquals(kd.getName(), "Kids");
        assertEquals(kd.getVolume(), 2);
        assertEquals(kd.getAlcoholPercent(), 0);

    }

}
