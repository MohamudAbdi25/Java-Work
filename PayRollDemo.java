import java.util.Scanner;

public class PayRollDemo {

	public static void main(String[] args)throws Exception {
		{
			try{
				//variable declaration
				String name,s1;
				int hrs,rate,id;
				//instance creation
				PayRoll employee=new PayRoll();
				//scanner object
				Scanner keyboard = new Scanner(System.in);
				//inputting name
				System.out.println("Enter name");
				name = keyboard.nextLine();
				
				//input number
				System.out.println("Enter Id:");
				s1=keyboard.nextLine();
				id=Integer.parseInt(s1);
				
				System.out.println("Enter hourly rate:");
				s1=keyboard.nextLine();
				rate=Integer.parseInt(s1);
				
				System.out.println("Enter hours:");
				s1=keyboard.nextLine();
				hrs=Integer.parseInt(s1);
				
				System.out.println("Enter name");
				name = keyboard.nextLine();
				//function calls to set values
				employee.setName(name);
				employee.setID(id);
				employee.setHourly_rate(rate);
				employee.setHours(hrs);
				//output data
				System.out.println("Name : " +employee.getName());
				System.out.println("ID : " +employee.getID());
				System.out.println("Hourly rate : " +employee.getHourly_rate());
				System.out.println("Hours : " +employee.getHours());
				System.out.println("gross : " +employee.grossPay());
				
			}
			catch(InvalidString1 e){
				System.out.println(e.getMessage());
			}
			catch(InvalidID e){
				System.out.println(e.getMessage());
			}
			catch(InvalidHourlyRate e){
				System.out.println(e.getMessage());
			}
			catch(InvalidHours e){
				System.out.println(e.getMessage());
			}
			System.exit(0);
		}

	}

}

 

