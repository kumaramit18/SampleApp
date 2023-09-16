package src;

public class ReverseString {

    public static void main(String args[]) {

        String str = "AmitKumarNamdeo";
        int len = str.length();
        String reverseStr = "";
        System.out.println("String Length: " + len);

        System.out.println("============= Option 1 ============== " + reverseStr);

        for (int i = len - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println("Original String: " + str);
        System.out.println("Reverse String : " + reverseStr);

        System.out.println("============= Option 2 ============== ");

        char[] reverseStr1 = str.toCharArray();

        for (int start = 0, end = len - 1; start < (len / 2); start++, end--) {
            char ch = reverseStr1[start];
            reverseStr1[start] = reverseStr1[end];
            reverseStr1[end] = ch;
        }
        System.out.println("Original String : " + str);
        System.out.print("Reverse String1 : ");

        for (int i = 0; i < len; i++) {
            System.out.print(reverseStr1[i]);
        }
    }
}

