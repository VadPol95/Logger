package vadpol.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class PlayGame {
    private static final Logger LOGGER_INFO = LoggerFactory.getLogger("logger.info");
    public static int playGame() throws IOException {
        int [][] board = Board.giveBoard();
        int computerHand = Hand.giveComputerHand();
        int playerHand = Hand.giveHand();
        System.out.println("Player throw : " + Hand.givePlayerHand(playerHand) + ", Computer throw : " + Hand.givePcHand(computerHand));
        LOGGER_INFO.info("Player throw: " + Hand.givePlayerHand(playerHand));
        LOGGER_INFO.info("Computer throw: " + Hand.givePcHand(computerHand));
        return board[playerHand][computerHand];
    }
}
