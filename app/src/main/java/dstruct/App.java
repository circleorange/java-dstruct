package dstruct;

import java.util.Arrays;

import main.java.dstruct.Array;
import main.java.dstruct.BubbleSort;

public class App {

    public static void main(String[] args) {
        
        // Array
        var basicArray = new int[3];
        basicArray[0] = 20;
        basicArray[1] = 15;
        basicArray[2] = 10;
        Array.printArray(basicArray);
        
        // Bubble Sort
        int[] bubbleArray = { 20, 35, -15, 7, 55, 1 };
        BubbleSort.sort(bubbleArray);
        
    }

}
