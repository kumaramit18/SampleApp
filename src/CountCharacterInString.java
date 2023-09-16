package src;

public class CountCharacterInString {

    public static void main(String args[]) {

        String str =  "This is Amit Namdeo";

        System.out.println("Given String: " + str);

        int length =  str.length();
        int count = 0;
        System.out.println("String length is: " + length);


        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != ' ')
                count++;
        }

        System.out.println("Character count is : " + count);
    }

}