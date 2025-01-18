package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students;
        students = new int[5]; //칸이 5개 있는 배열을 만든거
        System.out.println(students.length);

        //변수 값 대입
        students[0] = 90;
        students[1] = 30;
        students[2] = 10;
        students[3] = 40;
        students[4] = 80;

        for (int i = 0; i <5; i++){
            System.out.println(students[i]);
        }

    }
}
