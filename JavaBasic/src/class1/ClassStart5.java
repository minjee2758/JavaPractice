package class1;

public class ClassStart5 {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.name = "st1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "st2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = {student1, student2};

        for (int i = 0; i<students.length; i++){
            System.out.println(students[i].name + students[i].age + students[i].grade);
        }
        for (Student student : students) {
            System.out.println(student.age + student.name + student.grade);

        }
    }
}
