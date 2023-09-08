public class Main {
    public static void main(String[] args) {
        /* bankAccount bankAccount = new bankAccount ("12345", 1000.00,
                "Bob Brown", "myemail@email.com",
                "(444) 444-4444");
*/
        bankAccount bankAccount = new bankAccount();
        System.out.println(bankAccount.getPhoneNumber());
        System.out.println(bankAccount.getBalance());


        bankAccount timsAccount = new bankAccount("Tim", "tim@email.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getPhoneNumber() + "; name " +
                timsAccount.getCustomerName());
    }
}