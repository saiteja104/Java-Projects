package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordlength=10;
	private String alternativeEmail;
	private String companySuffix="deloitte.com";
	
	//CONSTRUCTOR TO GET THE FIRSTNAME AND LASTNAME
	public Email(String firstName, String lastName)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		
		//System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		
		//call a method asking for the department- return a department
		this.department=setDepartment();
		//System.out.println("Department: "+this.department);
		
		//call a method that returns a random password
		this.password=randomPassword(defaultPasswordlength);
		System.out.println("Your password is: "+this.password);
		
		//combine elements to generate email
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		//System.out.println("Your email is: "+email);
		
		
		
	}
	//ASK FOR THE DEPARTMENT
	private String setDepartment() {
		System.out.print("New Worker: "+ firstName + "\nDepartment code: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice==1) { return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==3) {return "accounting";}
		else {return "";}
	}
	
	//GENERATE THE RANDOM PASSWORD
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random()* passwordSet.length());
			password[i]= passwordSet.charAt(rand);
			
		}
		return new String(password);
	}
	//SET THE MAILBOX CAPACITY
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	//SET THE ALTERNATIVE MAIL
	public void setAlternateEmail(String altEmail) {
		this.alternativeEmail=altEmail;
	}
	//CHANGE THE PASSWORD
	public void changePassword(String passsword) {
		this.password=password;
	}
	public int getMailBoxCapacity() {return mailboxCapacity;}
	public String getAlternativeEmail() {return alternativeEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOXCAPACITY: " + mailboxCapacity + "mb";
	}
	
}
