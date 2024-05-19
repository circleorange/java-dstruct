package dstruct.sort;

public class Utils 
{
    public static void swap(int[] array, int i, int j) 
    {
        if (i == j) { return; } // no elements to swap 

        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
