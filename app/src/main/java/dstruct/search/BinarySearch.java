package dstruct.search;

/*
 * - Data must be sorted
 * - Chooses element in middle of array, compares, splits, recursively
 */
public class BinarySearch {

    private int[] array;

    public BinarySearch (int[] array) {

        this.array = array;
    }

    public int find (int query) {

        int start = 0;
        int end = array.length;
        while (start < end) {
            int midPoint = (start + end) / 2;
            System.out.println("Current mid point: " + midPoint);
            if (array[midPoint] == query) {

                return midPoint;
            }
            else if (array[midPoint] < query) {
                // search right parition of array
                start = midPoint + 1;
            }
            else {
                // search left parition of array
                end = midPoint;
            }
        }

        return -1;
    }

    public int findRecursively (int query) {

        return findRecursively(0, array.length, query);
    }

    public int findRecursively (int start, int end, int query) {

        // break condition for recursion
        if (start >= end) return -1;

        int midPoint = (start + end) / 2;
        System.out.println("Current mid point: " + midPoint);

        if (array[midPoint] == query) {

            return midPoint;
        }
        else if (array[midPoint] < query) {

            return findRecursively(midPoint + 1, end, query);
        }
        else {

            return findRecursively(start, midPoint, query);
        }

    }
}
