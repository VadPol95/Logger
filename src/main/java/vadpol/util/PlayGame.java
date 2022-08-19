package vadpol.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vadpol.game.StartGame;

import java.io.IOException;

public class PlayGame {
    private static String[] arg;
//    private static final Logger LOGGER_INFO = LoggerFactory.getLogger("logger.info");
    public static int playGame() throws IOException {
        int [][] board = Board.giveBoard();
        int computerHand = Hand.giveComputerHand();
        int playerHand = Hand.giveHand();
        System.out.println(Localization.getResourceBundle(arg).getString("pThrow")+ " " + Hand.givePlayerHand(playerHand) + " " + Localization.getResourceBundle(arg).getString("cThrow")+ " " + Hand.givePcHand(computerHand));
//        LOGGER_INFO.info("Player throw: " + Hand.givePlayerHand(playerHand));
//        LOGGER_INFO.info("Computer throw: " + Hand.givePcHand(computerHand));
        return board[playerHand][computerHand];
    }
    public static void getArg(String[] args){
        arg = args;
    }
}
