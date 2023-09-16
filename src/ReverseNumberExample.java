package src;

public class ReverseNumberExample {
    public static void main(String args[]) {
        int number = 12345;
        int reverseNumber = 0;
        while (number != 0) {
            int remainder = number % 10;
            number = number / 10;
            reverseNumber = reverseNumber * 10 + remainder;
        }
        System.out.println("Reverse of the number is: " + reverseNumber);
    }
}
