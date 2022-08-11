package vadpol.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Hand {
    private static final Logger LOGGER_ERROR = LoggerFactory.getLogger("logger.error");
    public static int giveHand() throws IOException {
        System.out.println("Rock, Paper or Scissors");
        String hand = Helper.getString();
        int handNum;

        if (hand.equalsIgnoreCase("R")) {
            handNum = 0;
        } else if (hand.equalsIgnoreCase("S")) {
            handNum = 1;

        } else if (hand.equalsIgnoreCase("P")) {
            handNum = 2;
        } else {
            LOGGER_ERROR.error("User enter incorrect value");
            throw new IllegalStateException("Unexpected value: " + hand);
        }

        return handNum;
    }

    public static String givePlayerHand(int pcHand){

        String hand;
        switch (pcHand) {
            case 0:
                hand = "Rock";
                break;

            case 1:
                hand = "Scissors";
                break;

            case 2:
                hand = "Paper";
                break;
            default:
                LOGGER_ERROR.error("User enter incorrect value");
                throw new IllegalStateException(" Invalid enter, try again");

        }
        return hand;
    }

    public static String givePcHand(int pcHand) {
        String hand;
        switch (pcHand) {
            case 0:
                hand = "Rock";
                break;

            case 1:
                hand = "Scissors";
                break;

            case 2:
                hand = "Paper";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + pcHand);
        }
        return hand;
    }

    public static int giveComputerHand() {
        return Helper.getRandomNumber(0, 3);
    }
}
