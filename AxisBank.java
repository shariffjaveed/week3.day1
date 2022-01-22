package week3.day1;

public class AxisBank extends BankInfo {
	public void deposit()
	{
			System.out.println("The updated minimum balance for the axis bank savings account is 500");
	}
	public static void main(String[] args) 
	{
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		
		// The overriding method from child class to replace deposit() value from BankInfo
		axis.deposit();
		
		// The overridden method from the parent class
		BankInfo oldBank = new BankInfo();
		oldBank.deposit();
	}
}
