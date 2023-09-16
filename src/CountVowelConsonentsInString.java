package src;

public class CountVowelConsonentsInString {


    public static void main(String args[]) {

        String str = "This is Amit Namdeo";

        System.out.println("Given String: " + str);

        int length = str.length();
        int vCount = 0, cCount = 0;
        str = str.toLowerCase();
        System.out.println("Lowercase String: " + str);


        System.out.println("String length is: " + length);

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u')
                vCount++;
            else if (str.charAt(i ) >= 'a' && str.charAt(i) <= 'z')
                cCount++;
        }

        System.out.println("Vowel Count  is : " + vCount);
        System.out.println("Consonent Count  is : " + cCount);

    }
}