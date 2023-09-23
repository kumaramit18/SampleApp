package src;

public class BubbleSort {

    public static void main(String  args[]) {
        int[] arr = {90, 10, 75, 20, 63, 8};
        int n = arr.length;

        System.out.println("Original array: ");
        printArray(arr, n);

        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }

    static void printArray(int arr[], int size) {

            for (int i=0; i < size; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
    }


    private static void bubbleSort(int[] arr, int size) {
        int temp;
        boolean swapped;
        for (int i = 0;  i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++ ) {

                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

         //   if (swapped == false)
           //     break;
        }

    }
}
