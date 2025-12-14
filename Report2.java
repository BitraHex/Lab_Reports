class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("Error: Initial balance cannot be negative.");
    }

   
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("Error: Balance cannot be negative.");
    }
}

public class Report2 {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Ayrin", 5000);
        BankAccount acc2 = new BankAccount(102, "Siam", 7000);
        BankAccount acc3 = new BankAccount(103, "Tara", 10000);

        acc1.setBalance(6000);
        acc2.setBalance(-500); 
        acc3.setBalance(12000);

        System.out.println("Account 1 Details:");
        System.out.println("Account Number: " + acc1.getAccountNumber());
        System.out.println("Account Holder: " + acc1.getAccountHolderName());
        System.out.println("Balance: " + acc1.getBalance());

        System.out.println("\nAccount 2 Details:");
        System.out.println("Account Number: " + acc2.getAccountNumber());
        System.out.println("Account Holder: " + acc2.getAccountHolderName());
        System.out.println("Balance: " + acc2.getBalance());

        System.out.println("\nAccount 3 Details:");
        System.out.println("Account Number: " + acc3.getAccountNumber());
        System.out.println("Account Holder: " + acc3.getAccountHolderName());
        System.out.println("Balance: " + acc3.getBalance());

        
    }
}
