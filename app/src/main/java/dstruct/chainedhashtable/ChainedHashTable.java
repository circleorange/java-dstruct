package dstruct.chainedhashtable;

import dstruct.StoredEmployee;
import dstruct.Employee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashTable () {

        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }
    }

    public void put (String key, Employee employee) {

        int haskedKey = hashKey(key);
        hashtable[haskedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get (String key) {

        int haskedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[haskedKey].listIterator();
        StoredEmployee employee = null;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key)) {
                
                return employee.employee;
            }
        }

        return null;
    }

    public Employee remove (String key) {

        int haskedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[haskedKey].listIterator();
        StoredEmployee employee = null;
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key)) {
                
                break;
            }
        }

        if (employee == null || !employee.key.equals(key)) {

            return null;
        }
        hashtable[haskedKey].remove(index);

        return employee.employee;
    }

    private int hashKey (String key) {

        return key.length() % hashtable.length;
    }

    public void print () {

        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": null");
            }
            else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> iter = hashtable[i].listIterator();
                while (iter.hasNext()) {
                    System.out.print(iter.next().employee);
                    System.out.print(" --> ");
                }
                System.out.println("null");
            }
        }
    }
}
