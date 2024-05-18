package dstruct;

import java.util.Arrays;

public class InsertionSort 
{
    public static void sort (int[] array) 
    {
        System.out.println("Insertion Sort array before: " + Arrays.toString(array));
        /*
         * After every iteration, the first unsorted index will increase by 1
         * as we are moving left to right and growing the sorted partition
         * on the left
         */
        for (
            int firstUnsortedIndex = 1;
            firstUnsortedIndex < array.length;
            firstUnsortedIndex++
        ) {
            var newElement = array[firstUnsortedIndex];
            int i;

            /*
             * Start out with inserting the first element,
             * Continue loop until we don't hit start of array and
             * as long as we have not found the correct location (lesser or equal element)
             */
            for (
                i = firstUnsortedIndex;
                i > 0 && array[i-1] > newElement;
                i--
            ) {
                array[i] = array[i-1]; // shift left to right
            }
            array[i] = newElement;
        }
        System.out.println("Insertion Sort array before: " + Arrays.toString(array));
    }
}
