package vadpol;


import vadpol.game.StartGame;
import vadpol.util.CheckResult;
import vadpol.util.Hand;
import vadpol.util.PlayGame;
import vadpol.util.Winner;

import java.io.IOException;


public class RunApp {
    public static void main(String[] args) throws IOException {
        StartGame.getArg(args);
        CheckResult.getArg(args);
        Hand.getArg(args);
        PlayGame.getArg(args);
        Winner.getArg(args);
        StartGame.start();
    }
}
