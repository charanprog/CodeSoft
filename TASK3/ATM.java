package TASK3;

import java.util.Scanner;

public class ATM extends BankAccount{
    public static void main(String[] args) {
        System.out.println("Hey User!Welcome to ABC ATM Service");
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            boolean transaction = false;
            System.out.println("Select Option to perform:");
            System.out.println("1.CheckBalance " +
                    "2.DepositAmount  " +
                    "3.WithdrawAmount");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    CheckBalance();
                    System.out.println("Transaction Done Successfully !");
                    break;
                case 2:
                    double sum;
                    System.out.println("Enter Amount You want to deposite:");
                    DepositeAmount(100000, sum = input.nextDouble());
                    break;
                case 3:
                    double minus;
                    System.out.println("Enter Amount you want to Withdraw:");
                    WithdrawAmount(100000, minus = input.nextDouble());
                    break;
                default:
                    System.out.println("Invalid Selection! Try Again");
            }
            System.out.println("Do you want to perform any other Transaction(Yes/No)");
            String NewTrans = input.next();
            condition = NewTrans.equalsIgnoreCase("Yes");
        }
        System.out.println("Transactions Completed");
        System.out.println("Thanks for Visiting ! Have a good day");
    }
    public static void CheckBalance(){
        int balance=100000;
        System.out.println("Your Current available balance is:\n" + balance);
    }
    public static void DepositeAmount(double balance,double sum){
        balance += sum;
        System.out.println("Successfully your amount is Deposited in ur account");
        System.out.println("here is Your updated balance is:\n"+balance);
    }
    public static void WithdrawAmount(double balance , double minus){
        if(balance>=minus){
            balance-=minus;
            System.out.println("Successfully the amount is Withdrawn");
            System.out.println("here is Your updated balance is:\n"+balance);
        }
        else{
            System.out.println("Transaction failed,Due to insufficient balance");
            System.out.println("Here is your updated balance is:\n"+balance);
        }
    }

}
