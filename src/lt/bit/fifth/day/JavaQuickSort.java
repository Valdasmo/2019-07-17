package lt.bit.fifth.day;

import java.util.Arrays;

public class JavaQuickSort {
    public static void main(String[] args) {
        int[] arrayForSorting = new int[1000000];
        System.out.println(Arrays.toString(fillingArray(arrayForSorting)));
        long start = System.currentTimeMillis();
//        int lowerIndex = 0;
//        int higherIndex = arrayForSorting.length - 1;
//        quickSorting(arrayForSorting, lowerIndex, higherIndex);
        Arrays.sort(arrayForSorting);
        long stop = System.currentTimeMillis();

        System.out.println(Arrays.toString(arrayForSorting));

        System.out.println("Sorting time: " + (stop - start) + " mS");
    }

    private static int[] fillingArray(int[] arrayForSorting) {
        for (int i = 0; i < arrayForSorting.length; i++) {
            arrayForSorting[i] = (int) (Math.random() * 100);
        }
        return arrayForSorting;
    }

    private static int[] quickSorting(int[] arrayForSorting,
                                      int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int pivot = partition(arrayForSorting, lowerIndex, higherIndex);
            quickSorting(arrayForSorting, lowerIndex, pivot - 1);
            quickSorting(arrayForSorting, pivot + 1, higherIndex);
        }

        return arrayForSorting;
    }

    private static int partition(int[] arrayForSorting,
                                 int lowerIndex, int higherIndex) {
        int pivot = arrayForSorting[higherIndex];
        int i = lowerIndex - 1;
        for (int j = lowerIndex; j < higherIndex; j++){
            if (arrayForSorting[j] <= pivot){
                i++;
                int temp = arrayForSorting[i];
                arrayForSorting[i] = arrayForSorting[j];
                arrayForSorting[j] = temp;
            }
        }
        int temp = arrayForSorting[i + 1];
        arrayForSorting[i + 1] = arrayForSorting[higherIndex];
        arrayForSorting[higherIndex] = temp;
        return i + 1;
    }
}
