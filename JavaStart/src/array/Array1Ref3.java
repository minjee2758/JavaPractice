package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70,60,50}; //칸이 5개 있는 배열을 만든거
        System.out.println(students.length);

        for (int i = 0; i <students.length; i++){
            System.out.println(students[i]);
        }

    }
}
