package lt.bit.lt.bit.fifth.day;

import java.util.Arrays;

public class JavaBubbleSort {
    public static void main(String[] args) {
        int[] arrayForSort = new int[1000];
        for (int i = 0; i < arrayForSort.length; i++){
            arrayForSort[i] = (int)(Math.random()* 1000);
        }
        long start = System.currentTimeMillis();
        bubbleSort(arrayForSort);
        long stop = System.currentTimeMillis();
        long result = stop - start;
        System.out.println("Time: " + result + " ms");
    }

    public static void bubbleSort(int[] arrayForSort) {
        int length = arrayForSort.length;
        int marker;
        for (int m = length; m >=0; m--){
            for (int i = 0; i < length - 1; i++){
                marker = i + 1;
                if (arrayForSort[i] > arrayForSort[marker]){
                    swapNumbersInArray(i, marker, arrayForSort);
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
