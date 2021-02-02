import java.util.Random;

public class stringman {
    public static void TrimAndConcat(String string1, String string2) {
        return string1.trim().concat(string2.trim());
    }

    public static Integer GetIndexOrNull(String input, char c) {
        return input.indexOf(c) != -1 ? input.indexOf(c) : null;
    }

    public static String ConcatSubstring(String input, int idxA, int idxB, String replacement) {
        String substr;
        try{
            substr = input.substring(idxA, idxB);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(String.format("Exception caught: %s", e));
            substr = "LOL";
        }

        return substr.concat(replacement);
    }

    public static String RandomString(int numChars) {
        String output = "";
        Random r = new Random();
        for(int i = 0; i < numChars; i++)
            output += Character.toChars(r.nextInt(122 - 97) + 97)[0];
        
        return output;
    }
}