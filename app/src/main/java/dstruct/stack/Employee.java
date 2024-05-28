package dstruct.stack;

public class Employee 
{
    private String firstName;
    private String lastName;
    private int ID;

    public Employee (String firstName, String lastName, int ID)
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
        return "Employee {"+ID+","+firstName+","+lastName+"}";
    }
    
    @Override
    public boolean equals (Object o)
    {
        if (this == o) return true;
        if (o == null | getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (ID != employee.ID) return false;
        if (!firstName.equals(employee.firstName)) return false;
        return lastName.equals(employee.lastName);
    }
}
