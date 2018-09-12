package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private Student[] students = new Student[10];

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup())) return true;
        return false;
    }

    void studentsByGroup() {
        // TODO:
        for(int i=0;i<10;i++)
        {
            System.out.println(students[i].getName() + "\n");
            for(int j=i+1;j<10;j++)
            {
                if (students[j].getGroup().equals(students[i].getGroup()) && !students[j].getGroup().equals("printed"))
                {
                    System.out.println(students[j].getName() + "\n");
                    students[j].setGroup("printed");
                }
            }
            students[i].setGroup("printed");
        }
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student me = new Student();
        me.setName("Nguyen Manh Hung");
        me.setId("17020788");
        me.setGroup("INT22042");
        me.setEmail("17020788@vnu.edu.vn");
        System.out.println(me.getName());
        System.out.println(me.getInfo());

        //Student p1 = new Student();
        Student p2 = new Student("Nguyen Van A","17020999","auet@vnu.edu.vn");
        Student p3 = new Student(p2);

        //System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        System.out.println(p3.getInfo());

        System.out.println(sameGroup(me,p2));
        System.out.println(sameGroup(p2,p3));

    }
}
