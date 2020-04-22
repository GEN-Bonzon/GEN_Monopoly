import Monopoly.impl.MonopolyGame;

/**
 * Main class for the Monopoly Labo, separated from MonopolyGame because I prefer it this way...
 * @author Tiffany Bonzon
 */
public class Monopoly {
    public static void main(String[] args) {
        MonopolyGame mg = new MonopolyGame(3);
        mg.playGame();
    }
}