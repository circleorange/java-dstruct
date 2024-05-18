package main.java.dstruct;

import java.util.Arrays;

public class SelectionSort 
{
    public static void sort (int[] array)
    {
        System.out.println("Selection Sort array before: " + Arrays.toString(array));
        
        for (
            int lastUnsortedIndex = array.length - 1;
            lastUnsortedIndex > 0;
            lastUnsortedIndex--
        ) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (array[i] > array[largest]) { largest = i; }
            }
            BubbleSort.swap(array, largest, lastUnsortedIndex);
        }
        
        System.out.println("Selection Sort array after: " + Arrays.toString(array));
    }
}
