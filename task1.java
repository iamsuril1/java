class BankAccount {
    // Private fields
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for accountNumber
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew: " + amount);
        } else if (amount > getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a bank account
        BankAccount account = new BankAccount("12345678", 500.0);

        // Accessing account details using getters
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Deposit money using the deposit method
        account.deposit(200.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money using the withdraw method
        account.withdraw(100.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Attempt to withdraw an amount exceeding the balance
        account.withdraw(700.0);

        // Attempt to deposit a negative amount
        account.deposit(-50.0);

        // Attempt to withdraw a negative amount
        account.withdraw(-30.0);
    }
}
