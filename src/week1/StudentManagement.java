package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student me = new Student();
        me.setName("Nguyen Manh Hung. ");
        me.setId("17020788. ");
        me.setGroup("Nhom 3. ");
        me.setEmail("17020788@vnu.edu.vn. ");
        System.out.println(me.getName());
        System.out.println(me.getInfo());
    }
}
