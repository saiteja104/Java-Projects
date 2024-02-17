package bankaccountapp;

public class Checking extends Account{
	//list properties specific to the checking account
	private int debitCardNumber;
	private int debitCardPin;
	//constructor to initialize checking account properties
	public Checking(String name,String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber="2"+accountNumber;
		
		//System.out.println("Name: "+ name);
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate=getBaseRate()*.15;
	}
	//list any methods specific to checking account
	public void showInfo() {
		super.showInfo();
		//System.out.println("ACCOUNT TYPE: checking");
		System.out.println(" Your Ckecking Account Features"
				+"\n Debit Card Number : "+ debitCardNumber
				+"\n Debit Card Pin : "+ debitCardPin
				//+"\nRate: "+ rate +"%";
				);
	}
	public void setDebitCard() {
		debitCardNumber=(int)(Math.random()*Math.pow(10,12));
		debitCardPin=(int)(Math.random()*Math.pow(10,4));
	}

}
