package com.studentmanagement.dao;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.studentmanagement.bean.StudentTable;

public class DataInsering {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the roll no");
		int rollno=s.nextInt();
		
		System.out.println("Enter the Name");
		String name=s.next();
		
		System.out.println("Enter the standard");
		String standard=s.next();
		
		System.out.println("Enter the Mobile number");
		long phoneno=s.nextLong();
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sum");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		String findall="from  StudentTable";
		Query query= manager.createQuery(findall);
		List<StudentTable> list= query.getResultList();
		for (StudentTable studentTable : list) {
			System.out.println(studentTable);
		}
		transaction.commit();
		
		
		
//		StudentTable studentTable=new StudentTable();
//		studentTable.setName("Sameer");
//		studentTable.setPhno(9945663179l);
//		studentTable.setRollno(10);
//		studentTable.setStandard("10");
//		
//		
//		EntityManagerFactory factory=Persistence.createEntityManagerFactory("sum");
//		EntityManager manager=factory.createEntityManager();
//		EntityTransaction transaction=manager.getTransaction();
//		transaction.begin();
//		manager.persist(studentTable);
//		transaction.commit();
//		System.out.println("Data inserted successfully");
	}
}
