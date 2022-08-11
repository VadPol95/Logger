package vadpol.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Helper {
    public  static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String getString() throws IOException {
        return reader.readLine();
    }
    public static int getNumber() throws IOException{
        return Integer.parseInt(reader.readLine());
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
