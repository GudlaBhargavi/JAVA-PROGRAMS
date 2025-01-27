public class Account {
    public String accountNumber;
    public double balance;

    public Account(String accountNumber,double balance){
        if (accountNumber==null || accountNumber.isEmpty()){

            System.err.println("error:account number cannot be null or empty");
            return;
        }

        if(balance<0){
            System.err.println("error:balance cannot be negative:");
            return;
        }

        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public static void main(String[] args) {
        Account account1=new Account("1234567",10000.00);
        System.out.println("Account 1 Number: " + account1.accountNumber);
        System.out.println("Account 1 Balance: " + account1.balance);

        // Test with invalid accountNumber
        Account account2 = new Account("", 400.00);

        // Test with invalid balance
        Account account3 = new Account("1230000873", -200.00);
    }
}
