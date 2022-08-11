package vadpol.game;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vadpol.models.Player;
import vadpol.util.Helper;
import vadpol.util.Record;

import java.io.IOException;

import static vadpol.util.CheckResult.checkResult;
import static vadpol.util.PlayGame.playGame;


public class StartGame {
    private static final Logger LOGGER_WARN = LoggerFactory.getLogger("logger.warn");
    private static final Logger LOGGER_INFO = LoggerFactory.getLogger("logger.info");


    public static void start() throws IOException {
        LOGGER_INFO.info("User has entered the game");
        LOGGER_INFO.info("User enter name");
        System.out.println("Enter your name: ");
        Player pl = new Player(Helper.getString());
        String line = "";
        LOGGER_INFO.info("The player chooses how much he will play");
        System.out.println("Enter number of game: ");
        int gameNumber = Helper.getNumber();
        int count = 0;
        LOGGER_INFO.info("The player has choose: " + gameNumber + " games");


        LOGGER_INFO.info("The player chooses start game or not");
        while (!line.equalsIgnoreCase("S")) {
            System.out.println("For start enter [S] or [X] for exit");
            line = Helper.getString();
            if (line.equalsIgnoreCase("X")) System.exit(-1);
            LOGGER_WARN.warn("Player enter incorrect letter");

        }


        do {
            count++;
            if (gameNumber == 0) {
                break;
            }
            int gameResult = playGame();

            System.out.println(checkResult(gameResult, pl));
            Record.recordFile(pl);

            int temp1 = gameNumber - 1;

            LOGGER_INFO.info("Player has left: " + temp1 + " rounds," + " and Player played: " + count + " rounds");
            System.out.println(pl);
            if (gameNumber == 1) {
                break;
            } else {
                LOGGER_INFO.info("Player chooses he ill be playing again or not");
                System.out.println("Play again? [Y] / [N]");
                line = Helper.getString();
                if (line.equalsIgnoreCase("N")) {
                    System.out.println(pl);
                    break;
                }
            }
            gameNumber--;
        }
        while (0 != gameNumber);
        LOGGER_INFO.info("Player end game");
    }
}

