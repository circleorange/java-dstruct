package dstruct;

import dstruct.sort.RadixSort;

public class App {

    public static void main(String[] args) {

        int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
        var radixSort = new RadixSort(radixArray, 10, 4);
        radixSort.sort();
        radixSort.print();
    }

    public static void print (Object arg0) {

        System.out.println(arg0);
    }
}
