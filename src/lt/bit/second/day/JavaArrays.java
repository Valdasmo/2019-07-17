package lt.bit.second.day;

import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {
        creatingArrays();

    }

    private static int[] creatingArrays() {
        int[] intNullArray = {};
        System.out.println(Arrays.toString(intNullArray));
        int[] intArray = new int[3]; // Array for 3 int elements
        System.out.println(Arrays.toString(intArray));
        int[] intArrayWithNumber = {1, 2, 3}; // Array with literals
        int[] intArrayWithNumberOther = {1, 2, 3}; // Array with literals
        System.out.println(intArrayWithNumber == intArrayWithNumberOther);
        System.out.println(intArrayWithNumber.equals(intArrayWithNumberOther));
        System.out.println(Arrays.toString(intArrayWithNumber));
        int[] intArrayWithNumberTwo = new int[]{}; // Array with literals
        System.out.println(Arrays.toString(intArrayWithNumberTwo));
        int[][] intArrayMultidimensional = new int[2][];
        int[][] intJaggedArray = new int[2][];
//        intArrayMultidimensional[0][0] = 12;
//        intArrayMultidimensional[0][1] = 1;
//        intArrayMultidimensional[0][2] = 2;
//        intArrayMultidimensional[0][3] = 34;
//        intArrayMultidimensional[1][0] = 12;
//        intArrayMultidimensional[1][1] = 1;
//        intArrayMultidimensional[1][2] = 2;
//        intArrayMultidimensional[1][3] = 34;
//        intArrayMultidimensional[0][4] = 67;
//        intArrayMultidimensional[0][5] = 67;
        System.out.println(Arrays.deepToString(intArrayMultidimensional));
        int[][] intArrayOP = {{1, 2, 3}, {1, 2}, {2, 5, 7, 8}};
        System.out.println(Arrays.deepToString(intArrayOP));
        return null;
    }


}
