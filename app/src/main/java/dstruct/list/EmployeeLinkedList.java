package dstruct.list;

public class EmployeeLinkedList 
{
    private EmployeeNode head;
    private int size;

    public void addToFront (Employee employee)
    {
        EmployeeNode node = new EmployeeNode(employee);
        /*
         * Update `head` of LinkedList with the new element added to the front
         */
        node.setNext(head);
        head = node;
        size++;
    }

    public EmployeeNode removeFromFront ()
    {
        if (isEmpty()) { return null; }

        EmployeeNode removedNode = head;
        
        head = head.getNext();
        removedNode.setNext(null);
        
        size--;
        
        return removedNode;
    }

    public int getSize () { return size; }

    public boolean isEmpty() { return head == null; }

    public void print ()
    {
        EmployeeNode current = head;
        System.out.println("HEAD -> ");
        while (current != null) {
            System.out.println(current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
