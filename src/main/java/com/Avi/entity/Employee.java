package com.Avi.entity;
import jakarta.persistence.CascadeType;
//import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Transient;
import jakarta.persistence.OneToMany;
import java.util.List;

//@Entity(name="empp")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	//@Column(name = "e_Name")
	private String name;
	private String gender;
	private int salary;
//	@Transient
//	private String country;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> addresses;
	
	public Employee() {
		super();
	}


	public Employee(int id, String name, String gender, int salary, String country) {
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		//this.country = country;
	}

	
	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}


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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

}

