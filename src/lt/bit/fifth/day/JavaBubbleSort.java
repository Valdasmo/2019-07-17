package lt.bit.fifth.day;


import java.util.Arrays;

public class JavaBubbleSort {
    public static void main(String[] args) {
        int[] arrayForSort = new int[10000];
        for (int i = 0; i < arrayForSort.length; i++){
            arrayForSort[i] = (int)(Math.random() * 1000);
        }
        System.out.println("Filled array.");
        long start = System.currentTimeMillis();
        bubbleSort(arrayForSort);
        long stop = System.currentTimeMillis();
        long result = stop - start;
        System.out.println("Time: " + result + " mS");
    }

    private static void bubbleSort(int[] arrayForSort) {
        int length = arrayForSort.length;
        int marker;
        for (int m = length; m >= 0; m--){
            for (int i = 0; i < length - 1; i++){
                marker = i + 1;
                if (arrayForSort[i] > arrayForSort[marker]) {
//                    swapNumbersInArray(i, marker, arrayForSort);
                    int temp; // TODO
                    temp = arrayForSort[i];
                    arrayForSort[i] = arrayForSort[marker];
                    arrayForSort[marker] = temp;
                }
            }
        }
        printSortedArray(arrayForSort);
    }

    private static void printSortedArray(int[] arrayForSort) {
        System.out.println(Arrays.toString(arrayForSort));
    }

    private static void swapNumbersInArray(int i, int k, int[] arrayForSort) {
        int temp;
        temp = arrayForSort[i];
        arrayForSort[i] = arrayForSort[k];
        arrayForSort[k] = temp;
    }
}
