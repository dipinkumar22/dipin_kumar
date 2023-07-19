package multipleInheritance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EmployeeImpl extends Employee implements EmployeeIntr{

	public EmployeeImpl(int id, String name, String role, LocalDate doj) {
		super(id, name, role, doj);
		
	}


	
	
	public EmployeeImpl()
	{
		
	}



	@Override
	public void showDetails() {
	
		System.out.println(this.toString());
	}

	@Override
	public void totalExperience()
	{
		LocalDate doj = this.getDoj();
		System.out.println(ChronoUnit.DAYS.between(doj, LocalDate.now()));
		
	}
	
	@Override
	public EmployeeImpl getEmpData()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the id");
		int id = scan.nextInt();
		System.out.println("Enter the name");
		String name = scan.next();
		System.out.println("Enter the role");
		String role = scan.next();
		System.out.println("Enter the doj");
		String joiningDate = scan.next();
		
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate doj = LocalDate.parse(joiningDate, formatter);
		
		return new EmployeeImpl(id,name,role,doj);
		
	}
	
	public static void main(String[] args)
	{
		
		EmployeeImpl impl=new EmployeeImpl();
		impl=impl.getEmpData();
		impl.showDetails();
		impl.totalExperience();
		
	
	}

	
	
	

}
