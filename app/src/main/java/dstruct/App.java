package dstruct;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        
        // Array
        var basicArray = new int[3];
        basicArray[0] = 20;
        basicArray[1] = 15;
        basicArray[2] = 10;
        Array.printArray(basicArray);
       
        int[] starterArray = { 20, 35, -15, 7, 55, 1, 10, 11, 65, -5, 3, 54, 32 }; 
        
        var bubbleArray = starterArray.clone();
        BubbleSort.sort(bubbleArray);
        
        var selectionArray = starterArray.clone();
        SelectionSort.sort(selectionArray);
       
        var insertionArray = starterArray.clone();
        InsertionSort.sort(insertionArray);

        var shellArray = starterArray.clone();
        ShellSort.sort(shellArray);

        var factorialToCalculate = 5;
        System.out.println("Iterative Factorial: " + Factorial.interativeFactorial(factorialToCalculate));
        System.out.println("Recursive Factorial: " + Factorial.recursiveFactorial(factorialToCalculate));

        var mergeArray = starterArray.clone();
        MergeSort.run(mergeArray, 0, mergeArray.length);
        
        var quickArray = starterArray.clone();
        print("Quick Sort array before: " + Arrays.toString(quickArray));
        
        QuickSort.run(quickArray, 0, quickArray.length);
        print("Quick Sort array after: " + Arrays.toString(quickArray));
    }

    public static void print (String message)
    {
        System.out.println(message);
    }
}
