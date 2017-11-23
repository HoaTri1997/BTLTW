package business;

import java.io.Serializable;

public class HourlyEmployee implements Serializable {
	
	private int employeeID;
	private String firstName;
	private String lastName;
	private double hourlyRate;
	
	public HourlyEmployee() {}
	
	public HourlyEmployee(int employeeID, String firstName, String lastName, double hourlyRate) {
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hourlyRate = hourlyRate;
	}
	
	public int getEmployeeID()
	{
		return employeeID;
	}
	
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getHourlyRate()
	{
		return hourlyRate;
	}
	
	public void setEmployeeID(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
}
