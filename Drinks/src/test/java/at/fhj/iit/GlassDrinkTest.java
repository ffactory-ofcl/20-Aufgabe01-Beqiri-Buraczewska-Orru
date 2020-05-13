package at.fhj.iit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class that tests the behavior of ColoredDrink
 */
public class GlassDrinkTest {
    /**
     * Keep track of the current test-run. Intended for future use.
     */
    private static int testnmr = 1;

    @BeforeEach
    public void setup() {
        // SETUP PHASE
        System.out.println("Start test " + testnmr);
    }

    @AfterEach
    public void end() {
        // END TEST PHASE
        System.out.println("End test " + testnmr);
        testnmr++;
    }

    /**
     * Checks if generating a GlassDrink for each GlassType succeeds and if the
     * colors match the expection.
     */
    @Test
    @DisplayName("Check setting glass types")
    public void testGeneratingGlassTypes() {
        String name = "GlassDrink";
        Liquid liquid = new Liquid("Water", 1, 0);

        for (GlassType type : GlassType.values()) {
            try {
                GlassDrink cd = new GlassDrink(name, liquid, type);
                assertEquals(type, cd.getGlass());
            } catch (TooManyIngredientsException e) {
                fail("Complex Drink cd with less than 10 liquids should not fail.");
            }
        }
    }
}
