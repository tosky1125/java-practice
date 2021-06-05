package shawn;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public Student(){}

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }
    public void showStudentInfo(){
        System.out.println( studentId + " 학번의 이름은 " + studentName + "이고, 주소는 " + studentAddress + "입니다.");

    }

    public String getStudentName () {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
}