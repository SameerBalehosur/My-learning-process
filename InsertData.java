package com.studentmanagement.dao;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.studentmanagement.bean.StudentTable;

public class InsertData {

	public static void main(String[] args) {
		StudentTable table=new StudentTable();
		table.setRollno(1);
		table.setName("Sameer");
		table.setPhno(9945663179l);
		table.setStandard("2");

		try {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("sum");
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(table);
			transaction.commit();	
			System.out.println("Data inserted successfully in the Student Management system database table");
		} catch (Exception e) {
			e.printStackTrace();
		}

		//		Scanner scanner = new Scanner(System.in);
		//		System.out.println("Press 1 to see all the data");
		//		int alldata=scanner.nextInt();
		//
		//		System.out.println("Press 2 to see any particular data");
		//		int particula=scanner.nextInt();
		//
		//		System.out.println("Press 3 to update any particular data");
		//		int update=scanner.nextInt();
		//
		//		System.out.println("Press 4 to delete data");
		//		int delete=scanner.nextInt();
		//
		//		System.out.println("See all data");

		//Inserting data Dynamically
		
	}
}
