package vadpol.util;

import vadpol.game.StartGame;
import vadpol.models.Player;

public class Winner {
    private static String[] arg;
    public static String checkWinner(Player pl){

        if(pl.getWin()< pl.getLost()){
            return  Localization.getResourceBundle(arg).getString("cWins");
        }if(pl.getWin() > pl.getLost()) {
            return  Localization.getResourceBundle(arg).getString("pWins");
        }else {
            return  Localization.getResourceBundle(arg).getString("tiesPC");
        }

    }
    public static void getArg(String[] args){
        arg = args;
    }
}
