package bankaccountapp;

public class Savings extends Account{
		//list properties specific to the Savings account
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
		//constructor to initialize Savings account properties
	public Savings (String name,String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
	}
	public void setSafetyDepositBox() {
		safetyDepositBoxId=(int)(Math.random()*Math.pow(10,3));
		safetyDepositBoxKey=(int)(Math.random()*Math.pow(10,4));
	}
	//list any methods specific to Savings account
	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Savings Account Features"
				+"\n Safety Deposit Box Id : "+ safetyDepositBoxId
				+"\n Safety Deposit Box Key : "+ safetyDepositBoxKey
				);
	}
	@Override
	public void setRate() {
		rate=getBaseRate()-.25;
		
	}

}
