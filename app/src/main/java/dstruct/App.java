package dstruct;

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
    }

}
