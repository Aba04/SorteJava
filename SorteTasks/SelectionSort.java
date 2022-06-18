package SorteTasks;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {7, 31, 15, 4, 6, 5, 13, 1, 9};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
        public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                int min = arr[i];
                int min_i = i;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        min_i = j;
                    }
                }
                if (i != min_i) {
                    int tmp = arr[i];
                    arr[i] = arr[min_i];
                    arr[min_i] = tmp;
                }
            }
        }
    }
