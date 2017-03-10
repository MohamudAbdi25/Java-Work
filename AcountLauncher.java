package chapter4;

public class AcountLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Acount userInput = new Acount();
 Acount userInput2 = new Acount();
 Acount userInput3 = new Acount();
 Acount userInput4 = new Acount();
 
 userInput.setFirstName("Jack");
 userInput.setLastName("Reacher");
 userInput.setStreetAddress("511 Somewhere Blvd");
 userInput.setCity("Arkansa");
 userInput.setState("Ar");
 userInput.setZip(23443);
 userInput.setPhoneNumber("541-985-6541");
 userInput.setPerferredCustomer(true);
 userInput.setAccountNumber("9035648625");
 userInput.setBalance(2343.45);
 userInput.setAccountType("checking");
 userInput.setAccountNotes("none");
 
 userInput2.setFirstName("Lincoln");
 userInput2.setLastName("Rhyme");
 userInput2.setStreetAddress("423 Falcon Ave");
 userInput2.setCity("St. Louis");
 userInput2.setState("MO");
 userInput2.setZip(63113);
 userInput2.setPhoneNumber("314-256-5687");
 userInput2.setPerferredCustomer(true);
 userInput2.setAccountNumber("8110181769");
 userInput2.setBalance(7542.35);
 userInput2.setAccountType("saveing");
 userInput2.setAccountNotes("none");
 
 userInput3.setFirstName("Robert");
 userInput3.setLastName("Langdon");
 userInput3.setStreetAddress("512 Oman Lane");
 userInput3.setCity("Symbolic");
 userInput3.setState("NY");
 userInput3.setZip(77777);
 userInput3.setPhoneNumber("524-653-1245");
 userInput3.setPerferredCustomer(false);
 userInput3.setAccountNumber("7796717347");
 userInput3.setBalance(23.14);
 userInput3.setAccountType("Investment");
 userInput3.setAccountNotes("none");
 
 userInput4.setFirstName("Odd");
 userInput4.setLastName("Thomas");
 userInput4.setStreetAddress("3312 Bodachs Street");
 userInput4.setCity("Pico Mound");
 userInput4.setState("CA");
 userInput4.setZip(59254);
 userInput4.setPhoneNumber("826-333-7757");
 userInput4.setPerferredCustomer(false);
 userInput4.setAccountNumber("6173432353");
 userInput4.setBalance(-123.14);
 userInput4.setAccountType("Standard");
 userInput4.setAccountNotes("Negative balance letter has been sent");
 
 System.out.println("*****  Customer Info  *****");
 System.out.println("First Name: "+userInput.getFirstName());
 System.out.println("Last Name: "+userInput.getLastName());
 System.out.println("Address: "+userInput.getStreetAddress());
 System.out.println("City: "+userInput.getCity());
 System.out.println("State:  "+userInput.getState());
 System.out.println("Zip: "+userInput.getZip());
 System.out.println("Phone Number: "+userInput.getPhoneNumber());
 System.out.println("Perferred Customer: "+userInput.isPerferredCustomer());
 System.out.println("Account Number "+ userInput.getAccountNumber());
 System.out.printf("Balance: $%,.2f\n",userInput.getBalance());
 System.out.println("Account Type: "+userInput.getAccountType());
 System.out.println("Account Notes: "+userInput.getAccountNotes()+"\n");
 
 System.out.println("*****  Customer Info  *****");
 System.out.println("First Name: "+userInput2.getFirstName());
 System.out.println("Last Name: "+userInput2.getLastName());
 System.out.println("Address: "+userInput2.getStreetAddress());
 System.out.println("City: "+userInput2.getCity());
 System.out.println("State:  "+userInput2.getState());
 System.out.println("Zip: "+userInput2.getZip());
 System.out.println("Phone Number: "+userInput2.getPhoneNumber());
 System.out.println("Perferred Customer: "+userInput2.isPerferredCustomer());
 System.out.println("Account Number "+ userInput2.getAccountNumber());
 System.out.printf("Balance: $%,.2f\n",userInput2.getBalance());
 System.out.println("Account Type: "+userInput2.getAccountType());
 System.out.println("Account Notes: "+userInput2.getAccountNotes()+"\n");
 
 System.out.println("*****  Customer Info  *****");
 System.out.println("First Name: "+userInput3.getFirstName());
 System.out.println("Last Name: "+userInput3.getLastName());
 System.out.println("Address: "+userInput3.getStreetAddress());
 System.out.println("City: "+userInput3.getCity());
 System.out.println("State:  "+userInput3.getState());
 System.out.println("Zip: "+userInput3.getZip());
 System.out.println("Phone Number: "+userInput3.getPhoneNumber());
 System.out.println("Perferred Customer: "+userInput3.isPerferredCustomer());
 System.out.println("Account Number "+ userInput3.getAccountNumber());
 System.out.printf("Balance: $%,.2f\n",userInput3.getBalance());
 System.out.println("Account Type: "+userInput3.getAccountType());
 System.out.println("Account Notes: "+userInput3.getAccountNotes()+"\n");
 
 System.out.println("*****  Customer Info  *****");
 System.out.println("First Name: "+userInput4.getFirstName());
 System.out.println("Last Name: "+userInput4.getLastName());
 System.out.println("Address: "+userInput4.getStreetAddress());
 System.out.println("City: "+userInput4.getCity());
 System.out.println("State:  "+userInput4.getState());
 System.out.println("Zip: "+userInput4.getZip());
 System.out.println("Phone Number: "+userInput4.getPhoneNumber());
 System.out.println("Perferred Customer: "+userInput4.isPerferredCustomer());
 System.out.println("Account Number "+ userInput4.getAccountNumber());
 System.out.printf("Balance: $%,.2f\n",userInput4.getBalance());
 System.out.println("Account Type: "+userInput4.getAccountType());
 System.out.println("Account Notes: "+userInput4.getAccountNotes()+"\n");
 
 
	}

}
