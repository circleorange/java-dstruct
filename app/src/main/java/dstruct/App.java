package dstruct;

import main.java.dstruct.Array;

public class App {

    public static void main(String[] args) {
        
        var array = new Array();
        var arrayData = array.getArray();
        
        System.out.println("Printing array data: ");
        
        for (int i = 0; i < arrayData.length; i++) {
            System.out.println(arrayData[i]);
        }
    }
}
