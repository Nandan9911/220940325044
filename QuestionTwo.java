import java.util.Scanner;
class BankAccount
{
	private int accno;
	private double balance;
	
	public BankAccount(){}
	
	public BankAccount(int accno,double balance)
	{
		this.accno=accno;
		this.balance=balance;
	}
	
	void withdraw(double amount) throws BankAccountException
	{
		if(balance<amount)
			throw new BankAccountException("Available balance is less than withdrawal amount.\nPlease deposit more money or change your withdrawal amount.\n");
		else
			balance -= amount;
	}
	
	void deposit(double amount)
	{
		balance += amount;
	}
	
	void show()
	{
		System.out.println("Your account information is as below");
		System.out.println();
		System.out.println("Account Number :"+accno);
		System.out.println("Current Balance :"+balance);
	}
}

class BankAccountException extends Exception
{
	String exceptionMessage;
	public BankAccountException(){}
	
	public BankAccountException(String msg)
	{
		super("Exception occurred during transaction");
		exceptionMessage="BankAccountException :"+msg;
	}
	
	@Override
	public String toString()
	{
		return exceptionMessage;
	}
}

class QuestionTwo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter account number and initial account balance in the order: account number ---> balance");
		int acctNo = sc.nextInt();
		double balance = sc.nextDouble();
		BankAccount b = new BankAccount(acctNo,balance);
		while(true)
		{
			System.out.println("Press 1 to withdraw\nPress 2 to deposit\nPress 3 to display account information\nPress 0 to exit");
			n=sc.nextInt();
			if(!(n==0 || n==1 || n==2 || n==3))
			{
				System.out.println("Incorrect choice of option");
				System.out.println();
				continue;
			}
			else if(n==2)
			{
				System.out.print("Enter amount to deposit :");
				b.deposit(sc.nextDouble());
				System.out.println();
			}
			else if(n==1)
			{
				System.out.print("Enter amount to withdraw :");
				try
				{
				b.withdraw(sc.nextDouble());
				System.out.println();
				}
				catch(BankAccountException e)
				{
					System.out.println(e);
					System.out.println();
					continue;
				}
				
			}
			else if(n==3)
			{
				b.show();
			}
			else
			{
				System.out.print("Thank you for using the banking service!");
				break;
			}
		}
	}
}
			