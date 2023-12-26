package Encapsulation;

class Details{
	private double bankbal;
	void deposit(double amt) {
		if(amt>0) {
			bankbal=bankbal+amt;
			System.out.println("deposited Successfully : "+amt);
		}else {
			System.out.println("Invalid Ammount Input");
		}
		
	}
	void withdraw(double amt) {
		if(amt<=bankbal) {
			bankbal=bankbal-amt;
			System.out.println("Ammount withdraw : "+amt);
		}
		else {
			System.out.println("Tera Baap Chodh ke gaya tha ya Teri Maa");
		}
	}
	public void getbal() {
		//return bankbal;
		System.out.println("Your Current Balance Is : "+bankbal);
	}
	public void setbal(double bankbal) {
		this.bankbal=bankbal;
	}
	
}
public class BankAccount {

	public static void main(String[] args) {
	
		Details d1=new Details();
		d1.deposit(10000);
		d1.getbal();
		d1.withdraw(7000);
		d1.getbal();
		d1.withdraw(5000);
		d1.withdraw(3000);
		d1.getbal();
		d1.deposit(25000);
		d1.getbal();
		
	}

}

