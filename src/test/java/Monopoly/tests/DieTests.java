package Monopoly.tests;

import Monopoly.impl.Die;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class DieTests {
    @RepeatedTest(1000)
    public void theDieShouldAlwaysBebetween1And6() {
        Die dice = new Die();

        dice.roll();

        assertTrue(dice.getFaceValue() < 7);
        assertFalse(dice.getFaceValue() < 0);
    }
}
