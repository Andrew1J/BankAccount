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
    public void setPassword(String newPass) {
        password = newPass;
    }
    public boolean deposit(double amount){
        if(amount>=0){
            balance += amount;
            return true;
        } else {
            return false;
        }
    }
    public boolean withdraw(double amount){
        if(amount>=0&&balance-amount>=0){
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return "" + accountID + "\t" + balance;
    }
}
