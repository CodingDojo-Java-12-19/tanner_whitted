public class BankAccountTest {
    public static void main (String[] args) {
        BankAccount self = new BankAccount();
        self.depositChecking(10);
        self.withdrawChecking(5);
        self.checkingAmount();
        self.view();
    }
}