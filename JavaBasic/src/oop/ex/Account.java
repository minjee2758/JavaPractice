package oop.ex;

public class Account {
    int balance;
    int deposit(int amount){
        return balance+=amount;
    }
    int withdraw(int amount){
        if (amount>balance){
            System.out.println("잔액 부족");
        }else {
            balance-=amount;
        }
        return balance;
    }
}
