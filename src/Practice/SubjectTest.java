package Practice;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentLee = new Student(1, "lee");
        studentLee.setKorea("korea",100);
        studentLee.setMath("math",100);
        Student studentKim = new Student(2, "kim");
        studentKim.setKorea("korea",50);
        studentKim.setMath("math",90);

        studentKim.showScore();
        studentLee.showScore();
    }
}
