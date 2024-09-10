package oops;

interface bank {
	void deposit();
	void withdraw();

}
interface bank2
{
	void interestrate();
	void balancedetails();
}
class ICICI implements bank,bank2
{
	public void interestrate() {
		System.out.println("interest rate ");
		
	}
	public void balancedetails() {
		System.out.println("balance details ");
		
	}
	public void deposit() {
		System.out.println("deposit");
	}
	public void Withdraw() {
		System.out.println("Withdraw");
	
	}
	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
}
public class bank1 {
	public static void main(String[] args) {
		ICICI OB=new ICICI();
		OB.balancedetails();
		OB.balancedetails();
		OB.deposit();
		OB.withdraw();
		OB.Withdraw();
	}
}