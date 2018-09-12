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
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.group = "INT22041";
        this.email = em;
        this.id = sid;
        this.name = n;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group = s.group;
    }

    String getInfo() {
        // TODO:
        return "Name: " + this.name + " - " + "ID: " + this.id + " - " + "Group: " + this.group + " - " + "Email: " + this.email;
    }
}
