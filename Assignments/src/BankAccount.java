
public class BankAccount
{
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance)
    {
            super();
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void displayInfo()
        {
            System.out.println("Account number: "+this.accountNumber +"Balance:$"+this.balance);
        }

        public void deposit(double amt)
        {
            this.balance+= amt ;
            displayInfo();
        }
        public void withdraw(double amt)
        {
            this.balance-= amt;
            displayInfo();
        }
    }

    class SavingsAccount extends BankAccount
    {
        public double interest;
        public double fee ;

        public SavingsAccount(String accountNumber, double balance, double interest,double fee)
        {
            super(accountNumber, balance);
            this.interest = interest;
            this.fee = fee;
        }
        public void deposit (double amt)
        {
            this.balance += (amt + this.balance * interest);
            displayInfo();
        }
        public void withdraw(double amt)
        {
            this.balance -= (amt + fee);
            displayInfo();
        }
    }

    class CheckingAccount extends BankAccount
    {
        public CheckingAccount(String accountNumber, double balance)
        {
            super(accountNumber,balance);
        }
        public void withdraw(double amt)
        {
            if(amt>this.balance)
                amt = balance;
            this.balance-=amt;
            displayInfo();
        }
    }

    class main
    {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount("1213A",100.0);

        SavingsAccount sa = new SavingsAccount("1231s",100.0,.05,2.5);
        CheckingAccount ca = new CheckingAccount("123c",100);

        ba.deposit(100);
        ba.withdraw(200);
        sa.deposit(50);
        sa.withdraw(120);
        ca.deposit(250);
        ca.withdraw(160);

        }
    }










