package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStuent(student1, "ss", 22, 60);

        Student student2 = new Student();
        initStuent(student2, "나", 20, 30);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStuent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student){
        System.out.println("name : "+ student.name + " age : "+student.age + " grade " + student.grade);
    }

}
