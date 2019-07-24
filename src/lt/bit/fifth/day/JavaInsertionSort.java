package lt.bit.fifth.day;

import java.util.Arrays;

public class JavaInsertionSort {
    public static void main(String[] args) {
        int[] arrayForSorting = new int[10000];
        System.out.println(Arrays.toString(fillingArray(arrayForSorting)));
        long start = System.currentTimeMillis();
        insertionSorting(arrayForSorting);
        long stop = System.currentTimeMillis();
        System.out.println("Sorting time: " + (stop - start) + " mS");
        System.out.println(Arrays.toString(arrayForSorting));
    }

    private static int[] fillingArray(int[] arrayForSorting){
        for (int i = 0; i < arrayForSorting.length; i++){
            arrayForSorting[i] = (int)(Math.random() * 100);
        }
        return arrayForSorting;
    }

    private static int[] insertionSorting(int[] arrayForSorting){
        for (int i = 1; i < arrayForSorting.length; i++){
            int key = arrayForSorting[i];
            int j = i - 1;
            while (j >= 0 && arrayForSorting[j] > key){
                arrayForSorting[j + 1] = arrayForSorting[j];
                j = j - 1;
            }
            arrayForSorting[j + 1] = key;
        }

        return null;
    }
}
