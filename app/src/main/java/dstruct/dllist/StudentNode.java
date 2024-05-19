package dstruct.dllist;

public class StudentNode 
{
    private Student student;
    private StudentNode next;
    private StudentNode previous;

    public StudentNode (Student student)
    {
        this.student = student;
    }

    public Student getStudent() { return student; }
    public StudentNode getNext() { return next; }
    public StudentNode getPrevious() { return previous; }

    public void setStudent (Student employee) { this.student = employee; }
    public void setNext (StudentNode next) { this.next = next; }
    public void setPrevious (StudentNode previous) { this.previous = previous; }

    public String toString ()
    {
        return student.toString();
    }
}

