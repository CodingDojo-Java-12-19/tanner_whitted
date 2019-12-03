import java.util.Random;

import org.omg.CORBA.Any;

public class BankAccount {
    private String accountNumber;
    public double checkingBalance;
    public double savingBalance;

    public static int numOfAccounts = 0;
    public static double totalMoney = 0;
    public static String generateAccount() {
        String crnt = "";
        Random r = new Random();
        for (int i = 0; i < 10; i++){
            crnt +=r.nextInt(10);
        }
        return crnt;
    }

    public BankAccount() {
        this.checkingBalance = 0;
        this.savingBalance = 0;
        this.accountNumber = BankAccount.generateAccount();
        BankAccount.numOfAccounts++;
    }

    public void checkingAmount(){
        System.out.println("$" + this.checkingBalance + " in checkings");
    }
    public void savingAmount(){
        System.out.println("$" + this.savingBalance + " in savings");
    }

    public void depositChecking(double money) {
        this.checkingBalance += money;
        System.out.println("You have deposited $" + money + " to checkings");
    }
    public void depositSaving(double money) {
        this.savingBalance += money;
        System.out.println("You have deposited $" + money + " to savings");
    }

    public void withdrawChecking(int money) {
        if(this.checkingBalance - money <= 0) {
            System.out.println("Cannot withdraw that amount");
        } else {
            this.checkingBalance -= money;
            System.out.println("You have pulled $" + money + " from checkings");
        }
    }
    public void withdrawSaving(int money) {
        if(this.savingBalance - money <= 0){
            System.out.println("Cannot withdraw that amount");
        } else {
            this.savingBalance -= money;
            System.out.println("You have pulled $" + money + " from savings");      
        }
    }

    public void view(){
        System.out.println("Checking : $" + this.checkingBalance + " | Saving : $" + this.savingBalance);
    }
}