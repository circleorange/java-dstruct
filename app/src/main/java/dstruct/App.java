package dstruct;

import dstruct.arrayqueue.ArrayQueue;
import dstruct.arrayqueue.Employee;

public class App 
{
    public static void main(String[] args) 
    {
        var kindred = new Employee ("Kindred", "Bot", 131);
        var yasuo = new Employee ("Yasuo", "Top", 132);
        var zed = new Employee ("Zed", "Mid", 133);
        var yone = new Employee ("Yone", "Jungle", 134);

        ArrayQueue queue = new ArrayQueue(5);

        queue.add(kindred);
        queue.add(yasuo);
        queue.add(zed);
        queue.add(yone);

        queue.printQueue();

        print("Removing top element...");

        queue.remove();

        queue.printQueue();

        print("Peeking queue...");
        print(queue.peek());
    }

    public static void print (Object arg0)
    {
        System.out.println(arg0);
    }
}
