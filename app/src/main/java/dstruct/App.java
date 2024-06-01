package dstruct;

import dstruct.linearsearch.LinearSearch;

public class App {

    public static void main(String[] args) {

        int[] array = { 20, -35, -15, 7, 55, 1, -22 };
        LinearSearch ls = new LinearSearch(array);
        print("Result: " + ls.find(-15));
    }

    public static void print (Object arg0) {

        System.out.println(arg0);
    }
}
