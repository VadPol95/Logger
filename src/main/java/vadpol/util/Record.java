package vadpol.util;

import vadpol.models.Player;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Record {
    public static void recordFile(Player pl) throws IOException {
        String str = Winner.checkWinner(pl);
        Path path = Paths.get("result.txt");
        try (OutputStream output = new FileOutputStream(String.valueOf(path), true)) {

            output.write(" \n ".getBytes(StandardCharsets.UTF_8));
            output.write(pl.toString().getBytes(StandardCharsets.UTF_8));
            output.write(" \n ".getBytes(StandardCharsets.UTF_8));
            output.write(str.getBytes(StandardCharsets.UTF_8));
        }
    }

}
