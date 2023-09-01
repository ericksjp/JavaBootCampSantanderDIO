import java.util.Arrays;
import java.util.HashSet;

public abstract class validatorPhoneNumber {
    private static HashSet<String> dddSet  = new HashSet<>(Arrays.asList(
        "11", "12", "13", "14", "15", "16", "17", "18", "19",
        "21", "22", "24", "27", "28",
        "31", "32", "33", "34", "35", "37", "38",
        "41", "42", "43", "44", "45", "46", "47", "48", "49",
        "51", "53", "54", "55",
        "61", "62", "63", "64", "65", "66", "67", "68", "69",
        "71", "73", "74", "75", "77", "79",
        "81", "82", "83", "84", "85", "86", "87", "88", "89",
        "91", "92", "93", "94", "95", "96", "97", "98", "99"
    ));

    public static String numeroFormatter(String numString) {

        String[] charactersToRemove = { ")", "(", "-", ".", " "};

        for (String charToRemove : charactersToRemove) {
            numString = numString.replace(charToRemove, "");
        }

        if (numString.length() == 10){
            numString = "9" + numString;
        }
        return numString;
    }

    public static boolean numeroValido(String numString) {
        if (numString.length() != 11 && numString.length() != 10) {
            return false;
        }

        if (!numString.matches("[0-9]+")) {
            return false;
        }

        String dddNum = numString.substring(0, 2);
        if (!dddSet.contains(dddNum)) {
            return false;
        }

        return true;
    }

}
