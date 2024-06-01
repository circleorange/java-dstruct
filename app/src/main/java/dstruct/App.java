package dstruct;

import dstruct.search.BinarySearch;

public class App {

    public static void main(String[] args) {

        int[] array = { -22, -15, 1, 7, 20, 35, 55 };
        BinarySearch bs = new BinarySearch(array);

        print("Normal Search...");
        print("Result: " + bs.find(-15));
        print("Result: " + bs.find(35));
        print("Result: " + bs.find(56));

        print("Recusive Search...");
        print("Result: " + bs.findRecursively(-15));
        print("Result: " + bs.findRecursively(35));
        print("Result: " + bs.findRecursively(56));
    }

    public static void print (Object arg0) {

        System.out.println(arg0);
    }
}
