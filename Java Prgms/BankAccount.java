class BankAccount {
    private String accountNumber, ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Account: " + accountNumber + ", Owner: " + ownerName + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", "Alice", 1000);
        account.displayBalance();
        account.deposit(500);
        account.withdraw(300);
        account.displayBalance();
    }
}
