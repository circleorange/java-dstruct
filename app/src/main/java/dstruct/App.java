package dstruct;

public class App {

    public static void main(String[] args) {
        
        // Array
        var basicArray = new int[3];
        basicArray[0] = 20;
        basicArray[1] = 15;
        basicArray[2] = 10;
        Array.printArray(basicArray);
        
        int[] bubbleArray = { 20, 35, -15, 7, 55, 1 };
        BubbleSort.sort(bubbleArray);
        
        int[] selectionArray = { 20, 35, -15, 7, 55, 1 };
        SelectionSort.sort(selectionArray);
       
        int[] insertionArray = { 20, 35, -15, 7, 55, 1 };
        InsertionSort.sort(insertionArray);
    }

}
