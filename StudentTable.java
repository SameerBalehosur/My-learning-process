package com.studentmanagement.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
//@Table(name="Student-Details")
public class StudentTable implements Serializable{
	@Column(name="Roll Number")
	@Id
	private int Rollno;
	@Column(name="Student Name")
	private String name ;
	@Column(name="Phone Number")
	private long phno; 
	@Column(name="Standard")
	private String  standard;
}
