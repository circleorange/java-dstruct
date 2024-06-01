package dstruct.search;

public class LinearSearch {

    private int[] array;

    public LinearSearch (int[] array) {

        this.array = array;
    }

    public int find (int query) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                
                return i;
            }
        }

        return -1;
    }

}
