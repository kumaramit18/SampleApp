package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaObjectSorting {
    public static void main(String[] args) {
        int [] intArr = {10,5, 16, 7, 11, 21};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));

        String [] strArr = {"Vamika", "Akshaj", "Cheeku", "Arti" };
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        char [] charArr = {'V', 'A', 'L', 'E' };
        Arrays.sort(charArr);
        System.out.println(Arrays.toString(charArr));

        List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        Collections.sort(strList);
        for(String str: strList) System.out.print(" "+str);

    }

}
