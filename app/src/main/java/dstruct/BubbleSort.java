package main.java.dstruct;

import java.util.Arrays;

public class BubbleSort {

    public BubbleSort() {
        throw new UnsupportedOperationException("Utility class, use functions directly without instantiation.");
    }

    /*
     * Bubble sort
     * 
     * Starting with outer loop, we want to bubble the largest values
     * Therefore, the sorted partition is growing from right to left
     * Last unsorted index starts at the end and moves to the left by 1
     * Inner loop can skip going into already sorted partition
     */
    public static void sort(int[] array) 
    {
        System.out.println("Bubble Array before sort: " + Arrays.toString(array));

        for (
            int lastUnsortedIndex = array.length - 1; 
            lastUnsortedIndex > 0; 
            lastUnsortedIndex--
        ) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
        System.out.println("Bubble Array after sort: " + Arrays.toString(array));
    }

    public static void swap(int[] array, int i, int j) 
    {
        if (i == j) { return; } // no elements to swap 

        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
