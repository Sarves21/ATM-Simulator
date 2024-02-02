package ATMMachine;


import java.util.*;

class ATM{

    float Balance;
    int PIN = 5672;

    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid pin");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int Option = sc.nextInt();


        if(Option == 1){
            checkBalance();
        }
        else if(Option==2){
            withdrawMoney();
        }
        else if(Option==3){
            depositMoney();
        }
        else if(Option==4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance-amount;
            System.out.println("Money Withdrawl Successful");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the Amount :");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfuly");
        menu();
    }
}

public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();

    }
}
