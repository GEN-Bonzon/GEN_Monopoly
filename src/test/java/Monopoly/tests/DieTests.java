package Monopoly.tests;

import Monopoly.impl.Die;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class DieTests {
    Die die = new Die();

    @RepeatedTest(1000)
    public void theDieShouldAlwaysBebetween1And6() {
        die.roll();

        assertTrue(die.getFaceValue() < 7);
        assertFalse(die.getFaceValue() < 0);
    }
}
