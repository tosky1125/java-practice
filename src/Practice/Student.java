package Practice;

public class Student {
    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKorea(String name, int score)
    {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMath(String name, int score)
    {
        math.subjectName = name;
        math.score = score;
    }

    public void showScore() {
        int score = korea.score + math.score;
        System.out.println(studentName + "님의 점수는 " +score+ "입니다.");
    }
}
