package vadpol.util;

import java.util.Locale;
import java.util.ResourceBundle;

public class Localization {
    private static ResourceBundle resourceBundle;
    private static Locale locale;

    public Localization(ResourceBundle resourceBundle, Locale locale) {
        this.resourceBundle = resourceBundle;
        this.locale = locale;
    }
    public static ResourceBundle getResourceBundle(String[] args){
        if(args.length == 0){
            locale = Locale.getDefault();
        }else{
            locale = new Locale(args[0]);
        }
        return ResourceBundle.getBundle("Locale", locale);
    }
}
