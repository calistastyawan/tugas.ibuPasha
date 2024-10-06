public class teacher extends Person {
    String subject;
    String name;
    int age;
    int partTime;

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPartTime() {
        return this.partTime;
    }

    public void setPartTime(int partTime) {
        this.partTime = partTime;
    }
    public teacher() {
        super();
        subject = "";
        name = "";
        age = 0;
        partTime = 0;
    }

    public teacher(String subject, String name, int age, int partTime) {
        super(name, age);
        this.subject = subject;
        this.name = name;
        this.age = age;
        this.partTime = partTime;
    
    }
}
