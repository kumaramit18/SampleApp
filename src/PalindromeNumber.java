package src;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = s.nextInt();

        int reverseNumber=0;
        int temp = number;
        int remainder = 0;
        while (temp > 0) {
            remainder = temp % 10;
            reverseNumber = reverseNumber * 10 +  remainder;
            temp = temp / 10;
        }

        if (number == reverseNumber) {
            System.out.println(number + " is Palindrome ");
        } else {
            System.out.println(number + " is not Palindrome");
        }
    }

}