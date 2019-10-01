package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author AK
 * @version 3.0
 * @creation_date 27.9.19
 * @time 11.48
 * 
 */
@Entity
@Table(name = "wage_emp_1")
public class WageEmp extends Employee {
	private int hours;
	private float rate;

	public WageEmp() {
		// TODO Auto-generated constructor stub
	}

	public WageEmp(int eid, String name, LocalDate joindate, double salary) {
		super(eid, name, joindate, salary);
		// TODO Auto-generated constructor stub
	}

	public WageEmp(int eid, String name, LocalDate joindate, double salary, int hours, float rate) {
		super(eid, name, joindate, salary);
		this.hours = hours;
		this.rate = rate;
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * @return the rate
	 */
	public float getRate() {
		return rate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}

}
