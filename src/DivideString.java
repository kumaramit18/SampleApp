package src;

import java.util.Scanner;

public class DivideString {

    public static void main(String args[]) {

        String str = "Amit Kuma rNam deo";
        int len = str.length();
        String[] equalString;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many Number of Parts string to be divided: " );
//        int numberOfParts = 3;
        int numberOfParts = sc.nextInt();
        System.out.println(numberOfParts);
        int totalParts = len / numberOfParts;

        System.out.println("String Length: "+ len);

        if (len % numberOfParts != 0) {
            System.out.println("Sorry this string cannot be divided into "+ numberOfParts +" equal parts.");
        }
        else {
            equalString = new String[numberOfParts];
            int count = 0;

            for (int i = 0; i < len; i = i + totalParts) {
                String part = str.substring(i, i + totalParts);
                equalString[count] = part;
                count++;
            }

            System.out.println(numberOfParts + " equal parts of given string are ");
            for (int i = 0; i < equalString.length; i++) {
                System.out.println(equalString[i]);
            }
        }

    }

}

