public class bankAccount {
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount() {
        this("56789", 2.50, "Default name",
                "Default address", "Default phone");
        System.out.println("Empty constructor called.");
    }
    public bankAccount(String number, double balance, String customerName, String email, String phone){
        System.out.println("Account constructor with parameters called");

        this.phoneNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        phoneNumber = phone;
    }

    public bankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double depositAmt){
        balance += depositAmt;
        System.out.println("Deposit of $" + depositAmt +" successful. New balance is: $" + balance);
    }
    public void withdraw (double withdrawAmt){
        if ((balance-= withdrawAmt) < 0){
            System.out.println("This will result in a negative balance. Please try again.");
        }else {
            balance-=withdrawAmt;
            System.out.println("Withdrawal of: $" + withdrawAmt + " successful. Your new balance is: $" + balance);
    }}
}
