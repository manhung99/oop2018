package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    private Student[] students = new Student[100];
    public int numberofstudent = 4;

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        if(s1.getGroup().equals(s2.getGroup())) return true;
        return false;
    }

    void studentsByGroup() {
        // TODO:
        int sbg[] = new int[numberofstudent];

        for(int i=0;i<numberofstudent;i++)
        {
            if (sbg[i] != 1)System.out.println(students[i].getInfo());
            for(int j=i+1;j<numberofstudent;j++)
            {
                if (students[j].getGroup().equals(students[i].getGroup()) && sbg[j] != 1)
                {
                    System.out.println(students[j].getInfo());
                    sbg[j] = 1;
                }
            }
            sbg[i] = 1;
        }
    }

    void removeStudent(String id) {
        // TODO:
        int index = -1;
        for(int i=0;i<numberofstudent;++i) {
            if(students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        if(index!=-1){
            students[index]=null;
            for(int i = index;i<numberofstudent;i++) {
                students[i] = students[i+1];
            }
        }
        else System.out.println("Invalid To Remove Student By This Id");
        students[numberofstudent]=null;
        numberofstudent--;
    }

    public static void main(String[] args) {
        // TODO:
        //6
        Student me = new Student();
        me.setName("Nguyen Manh Hung");
        me.setId("17020788");
        me.setGroup("INT22042");
        me.setEmail("17020788@vnu.edu.vn");
        //System.out.println(me.getName());
        //System.out.println(me.getInfo());

        //8
        Student s1 = new Student();
        Student s2 = new Student("Nguyen Van A","17020998","auet@vnu.edu.vn");
        Student s3 = new Student("Nguyen Van B","17020999","auet@vnu.edu.vn");

        /*System.out.println(s1.getInfo());
        System.out.println(s2.getInfo());
        System.out.println(s3.getInfo());*/

        //10
        /*System.out.println(sameGroup(me,s2));
        System.out.println(sameGroup(s2,s3));*/

        //12
        StudentManagement sm = new StudentManagement();
        sm.students[0] = me;
        sm.students[1] = s1;
        sm.students[2] = s2;
        sm.students[3] = s3;

        sm.removeStudent("000");

        sm.studentsByGroup();
    }
}
