package dstruct;

import java.util.Arrays;

import dstruct.sort.Array;
import dstruct.sort.BubbleSort;
import dstruct.sort.Factorial;
import dstruct.sort.InsertionSort;
import dstruct.sort.MergeSort;
import dstruct.sort.QuickSort;
import dstruct.sort.SelectionSort;
import dstruct.sort.ShellSort;

public class App 
{
    public static void main(String[] args) 
    {
        runSort();
    }

    public static void runSort()
    {
        // Array
        var basicArray = new int[3];
        basicArray[0] = 20;
        basicArray[1] = 15;
        basicArray[2] = 10;
        Array.printArray(basicArray);
       
        var factorialToCalculate = 5;
        print("Iterative Factorial: " + Factorial.interativeFactorial(factorialToCalculate));
        print("Recursive Factorial: " + Factorial.recursiveFactorial(factorialToCalculate));

        int[] starterArray = { 20, 35, -15, 7, 55, 1, 10, 11, 65, -5, 3, 54, 32 }; 
        
        var bubbleArray = starterArray.clone();
        var selectionArray = starterArray.clone();
        var insertionArray = starterArray.clone();
        var shellArray = starterArray.clone();
        var mergeArray = starterArray.clone();
        var quickArray = starterArray.clone();
        
        print("Starting array for all before sort: " + Arrays.toString(quickArray));
        
        BubbleSort.sort(bubbleArray);
        SelectionSort.sort(selectionArray);
        InsertionSort.sort(insertionArray);
        ShellSort.sort(shellArray);
        MergeSort.run(mergeArray, 0, mergeArray.length);
        QuickSort.run(quickArray, 0, quickArray.length);
        
        print("Bubble Sort array after: " + Arrays.toString(bubbleArray));
        print("Selection Sort array after: " + Arrays.toString(selectionArray));
        print("Insertion Sort array after: " + Arrays.toString(insertionArray));
        print("Shell Sort array after: " + Arrays.toString(shellArray));
        print("Merge Sort array after: " + Arrays.toString(mergeArray));
        print("Quick Sort array after: " + Arrays.toString(quickArray));
    }

    public static void print (String message)
    {
        System.out.println(message);
    }
}
