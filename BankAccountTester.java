public class BankAccountTester {
    public static void main(String[] args){
        BankAccount bob = new BankAccount(1,"poop");
        System.out.println(bob.getAccountID());
        System.out.println(bob.getBalance());
        System.out.println(bob.getPassword());
        bob.deposit(3.0);
        System.out.println(bob.getBalance());
        bob.deposit(-3.0);
        System.out.println(bob.getBalance());
        bob.withdraw(5.0);
        System.out.println(bob.getBalance());
        bob.withdraw(2.0);
        System.out.println(bob.getBalance());
    }
}
