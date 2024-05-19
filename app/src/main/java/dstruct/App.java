package dstruct;

import dstruct.dllist.Student;
import dstruct.dllist.StudentLinkedList;
import dstruct.list.Employee;
import dstruct.list.EmployeeLinkedList;
import dstruct.sort.Array;
import dstruct.sort.BubbleSort;
import dstruct.sort.Factorial;
import dstruct.sort.InsertionSort;
import dstruct.sort.MergeSort;
import dstruct.sort.QuickSort;
import dstruct.sort.SelectionSort;
import dstruct.sort.ShellSort;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;

public class App 
{
    public static void main(String[] args) 
    {
        runSort();
        runList();
        runLinkedList();
        runDoublyLinkedList();
    }

    public static void runDoublyLinkedList()
    {
        /*
         * Example of custom implementation of Linked List
         * However JDK already provides implementation of LinkedList
         */
        StudentLinkedList dllist = new StudentLinkedList();
        
        var kindred = new Student ("Kindred", "Bot", 131);
        var yasuo = new Student ("Yasuo", "Top", 132);
        var zed = new Student ("Zed", "Mid", 133);
        var yone = new Student ("Yone", "Jungle", 134);
        
        dllist.addToFront(kindred);
        dllist.addToFront(yasuo);
        dllist.addToFront(zed);
        dllist.addToFront(yone);
        
        print ("Linked List is empty? " + dllist.isEmpty());
        print ("Linked List size: " + dllist.getSize());
        dllist.print();

        dllist.removeFromFront();
        print ("Linked List size: " + dllist.getSize());
        dllist.print();
        
        var soraka = new Student ("Soraka", "Jungle", 135);
        dllist.addToEnd(soraka);
        print ("Linked List size: " + dllist.getSize());
        dllist.print();

        dllist.removeFromEnd();
        print ("Linked List size: " + dllist.getSize());
        dllist.print();
    }

    public static void runLinkedList()
    {
        EmployeeLinkedList llist = new EmployeeLinkedList();
        
        var kalista = new Employee ("Kalista", "Bot", 127);
        var vayne = new Employee ("Vayne", "Top", 128);
        var swain = new Employee ("Swain", "Mid", 129);
        var garen = new Employee ("Garen", "Jungle", 130);
        
        llist.addToFront(kalista);
        llist.addToFront(vayne);
        llist.addToFront(swain);
        llist.addToFront(garen);

        var llistSize = llist.getSize();
        var llistIsEmpty = llist.isEmpty();
        
        print ("Linked List is empty? " + llistIsEmpty);
        print ("Linked List size: " + llistSize);
        llist.print();

        llist.removeFromFront();
        llistSize = llist.getSize();
        
        print ("Linked List size: " + llistSize);
        llist.print();
    }

    public static void runVector()
    {
        /*
         * Given that `Vector` implements same class as `List`, it can easily be substituted
         * It has higher overhead costs due to built-in thread synchronization
         * Apart from that, everything is same as List
         */
        List<Employee> empList = new Vector<>();
        empList.add (new Employee ("Kalista", "Bot", 127));
        empList.add (new Employee ("Vayne", "Top", 128));
        empList.add (new Employee ("Swain", "Mid", 129));
        empList.add (new Employee ("Garen", "Jungle", 130));

    }

    public static void runList()
    {
        List<Employee> employeeList = new ArrayList<>();
        
        employeeList.add (new Employee ("Jane", "Jones", 123));
        employeeList.add (new Employee ("John", "Doe", 124));
        employeeList.add (new Employee ("Mary", "Smith", 125));
        employeeList.add (new Employee ("Mike", "Wilson", 126));

        employeeList.forEach(employee -> print(employee));  // iterate over list element
        var specificEmployee = employeeList.get(1);         // retrieve specific element
        var isEmployeeListEmpty = employeeList.isEmpty();
        var employeeListSize = employeeList.size();
        var empListContains = employeeList.contains (new Employee ("Mary", "Smith", 125));
        var indexOfElement = employeeList.indexOf(new Employee("John", "Doe", 124));
        employeeList.remove(2);
        
        print ("Specific element" + specificEmployee);
        print ("Is list empty? " + isEmployeeListEmpty);
        print ("Number of Employees: " + employeeListSize);
        print ("Mary is employed: " + empListContains);
        print ("Index of Employee: " + indexOfElement);
        
        // update existing element
        employeeList.set (1, new Employee ("John", "Adams", 124));
        print ("Updated specific element: " + employeeList.get(1));

        Employee[] employeeArray = employeeList.toArray (new Employee[employeeList.size()]);
        for (Employee employee : employeeArray) {
            print ("Employee Array: " + employee);
        }
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

    public static void print (Object arg0)
    {
        System.out.println(arg0);
    }
}
