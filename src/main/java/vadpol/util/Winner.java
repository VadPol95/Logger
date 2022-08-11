package vadpol.util;

import vadpol.models.Player;

public class Winner {
    public static String checkWinner(Player pl){

        if(pl.getWin()< pl.getLost()){
            return  "По очкам компьтер победил";
        }if(pl.getWin() > pl.getLost()) {
            return  "По очкам победил игрок";
        }else {
            return  "ничья по очкам";}

    }
}
