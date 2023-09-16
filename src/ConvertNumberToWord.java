package src;

public class ConvertNumberToWord {

    String [] oneDigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

    String [] twoDigit = new String[] {"", "Ten", "Eleven", "Twelve","Thirteen", "Fourteen", "Fifteen", "Sixteen",
        "Seventeen", "Eighteen", "Nineteen"};

    String [] multipleOfTen = new String[] {"", "","Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    String[] powerOfTens = new String[] {"Hundred", "Thousand"};



    void numberToWords(char number[]) {
    int length = number.length;
    System.out.println("Number is: " + number[0] + " Length is: " + length + " '0' = " + '0');

    if (length == 0) {
        System.out.println("String is Empty");

    }

    if (length == 1) {
        System.out.println(oneDigit[number[0]-'0']);

    }

    if (length >= 3) {

    }

}
    public static void main(String args[]) {
        ConvertNumberToWord convertNumberToWord = new ConvertNumberToWord();
        convertNumberToWord.numberToWords("0".toCharArray());
        convertNumberToWord.numberToWords("1".toCharArray());
        convertNumberToWord.numberToWords("2".toCharArray());
        convertNumberToWord.numberToWords("3".toCharArray());
        convertNumberToWord.numberToWords("5".toCharArray());
        convertNumberToWord.numberToWords("7".toCharArray());
        convertNumberToWord.numberToWords("8".toCharArray());


    }
}
