package Monopoly.tests;

import Monopoly.impl.Cup;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

public class CupTests {
    Cup cup = new Cup(2);

    @RepeatedTest(1000)
    public void theCupShouldAlwaysBeBetween2And12() {
        cup.roll();

        assertTrue(cup.getTotal() < 13);
        assertFalse(cup.getTotal() < 1);
    }
}
