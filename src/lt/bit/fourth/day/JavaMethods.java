package lt.bit.fourth.day;

import java.util.Arrays;
import java.util.Scanner;

public class JavaMethods {

    public static void main(String[] args) {
        int intNumber = 10;
        double doubleNumber = 12.23;
        String[] names = {"Dave", "Katy", "..."};
        String[] trees = new String[3];
        int[] treesHeight = new int[3];
//        printSome();
//        printSome(intNumber);
//        printSome(doubleNumber);
//        printSome(names);
//        printSome(makeTreesArray(trees)); // Difficult method call
        printSome(makeTreesArray(trees, treesHeight)); // Difficult method call
    }

    private static void printSome() {
        System.out.println("Hello World!");
    }

    private static void printSome(int number) {
        System.out.println(number);
    }

    private static void printSome(double number) {
        System.out.println(number);
    }

    private static void printSome(String[] names) {
        System.out.println(Arrays.toString(names));
    }

    private static String[] makeTreesArray(String[] trees) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < trees.length; i++) {
            System.out.println("Input tree name: ");
            trees[i] = input.nextLine();
        }
        return trees;
    }

    private static String[] makeTreesArray(String[] trees, int[] treesHeight) {
        Scanner input = new Scanner(System.in);
        int treesNumber = 0;
        System.out.println("...");
        treesNumber = input.nextInt();
        if (trees.length == treesHeight.length) {
            for (int i = 0; i < trees.length; i++) {
                System.out.println("Input tree name: ");
                trees[i] = input.next();
                System.out.println("Input tree height: ");
                treesHeight[i] = input.nextInt();
            }
        } else {
            System.out.println("Go home ...");
        }

        String[] treesInfo = new String[trees.length];
        for (int i = 0; i < treesInfo.length; i++) {
            treesInfo[i] = trees[i] + " " + treesHeight[i];
        }
        return treesInfo;
    }


}
