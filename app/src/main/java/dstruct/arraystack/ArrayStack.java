package dstruct.arraystack;

import java.util.EmptyStackException;

public class ArrayStack 
{
    private Employee[] stack;
    private int top;

    public ArrayStack (int capacity) {
        // capacity is the maximum number of objects we can store
        stack = new Employee[capacity];
    }

    public void push (Employee employee) 
    {
        if (top == stack.length) {
            /*
             * Check if stack is full
             * May need to resize backing array
             * Resizing by multiple of two
             */
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }

    public Employee pop ()
    {
        // check if stack is not empty
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        // top contains index of next available position in array
        // there is always noting at top
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek ()
    {
        if (isEmpty()) { throw new EmptyStackException(); }

        return stack[top - 1];
    }

    public int size ()
    {
        return top;
    }

    public boolean isEmpty ()
    {
        return top == 0;
    }

    public void printStack ()
    {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
