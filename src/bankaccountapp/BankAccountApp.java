package bankaccountapp;
import java.util.List;
import java.util.LinkedList;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		// TODO Auto-generated method stub
		String file="C:/Users/Sai/OneDrive/Desktop/NewBankAccounts.csv";
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		/*
		Checking chkacc1 = new Checking("saiteja","122345568",1500);
		Savings savacc1 = new Savings("G Saiteja","124578956",2500);
	
		savacc1.compound();
		savacc1.showInfo();
		System.out.println("**********");
		chkacc1.showInfo();
		*/
		//savacc1.deposit(5000);
		//savacc1.withdraw(200);
		//savacc1.transfer("brokerage",3000);
		// Read a CSV File then create new accounts based on that data List<String[]> newAccountHolders = utilities.CSV.read(file);

		// Read a CSV File then create new accounts based on that data List<String[]> newAccountHolders utilities.CSV.read(file);

		for (String[] accountHolder: newAccountHolders) {
			String name=accountHolder[0];
			String sSN=accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);

		// System.out.println(name + SSN + accountType + "$" + initDeposit);
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name,sSN,initDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name,sSN,initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
			
	}
		for (Account acc: accounts) {
			System.out.println("********************");
			acc.showInfo();
		}
	}
}
