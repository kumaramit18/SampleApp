package src;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        //Initialize array
        int[] arr = new int[]{1, 2, 3, 2, 3, 1, 9, 8, 1, 2, 10, 11, 11, 10}; //, 3, 3, 2, 4, 8, 4, 2, 7, 8, 8, 3};
        int[] visited = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
             visited[i] = 1;

        }
            System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = ++visited[j];
                   // if (visited[j] == 2)
                     //   System.out.println(arr[i]);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == 2)
                System.out.println(arr[i]);
           //         System.out.println(arr[i] + " " + visited[i] );
                }
            }
}