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
