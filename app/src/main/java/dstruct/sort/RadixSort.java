package dstruct.sort;

/*
 * Assumptions about data:
 *  - Must have same radix
 *  - Must have same width
 * This implies, data must be integers or strings
 * 
 * Algorithm sorts based on individual character, starting at right-most position
 * -> sort by 1's, sort by 10's, sort by 100's, etc.
 * - Must use stable sort algorithm
 */
public class RadixSort {

    private int[] array;
    private int radix;
    private int width;

    public RadixSort (int[] array, int radix, int width) {

        this.array = array;
        this.radix = radix;
        this.width = width;
    }

    public void sort () {

        for (int i = 0; i < width; i++) {
            singleSort(array, i, radix);
        }
    }

    public void singleSort (int[] array, int position, int radix) {

        var numItems = array.length;
        var countArray = new int[radix];
        // Do the counting of how many values have specific digit at index we are looking at
        for (int value : array) {
            countArray[getDigit(position, value, radix)]++;
        } 
        // Adjust the count array (stable counting sort)
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        // Write the values into temporary array
        var temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, array[tempIndex], radix)]] = array[tempIndex]; 
        }
        // Copy temporary array into original array
        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            array[tempIndex] = temp[tempIndex];
        }
    }

    public int getDigit (int position, int value, int radix) {

        return value / (int) Math.pow(radix, position) % radix;
    }

    public void print () {

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
