package multipleInheritance;

import java.time.LocalDate;

public class Employee 
{
	
	private int id;
	private String name;
	private String role;
	private LocalDate doj;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", doj=" + doj + "]";
	}


	public Employee()
	{}
	
	
	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getRole() {
		return role;
	}





	public void setRole(String role) {
		this.role = role;
	}





	public LocalDate getDoj() {
		return doj;
	}





	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}





	public Employee(int id, String name, String role, LocalDate doj) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.doj = doj;
	}





	public Employee getEmpData()
	{
		System.out.println("Input Employee Details");
		return null;
	}



	
	

}
