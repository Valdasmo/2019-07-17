package lt.bit.second.day;

import java.util.Arrays;
import java.util.StringTokenizer;

public class JavaStrings {
    public static void main(String[] args) {
//        String name = new String ("Dave");
//        String [] names = {"Tom", "Dave", "..."};
//        System.out.println(name);
//        System.out.println(names);
//            comparingStrings();
            changingCaseOfStrings();
//            findingStrings();
//        splittingStrings();
//        concatStrings();
        String name = "Kestutis";
        System.out.println(name.length());
        StringBuilder stringBuilder = new StringBuilder(name);
        stringBuilder.append(name);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.reverse());
    }

    private static void concatStrings() {
        String[] data = {"cat", "dog", "fish", "12", "45.7f"};
        String singleLine = String.join(" ", data);
        System.out.println(singleLine);
    }

    private static void splittingStrings() {
        String textLine = "Using the Hello World guide, you’ll create";
        String [] data = textLine.split("w");
        String csvFile = "cat;dog;fish;12;45.7f";
        String [] dataCsv = csvFile.split(";");
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(dataCsv));
        StringTokenizer stringTokenizer = new StringTokenizer(textLine);
        while (stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
        String substring = textLine.substring(12);
        System.out.println(substring);
        System.out.println(textLine.substring(5, 12));
    }

    private static void findingStrings() {
        String textLine = "Using the Hello World guide, you’ll create";
        String searchWord = "hello";
        searchWord += "Fish";
        String newString = searchWord + "Labas";
        System.out.println(textLine.toLowerCase().
                contains(searchWord.toLowerCase()));
        System.out.println(textLine.indexOf("t"));
        System.out.println(textLine.charAt(6));
    }

    private static void changingCaseOfStrings() {
        String text = "Using the " +
                " World guide, you’ll create " +
                "a repository, start a branch, write comments, and open " +
                "a pull request. ";
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.replace(" World ".toLowerCase(), "Break"));
    }

    private static void comparingStrings() {
        int numberOne = 10;
        int numberTwo = 10;
        System.out.println(numberOne == numberTwo);

        String stringOne = "cat";
        String stringTwo = "cat";
        String stringThree = new String("cat");
        boolean compare = stringOne == stringThree; // BAD!!!
        System.out.println(compare);
        boolean compareObjects = stringOne.equals(stringTwo); // GOOD!
        System.out.println(compareObjects);
        boolean compareNew = stringOne.equals(stringThree);
        System.out.println(compareNew);
    }


}
