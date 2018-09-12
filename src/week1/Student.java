package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String name,id,group,email;

    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName() {
        return name;
    }
    public void setName(String n)
    {
        this.name = n;
    }

    public String getId()
    {
        return id;
    }
    public void setId(String n)
    {
        this.id = n;
    }

    public String getGroup()
    {
        return group;
    }
    public void setGroup(String n)
    {
        this.group = n;
    }

    public String getEmail()
    {
        return email;
    }
    public void setEmail(String n)
    {
        this.email = n;
    }

    /**
     * Constructor 1
     */
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        return "Name: " + this.name + "ID: " + this.id + "Group: " + this.group + "Email: " + this.email;
    }
}
