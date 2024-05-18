package dstruct;

import java.util.Arrays;

public class ShellSort 
{
    /*
     * Shell Sort has many different ways to calculate optimal gap (interval)
     * This example takes basic approach by halving the array length
     */
    public static void sort (int[] array)
    {
        System.out.println("Shell Sort array before: " + Arrays.toString(array));
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i ++) {
                var newElement = array[i];
                var j = i;

                // if j<gap then it means we hit the front of the array
                while (j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
        System.out.println("Shell Sort array after: " + Arrays.toString(array));
    }
}
