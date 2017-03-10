
public class EmployeeDemo {

	public static void main(String[] args) {
		//System.out.println("******");
		// Instantiate a ProductionWorker object 
		productionWorker worker = new productionWorker();
		
		//Add a name 
		worker.setEmployeeName("Lekia ");
		
		//Add an employee number
		worker.setEmployeeNumber("345-L");
		
		//Add a hire date
		worker.setHireDate("02/22/2017");
		
		//Add a shift
		worker.setShift(2);
		
		//Add a hourly pay rate
		worker.setHourlyRate(34.0);
		
		System.out.println(worker.toString());
		System.out.println("\n");
		//Instantiate a shiftSupervisor object
		ShiftSupervisor supervisor = new ShiftSupervisor();

		//Add a name
		supervisor.setEmployeeName("Jack");
		
		//Add an employee number
		supervisor.setEmployeeNumber("367-J");
		
		//Add a hire date
		supervisor.setHireDate("01/23/2016");
		
		//Add an annul salary
		supervisor.setAnnulSalary(100000.0);
		
		//Add an annul bonus
		supervisor.setAnnualBonus(15000);
		
		System.out.print(supervisor);
		
		//Instantiate a TeamLeader object
		teamLeader leader = new teamLeader();
		
		//Create a space 
		System.out.println("\n");
		
		//Add a name
		leader.setEmployeeName("Jane");
		
		//Add an employee id number
		leader.setEmployeeNumber("456-J");
		
		//Add a hire date 
		leader.setHireDate("05/05/2015");
		
		//Add a monthly bonus
		leader.setMonthlyBonus(125.35);
		
		//Add training time required
		leader.setReqTrainingHours(45.0);
		
		//Add training time attended 
		leader.setHourlyRate(35.35);
		
		//Add shift 
		leader.setShift(1);
		
		//Display leader information
		System.out.println(leader);
		

	}

}
