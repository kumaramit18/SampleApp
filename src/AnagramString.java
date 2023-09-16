package src;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString {

    public static void main(String args[]) {

        String str1 =  "This is Amit Namdeo";
        String str2 =  "This is Namdeo Amit";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();

        System.out.println("Str1 : " + str1);
        System.out.println("Str2 : " + str2);

        if (str1.length() != str2.length())
            System.out.println("Both Strings are not Anagram  ");
        else {
            Arrays.sort(string1);
            Arrays.sort(string2);
        }

        System.out.println("Sorted String 1: " + string1.toString());
        System.out.println("Sorted String 2: " + string2.toString());

        if (Arrays.equals(string1, string2) == true)
            System.out.println("Both Strings are Anagram: ");
        else
            System.out.println("Both Strings are not Anagram: ");
        }
    }