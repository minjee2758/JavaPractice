package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요 : ");
        for (int i = 0; i<5; i++){
            numbers[i] = scanner.nextInt();
        }

        int total =0;

        for (int number : numbers) {
            total += number;
        }

        double average = (double) total / numbers.length;

        System.out.println("입력한 정수의 합계 : "+ total);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
