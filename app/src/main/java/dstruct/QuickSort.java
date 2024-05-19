package dstruct;

public class QuickSort 
{
    public static void run (int[] array, int start, int end)
    {
        sort (array, start, end);
    }
    
    private static void sort (int[] array, int start, int end)
    {
        if (end - start < 2) { return; } // single element array

        // figure out the index of pivot
        var pivotIndex = partition (array, start, end);
        
        sort (array, start, pivotIndex);
        sort (array, pivotIndex + 1, end); 
    }

    /*
     * Returns the correct index of pivot in the sorted array
     * By default, we are using the first element as pivot (arbitrary choice)
     */
    private static int partition (int[] array, int start, int end)
    {
        /*
         * `i` will be used for traversing left to right
         * `j` will be used for traversing right to left
         * we will stop when `i` and `j` cross each other
         */
        var pivot = array[start];
        var i = start;
        var j = end;

        while (i < j) {
            /*
             * empty loop body, we are just using the loop to decrement `j`
             * until we find element less than the pivot or `j` crosses `i`
             */
            while (i < j && array[--j] >= pivot);
            if (i< j) { array[i] = array[j]; }
            
            while (i < j && array[++i] <= pivot);
            if (i < j) { array[j] = array[i]; }
        }
        array[j] = pivot;
        
        return j;
    }
}
