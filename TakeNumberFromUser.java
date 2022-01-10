package School;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TakeNumberFromUser {

    //region takeIntegerRegex
    public static int takeIntegerRegex() {

        String strRegex = null;
        int retValue = 0;

        final Pattern p = Pattern.compile("d+");

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Podaj liczbę klas: ");
            strRegex = br.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

        assert strRegex != null;
        Matcher m = p.matcher(strRegex);

        while (m.find()) {
            System.out.println(m.group());
        }
        try {
            retValue = Integer.parseInt(String.valueOf(m.matches()));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        return retValue;
    }
    //endregion

    //region takeNumber
    public static Number takeNumber() {

        double numberFromConsole = 0;

        boolean validate;
        String s;

        do {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("Enter a number:");
            try {
                s = br.readLine();
                numberFromConsole = Double.parseDouble(s);
                validate = false;

            } catch (Exception e) {
                e.printStackTrace();
                validate = true;
            }
        } while (validate);

        System.out.println("(WWW) Poza blokiem try");

        return numberFromConsole;
    }
    //endregion
}
