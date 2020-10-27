public class BankAccountTester {
    public static void main(String[] args){
        BankAccount bob = new BankAccount(1,"poop");
        System.out.println(bob.getAccountID());
        System.out.println(bob.getBalance());
    }
}
