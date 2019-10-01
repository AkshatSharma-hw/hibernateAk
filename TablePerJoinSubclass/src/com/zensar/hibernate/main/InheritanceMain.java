package com.zensar.hibernate.main;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t= s.beginTransaction();
		
		Employee e = new Employee();
		e.setJoindate(LocalDate.of(1993, 8, 18));
		e.setName("none");
		e.setSalary(19000.00);
		
		s.save(e);
	
		WageEmp we = new WageEmp();
		we.setJoindate(LocalDate.of(1980, 9, 5));
		we.setHours(10);
		we.setRate(50);
		we.setName("kon hai ye");
		we.setSalary((we.getRate()*we.getHours()));
		s.save(we);
		t.commit();
		s.close();
	}

}
