package at.fhj.iit;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Class that tests the behavior of ColoredDrink
 */
public class ColoredDrinkTest {
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
     * Checks if generating a ColoredDrink for each of the valid colors succeeds.
     * Using an invalid color should fail.
     */
    @Test
    @DisplayName("Check setting all valid colors")
    public void testSettingColor() {
        String name = "ColoredDrink";
        Liquid liquid = new Liquid("Water", 1, 0);
        String[] colors = { "red", "blue", "green", "yellow", "pink" };

        for (String color : colors) {
            try {
                ColoredDrink cd = new ColoredDrink(name, liquid, color);
                assertEquals(color, cd.getColor());
            } catch (InvalidColorException e) {
                fail("Generating ColoredDrink with valid color " + color + " should not fail");
            }
        }

        assertThrows(InvalidColorException.class, () -> {
            new ColoredDrink(name, liquid, "invalid");
        });

    }
}
