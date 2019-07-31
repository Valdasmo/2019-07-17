package lt.bit.fifth.day;

import java.util.Arrays;

public class JavaMergeSort {
    public static void main(String[] args) {
        int[] arrayForSorting = new int[100000];
        System.out.println(Arrays.toString(fillingArray(arrayForSorting)));
        long start = System.currentTimeMillis();
        mergeSorting(arrayForSorting);
        long stop = System.currentTimeMillis();
        System.out.println("Array sorted in: " + (stop - start) + " mS");
        System.out.println(Arrays.toString(arrayForSorting));
    }

    private static int[] fillingArray(int[] arrayForSorting) {
        for (int i = 0; i < arrayForSorting.length; i++) {
            arrayForSorting[i] = ((int) (Math.random() * 1000));
        }
        return arrayForSorting;
    }

    private static void mergeSorting(int[] arrayForSorting) {
        if (arrayForSorting.length > 1) {
            int[] leftArray = leftHalf(arrayForSorting);
            int[] rightArray = rightHalf(arrayForSorting);
            mergeSorting(leftArray);
            mergeSorting(rightArray);
            merge(arrayForSorting, leftArray, rightArray);
        }
    }

    private static int[] leftHalf(int[] arrayForSorting) {
        int size1 = arrayForSorting.length / 2;
        int[] leftArray = new int[size1];
        for (int i = 0; i < size1; i++) {
            leftArray[i] = arrayForSorting[i];
        }
        return leftArray;
    }

    private static int[] rightHalf(int[] arrayForSorting) {
        int size1 = arrayForSorting.length / 2;
        int size2 = arrayForSorting.length - size1;
        int[] rightArray = new int[size2];
        for (int i = 0; i < size2; i++) {
            rightArray[i] = arrayForSorting[i + size1];
        }
        return rightArray;
    }

    private static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
}
