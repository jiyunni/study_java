class Student extends Person {
    private long sid;
    private String major;

    public Student() {
        super();
        this.sid = -1;
        this.major = "모름";
    }

    public Student(String name) {
        super(name);
        this.sid = -1;
        this.major = "모름";
    }

    public Student(String name, long sid) {
        super(name);
        this.sid = sid;
        this.major = "모름";
    }

    public Student(String name, long sid, String major) {
        super(name);
        this.sid = sid;
        this.major = major;
    }

    public String toString() {
        return ", 학번: " + (sid == -1 ? "모름" : sid) + ", 전공: " + major;
    }

    public String printSafely() {
        return "이름: " + getName() + ", 학번: " + (sid == -1 ? "모름" : sid) + ", 전공: " + major;
    }
}

public class Practice30 {

    public static void main(String[] args) {
        Person person1 = new Person("김동덕", 22, "서울시");
        Person person2 = new Person("홍길동", 30, "제주시");
        Person person3 = new Person("성춘향", 16, "남원시");

        Student student1 = new Student("김동덕", 20132468, "컴퓨터학");
        Student student2 = new Student("홍길동", 20111234, "컴퓨터학");
        Student student3 = new Student("성춘향", 20121357, "국문학");

        System.out.println(person1.toString() + student1.toString());
        System.out.println(person2.toString() + student2.toString());
        System.out.println(person3.toString() + student3.toString());

        System.out.println(student1.printSafely());
        System.out.println(student2.printSafely());
        System.out.println(student3.printSafely());
        
        String s = "hello world";
        char c = s.charAt(0);
        System.out.println(c);
        
        String a ="haha table";
        int index = a.indexOf("table");
        System.out.println(index);

    }

}
