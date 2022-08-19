package vadpol.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vadpol.game.StartGame;
import vadpol.models.Player;

public class CheckResult {
    private static String[] arg;

//    private static final Logger LOGGER_INFO = LoggerFactory.getLogger("logger.info");

    public static String checkResult(int gameResult, Player pl) {
        String line = null;
        if (gameResult == 0) {
            line = Localization.getResourceBundle(arg).getString("ties");
            pl.setTies(pl.getTies() + 1);
//            LOGGER_INFO.info("ties");
        }
        if (gameResult == 1) {
            line = Localization.getResourceBundle(arg).getString("player") + pl.getName() + Localization.getResourceBundle(arg).getString("win");
            pl.setWin(pl.getWin() + 1);
//            LOGGER_INFO.info("Player Win");
        }
        if (gameResult == 2) {
            line = Localization.getResourceBundle(arg).getString("comWin");
            pl.setLost(pl.getLost() + 1);
//            LOGGER_INFO.info("Computer Win");


        }
        return line;
    }
    public static void getArg(String[] args){
        arg = args;
    }
}
