package dstruct;

public class MergeSort 
{
    public static void run (int[] array, int start, int end)
    {
        split (array, start, end);
    }
    
    public static void split (int[] array, int start, int end)
    {
        // stop when arrays are broken down to 1-element arrays
        if (end - start < 2) { return; }
        
        // partition passed in array
        var middleIndex = (start + end) / 2;
        
        // recurse by passsing in each half of the array
        split (array, start, middleIndex);
        split (array, middleIndex, end);

        // by this stage, arrays will be completely partitioned
        merge (array, start, middleIndex, end);
    }

    public static void merge (int[] array, int start, int middleIndex, int end)
    {
        /*
         * array[middleIndex - 1]   - last element in the left partition
         * array[middleIndex]       - first element in the right partition
         * 
         * Since both arrays here are sorted, if the last element of left array
         * is smaller than first element of right array, then they already must
         * be compatible (sorted), no need to do any actions.
         * Proceeding in this case would still work but give same result hence
         * the optimization
         */
        if (array[middleIndex - 1] <= array[middleIndex]) { return; }

        var i = start;
        var j = middleIndex;
        var tempIndex = 0;
        var tempArray = new int[end - start];

        /*
         * when i == middleIndex    - finished traversing left array
         * when j == end            - finished traversing right array (they may be uneven)
         * Exit loop if we finish traversing either side
         */
        while (i < middleIndex && j < end) {
            // compare elements between partitions and track the smaller of the two
            tempArray[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        /*
         * handle remaining elements we have not traversed and
         * only copy elements from left partition but not needed for right partition:
         * 
         * {32,34},{33,36} -> {32,33,34,  } // 36 is 4th index both cases, we can leave it unchanged
         * {32,36},{33,34} -> {32,33,34,  } // in this case, 36 moves from 2nd index to 4th
         * 
         * middleIndex - 1  - tells us how many elements we did not copy over to tempArray
         */
        System.arraycopy(array, i, array, start + tempIndex, middleIndex - i);
        System.arraycopy(tempArray, 0, array, start, tempIndex);
    }
}
