// day 5 for inheritance and polymorphism
class BankAccount{
    int accountNumber;
    double balance;
    BankAccount(int accno,double balance){
        this.accountNumber = accno;
        this.balance = balance;
    }
    void deposite(double amount){
        balance += amount;
        System.out.println("Deposite :" + amount);
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn :"+amount);
        }
        else{
            System.out.println("Insufficent balance!");
        }
    }
    void displayBalance(){
        System.out.println("Acount "+accountNumber + " balance " + balance);
    }
}
class SavingsAccount extends BankAccount{
    double interestrate;
    SavingsAccount(int accno , double balance , double interestrate){
        super(accno,balance);
        this.interestrate = interestrate;
    }
    void addInterest(){
        double interest = balance * interestrate / 100;
        balance += interest;
        System.out.println("Interest added :" + interest);
    }
}
class CurrentAccount extends BankAccount{
    double overdraftlimit;
    CurrentAccount(int accno,double balance,double overdraftlimit){
        super (accno,balance);
        this.overdraftlimit = overdraftlimit;
    }
    void withdraw(double amount){
        if(amount <= balance + overdraftlimit){
            balance -= amount;
            System.out.println("Withdrawn :" + amount);
        }
        else{
            System.out.println("Overdraft limit exceeded");
        }
    }
}
class day5{
    public static void main (String[]arge){
        BankAccount acc1 = new SavingsAccount(101,5000,5);
        BankAccount acc2 = new CurrentAccount(102,3000,2000);
        acc1.deposite(2000);
        acc1.withdraw(1000);
        acc1.displayBalance();
        ((SavingsAccount) acc1).addInterest();
        acc1.displayBalance();
        System.out.println("------------------------------------------");
        acc2.deposite(1000);
        acc2.withdraw(5000);
        acc2.displayBalance();
        acc2.withdraw(3000);
    }
}