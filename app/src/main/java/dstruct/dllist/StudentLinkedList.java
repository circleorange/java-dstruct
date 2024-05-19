package dstruct.dllist;

public class StudentLinkedList 
{
    private StudentNode head;
    private StudentNode tail;
    private int size;

    public void addToFront (Student student)
    {
        StudentNode node = new StudentNode(student);
        /*
         * Update `head` of LinkedList with the new element added to the front
         * Previous field of head will by default be initialized to null
         */
        node.setNext(head);

        if (head == null) { tail = node; }
        else { head.setPrevious(node); }
        
        head = node;
        size++;
    }

    public void addToEnd (Student s)
    {
        StudentNode node = new StudentNode(s);

        if (tail == null) { head = node; }
        else { 
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    public StudentNode removeFromFront ()
    {
        if (isEmpty()) { return null; }

        StudentNode removedNode = head;

        if (head.getNext() == null) { tail = null; }
        else { head.getNext().setPrevious(null); }
        
        head = head.getNext();
        removedNode.setNext(null);
        size--;
        
        return removedNode;
    }

    public StudentNode removeFromEnd ()
    {
        if (isEmpty()) { return null; }

        StudentNode removedNode = tail;

        if (tail.getPrevious() == null) { head = null; }
        else { tail.getPrevious().setNext(null); }
        
        tail = tail.getPrevious();
        removedNode.setPrevious(null);
        size--;
        
        return removedNode;
    }

    public int getSize () { return size; }

    public boolean isEmpty() { return head == null; }

    public void print ()
    {
        StudentNode current = head;
        System.out.println("HEAD -> ");
        while (current != null) {
            System.out.println(current);
            System.out.println(" <--> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}

