package SorteTasks;

import java.util.Arrays;

public class Sorte {
    public static void main(String[] args) {
        int[] array = {7, 31, 15, 4, 6, 5, 13, 1, 9};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }


    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;

                }
            }
        }
    }

}