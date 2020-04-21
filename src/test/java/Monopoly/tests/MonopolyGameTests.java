package Monopoly.tests;

import Monopoly.impl.MonopolyGame;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MonopolyGameTests {
    @Test
    void theMonopolyGameLastsFor20Rounds() {
        MonopolyGame monopolyGame = new MonopolyGame(3);
        monopolyGame.playGame();

        int obtained = monopolyGame.getRoundCnt();
        int expected = 20;

        assertEquals(expected, obtained);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 9, 0})
    void theMonopolyGameShouldThrowIfIncorrectNumberOfPlayers(int nbPlayers) {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MonopolyGame monopolyGame = new MonopolyGame(nbPlayers);
        });

        String expectedMessage = "There should be between 2 and 8 players";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }
}
