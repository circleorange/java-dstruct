package dstruct;

import dstruct.hashtable.Employee;
import dstruct.hashtable.SimpleHashTable;

public class App {

    public static void main(String[] args) {

        var kindred = new Employee ("Kindred", "Bot", 131);
        var yasuo = new Employee ("Yasuo", "Top", 132);
        var zed = new Employee ("Zed", "Mid", 133);
        var yone = new Employee ("Yone", "Jungle", 134);

        SimpleHashTable sht = new SimpleHashTable();
        
        sht.put("kindred", kindred);
        sht.put("yasuo", yasuo);
        sht.put("zedd", zed);
        sht.put("yone", yone);

        sht.print();
        print("Retrieve employee: " + sht.get("yone"));
        print("Removing employee...");
        sht.remove("yasuo");
        sht.print();
        print("Retrieve employee: " + sht.get("kindred"));
    }

    public static void print (Object arg0) {

        System.out.println(arg0);
    }
}
