package dstruct.dllist;

public class Student 
{
    private String firstName;
    private String lastName;
    private int ID;

    public Student (String firstName, String lastName, int ID)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    public void setFirstName (String firstName) { this.firstName = firstName; }
    public void setLastName (String lastName) { this.lastName = lastName; }
    public void setID (int ID) { this.ID = ID; }

    public String getFirstName () { return this.firstName; }
    public String getLastName () { return this.lastName; }
    public int getID () { return this.ID; }

    @Override
    public String toString ()
    {
        return "Student {"+ID+","+firstName+","+lastName+"}";
    }
    
    @Override
    public boolean equals (Object o)
    {
        if (this == o) return true;
        if (o == null | getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (ID != student.ID) return false;
        if (!firstName.equals(student.firstName)) return false;
        return lastName.equals(student.lastName);
    }
}

