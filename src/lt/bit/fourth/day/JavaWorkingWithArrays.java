package lt.bit.fourth.day;

import java.util.Arrays;

public class JavaWorkingWithArrays {
    public static void main(String[] args) {
//        iteratingArrays();
//        changeElementInArray();
//        insertElementInArray();
//        searchMinMaxElement();
//        copyingArrays();
    }

    private static void copyingArrays() {
        int[] source = new int[10];
        int[] destination = new int[20];
        for (int i = 0; i < source.length; i++){
            source[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < destination.length; i++){
            if (i < source.length){
                destination[i] = source[i];
            }
        }
        System.out.println(Arrays.toString(source));
        System.out.println(Arrays.toString(destination));

        int[] arrayCopy = Arrays.copyOf(source, source.length - 4);
        System.out.println(Arrays.toString(arrayCopy));

        int[] arrayCopyOther = Arrays.copyOfRange(source, 0, source.length - 2);
        System.out.println(Arrays.toString(arrayCopyOther));
    }

    private static void searchMinMaxElement() {
        int[] numberArray = new int[100];
        for (int i = 0; i < numberArray.length; i++){
            numberArray[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(numberArray));
        int maxValue = Integer.MAX_VALUE;
        for (int i =0; i < numberArray.length; i++){
            if (numberArray[i] < maxValue){
                maxValue = numberArray[i];
            }
        }
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));
        System.out.println(maxValue);
        System.out.println(numberArray[numberArray.length - 1]);
    }

    private static void insertElementInArray() {
        int [] numbers = {1,2,3,4,5,6,7,7,8,8,0};
        int index = 2;
        System.out.println(numbers.length);
        int[] newNumbers = new int[numbers.length + 1];
        for (int  i = 0; i < index; i++){
            newNumbers[i] = numbers[i];
        }
        newNumbers[index] = 100;
        for (int  i = index + 1; i < newNumbers.length; i++){
            newNumbers[i] = numbers[i - 1];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(newNumbers));
    }

    private static void changeElementInArray() {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random() * 100);
//            Random random = new Random();
//            random.ints();
        }
        System.out.println(Arrays.toString(numbers));
        numbers[2] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(numbers));
    }

    private static void iteratingArrays() {
        int[] intNumbers = {1,2,34,7,56};
        System.out.println(Arrays.toString(intNumbers));
        for (int i = 0; i < intNumbers.length; i++){
            System.out.println(intNumbers[i]);
        }
        for (int karves:intNumbers) {
            System.out.println(karves);
        }
    }
}
