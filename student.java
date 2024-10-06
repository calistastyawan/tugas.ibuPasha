public class student extends Person{
    String major;
    int score;
    int studentNumber;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    } 

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public student() {
        super();
        major = "";
        score = 0;
        studentNumber = 0;
    }

    public student(String name, int age, String major, int score, int studentNumber) {
        super(name, age);
        this.major = major;
        this.score = score;
        this.studentNumber = studentNumber;
    }
    
    
}
