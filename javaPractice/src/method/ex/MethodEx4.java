package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance=0;
        while (true){
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            int button = scanner.nextInt();
            scanner.nextLine();
            int amount;

            switch (button) {
                case 1 :
                    System.out.print("입금액을 입력 : ");
                    amount = scanner.nextInt();
                    balance = add(amount, balance);
                    break;
                case 2 :
                    System.out.print("출금액을 입력 : ");
                    amount = scanner.nextInt();
                    balance = withDraw(amount, balance);
                    break;
                case 3 :
                    System.out.println("잔액은 : " + balance);
                    break;
                case 4 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }

        }
    }

    public static int add(int addMoney, int balance){
        balance += addMoney;
        System.out.println(addMoney + "원을 입금했습니다. 현재 잔액 : "+balance+"원.");
        return balance;
    }
    public static int withDraw(int withDrawMoney, int balance){
        balance -= withDrawMoney;
        System.out.println(withDrawMoney + "원을 출금했습니다. 현재 잔액 : "+balance+"원.");
        return balance;
    }
}
