package shawn;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentName("한승하");
        student.showStudentInfo();

        Student studentTest = new Student(123, "shawn", "강남구");
        studentTest.showStudentInfo();
    }
}

