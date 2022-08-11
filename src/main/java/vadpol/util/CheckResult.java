package vadpol.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vadpol.models.Player;

public class CheckResult {

    private static final Logger LOGGER_INFO = LoggerFactory.getLogger("logger.info");

    public static String checkResult(int gameResult, Player pl) {
        String line = null;
        if (gameResult == 0) {
            line = "Ties";
            pl.setTies(pl.getTies() + 1);
            LOGGER_INFO.info("ties");
        }
        if (gameResult == 1) {
            line = "Player " + pl.getName() + " Win.";
            pl.setWin(pl.getWin() + 1);
            LOGGER_INFO.info("Player Win");
        }
        if (gameResult == 2) {
            line = "Computer Win";
            pl.setLost(pl.getLost() + 1);
            LOGGER_INFO.info("Computer Win");


        }
        return line;
    }
}
