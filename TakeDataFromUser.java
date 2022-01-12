package School;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TakeDataFromUser {

    //region takeStringFromIN
    public static String takeStringFromIN() {

        String ints = null;
        int retValue = 0;

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            ints = br.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ints;
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

    //region findIntInString
    static List<String> findIntInString(String searchIN) {
        Pattern intPatt = Pattern.compile("-?\\d+");
        Matcher matcher = intPatt.matcher(searchIN);

        List<String> intList = new ArrayList<>();
        while (matcher.find()) {
            intList.add(matcher.group());
        }

        return intList;
    }
    //endregion

}
