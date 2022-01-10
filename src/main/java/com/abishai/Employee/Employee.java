package com.abishai.Employee;

public class Employee {

	
		
			private String name;

			private String dateofbirth ;

			private String dateofjoining;

			private Float salary;
			private Integer enterpriseid;
			private Integer employeeid;
			
			
			public Employee() {}
			
			
			public Employee(String name, String dateofbirth, String dateofjoining, Float salary, Integer enterpriseid,
					Integer employeeid) {
				super();
				this.name = name;
				this.dateofbirth = dateofbirth;
				this.dateofjoining = dateofjoining;
				this.salary = salary;
				this.enterpriseid = enterpriseid;
				this.employeeid = employeeid;
			}
			
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getDateofbirth() {
				return dateofbirth;
			}
			public void setDateofbirth(String dateofbirth) {
				this.dateofbirth = dateofbirth;
			}
			public String getDateofjoining() {
				return dateofjoining;
			}
			public void setDateofjoining(String dateofjoining) {
				this.dateofjoining = dateofjoining;
			}
			public Float getSalary() {
				return salary;
			}
			public void setSalary(Float salary) {
				this.salary = salary;
			}
			public Integer getEnterpriseid() {
				return enterpriseid;
			}
			public void setEnterpriseid(Integer enterpriseid) {
				this.enterpriseid = enterpriseid;
			}
			public Integer getEmployeeid() {
				return employeeid;
			}
			public void setEmployeeid(Integer employeeid) {
				this.employeeid = employeeid;
			}
			@Override
			public String toString()
			    {
			  
			        return "Employee [Name="
			            + name + ", DateOfBirth="
			            + dateofbirth + ", DateOfJoining="
			            + dateofjoining + ", Salary="
			            + salary + ", EnterpriseId=" + enterpriseid 
			            +", EmployeeId=" + employeeid + "]";
			  
			           
			    }
			
			
			
			
		 
	}


