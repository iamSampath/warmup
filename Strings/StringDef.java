/*
 *  Author: Sampath Kumar Medarametla
 *  This program explains about the string definition and Traversing
 */

import java.util.*;

public class StringDef {


    public static void main(String[] args) {

        //Define a String

        String S1 = "Hello Sampath!! I am Glad you are Here.";
        String Alphabs = "ABCDEFGHIJKLMNOPQRSTUVWXYZ !.";
        int AlphaIndex = 0;

        for (int i = 0; i < S1.length(); i++) {
            AlphaIndex = Alphabs.indexOf(S1.toUpperCase().charAt(i));
            System.out.println("Character " + '"' + S1.charAt(i) + '"' + " Found at " + i
                    + " Position," + " Alphabet Index " + (AlphaIndex+1));
        }


    }


}