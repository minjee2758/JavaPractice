package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력 : ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("n개의 정수를 입력하세요 : ");
        for (int i =0; i<n; i++){
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        double average;

        for (int number : numbers) {
            sum += number;
        }
        average = (double) sum / numbers.length;

        System.out.println("total : "+sum);
        System.out.println("average : " + average);

    }
}
