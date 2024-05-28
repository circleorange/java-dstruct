package dstruct;

import dstruct.stack.ArrayStack;
import dstruct.stack.Employee;

public class App 
{
    public static void main(String[] args) 
    {
        ArrayStack stack = new ArrayStack(3);
       
        var kindred = new Employee ("Kindred", "Bot", 131);
        var yasuo = new Employee ("Yasuo", "Top", 132);
        var zed = new Employee ("Zed", "Mid", 133);
        var yone = new Employee ("Yone", "Jungle", 134);

        print ("Stack size: " + stack.size());
        print ("Adding objects to stack...");
       
        stack.push(kindred);
        stack.push(yasuo);
        stack.push(zed);
        stack.push(yone);

        print ("Stack size: " + stack.size());
        stack.printStack();

        print ("Stack top: " + stack.peek());

        stack.pop();

        print ("Stack top: " + stack.peek());
    }

    public static void print (Object arg0)
    {
        System.out.println(arg0);
    }
}
