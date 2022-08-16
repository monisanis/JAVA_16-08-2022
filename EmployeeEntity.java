package com.AssessmentJpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class EmployeeEntity {

  @Id

  //@GeneratedValue(strategy=GenerationType.AUTO)

  private int employeeno;
  private String employeename;
  private String employeedesignation;
  private double employeesalary;
public int getEmployeeno() {
	return employeeno;
}
public void setEmployeeno(int employeeno) {
	this.employeeno = employeeno;
}
public String getemployeename() {
	return employeename;
}
public void setemployeename(String employeename) {
	this.employeename = employeename;
}
public String getemployeedesignation() {
	return employeedesignation;
}
public void setemployeedesignation(String employeedesignation) {
	this.employeedesignation = employeedesignation;
}
public double getemployeesalary() {
	return employeesalary;
}
public void setemployeesalary(double employeesalary) {
	this.employeesalary = employeesalary;
}
@Override
public String toString() {
	return "Employee [employeeno=" + employeeno + ", employeename=" + employeename + ", employeeedesignation=" + employeedesignation + ", employeesalary=" + employeesalary+ "]";
}

}