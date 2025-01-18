package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int count = scanner.nextInt();

        int[] arr = new int[count];

        System.out.println("n개의 정수를 입력하시오 : ");
        for (int i = 0; i<count; i++){
            arr[i] = scanner.nextInt();
        }

        int small = arr[0];
        int max = arr[0];

        for (int i = 0; i<arr.length; i++) {
            if (arr[i] >=max){
                max = arr[i];
            }
            if (arr[i] <= small){
                small = arr[i];
            }
        }

        System.out.println("small : " + small);
        System.out.println("max : " + max);
    }
}
