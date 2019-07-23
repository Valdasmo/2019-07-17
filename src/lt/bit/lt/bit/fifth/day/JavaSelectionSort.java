package lt.bit.lt.bit.fifth.day;

public class JavaSelectionSort {
    public static void main(String[] args) {
        int[] arrayForSort = new int[50];
        for (int i = 0; i < arrayForSort.length; i++) {
            arrayForSort[i] = (int) (Math.random() * 1000);
        }
        long start = System.currentTimeMillis();
        selectionSort(arrayForSort);
        long stop = System.currentTimeMillis();
        long result = stop - start;
        System.out.println("Time: " + result + " ms");
        for (int i : arrayForSort) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    private static int[] selectionSort(int[] arrayForSort) {
        for (int i = 0; i < arrayForSort.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arrayForSort.length; j++) {
                if (arrayForSort[j] < arrayForSort[index]) {
                    index = j;
                }
                    int smallerArrayNumber = arrayForSort[index]; //TODO
                    arrayForSort[index] = arrayForSort[i];
                    arrayForSort[i] = smallerArrayNumber;
                }
            }

            return null;

        }

}
