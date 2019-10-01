package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author AK
 * @version 2.0
 * @creation_date 27.9.19
 * @creation_time 12.2pm
 * @time 14.16pm
 */
@Entity
@Table(name = "emp_master_1")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String name;
	private LocalDate joindate;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, LocalDate joindate, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.joindate = joindate;
		this.salary = salary;
	}

	/**
	 * @return the eid
	 */
	public int getEid() {
		return eid;
	}

	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the joindate
	 */
	public LocalDate getJoindate() {
		return joindate;
	}

	/**
	 * @param joindate the joindate to set
	 */
	public void setJoindate(LocalDate joindate) {
		this.joindate = joindate;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", joindate=" + joindate + ", salary=" + salary + "]";
	}

}
