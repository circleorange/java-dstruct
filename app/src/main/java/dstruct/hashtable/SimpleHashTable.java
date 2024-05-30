package dstruct.hashtable;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable() {

        hashtable = new StoredEmployee[10];
    }

    public void put (String key, Employee employee) {

        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashKey(key);
            if (hashedKey == hashtable.length -1) {
                hashedKey = 0;
            }
            else { hashedKey++; }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if (occupied(hashedKey)) {
            System.out.println("Array is full");
            
            return;
        }
        hashtable[hashedKey] = new StoredEmployee(key, employee);

        return;
    }

    private int findKey (String key) {

        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            
            return hashedKey;
        }
        int stopIndex = hashKey(key);
        if (hashedKey == hashtable.length -1) {
            hashedKey = 0;
        }
        else { hashedKey++; }
        while (
            hashedKey != stopIndex 
            && hashtable[hashedKey] != null
            && !hashtable[hashedKey].key.equals(key)
        ) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {

            return hashedKey;
        }
        
        return -1;
    }

    public Employee get (String key) {

        int hashedKey = findKey(key);
        if (hashedKey == -1) { return null; }

        return hashtable[hashedKey].employee;
    }

    public Employee remove (String key) {

        int hashedKey = findKey(key);
        if (hashedKey == -1) { return null; }
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        // rehashing after removing entry
        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length; i++) {
            if (oldHashTable[i] != null) {
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }

        return employee;
    }

    private int hashKey (String key) {

        return key.length() % hashtable.length;
    }

    private boolean occupied (int index) {

        return hashtable[index] != null;
    }

    public void print () {

        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println(i + ": null");
            }
            else {
                System.out.println(i + ": " + hashtable[i].employee);
            }
        }

        return;
    }
}
