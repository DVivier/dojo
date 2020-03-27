package dojo;

import java.text.StringCharacterIterator;
import java.util.Collections;

public class MainAccum {
    public static String accum(String s) {
        // your code
        char[] arrayChar;
        StringBuilder stringResult = new StringBuilder() ;
        int numberOfCopies = 1;
                arrayChar = s.toCharArray();
        for (char c : arrayChar) {
            if (numberOfCopies > 1) {
                stringResult.append("-");
            }
            stringResult.append(Character.toUpperCase(c));
            for (int i = 1; i < numberOfCopies; i++) {
                stringResult.append(Character.toLowerCase(c));
            }
            numberOfCopies++;
        }

        return stringResult.toString();
}

    public static void main(String[] args) {
        String accum = accum("abc");
        System.out.println(accum);
    }
}
