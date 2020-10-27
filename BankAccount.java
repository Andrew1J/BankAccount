public class BankAccount {
    private double balance;
    private int accountID;
    private String password;
    public BankAccount(int id, String pwd) {
        accountID = id;
        password = pwd;
        balance = 0;
    }
    public int getAccountID() {
        return accountID;
    }
    public double getBalance() {
        return balance;
    }
    public String getPassword() {
        return password;
    }
}
