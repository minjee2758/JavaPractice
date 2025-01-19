package method.ex;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        int depositAmount = 1000;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + Deposit(balance,depositAmount) + "원");


        // 출금 2000
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " +
                    withDraw(withdrawAmount, balance) + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종 잔액: " + withDraw(withdrawAmount, balance) + "원");
    }
    public static int Deposit(int balance, int despositAmount){
        balance += despositAmount;
        return balance;
    }
    public  static int withDraw(int withdrawAmount, int balance){
        balance -= withdrawAmount;
        return balance;
    }
}
