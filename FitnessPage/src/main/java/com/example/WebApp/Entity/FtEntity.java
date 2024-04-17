package com.example.WebApp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Fittrack")

public class FtEntity {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int S_No;
	 
	 @Column(name="Task_Name")
	 private String Task_Name; 
	 
	public FtEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FtEntity(int s_No, String task_Name, String task, String counts) {
		super();
		S_No = s_No;
		Task_Name = task_Name;
		Task = task;
		Counts = counts;
	}

	public int getS_No() {
		return S_No;
	}

	public void setS_No(int s_No) {
		S_No = s_No;
	}

	public String getTask_Name() {
		return Task_Name;
	}

	public void setTask_Name(String task_Name) {
		Task_Name = task_Name;
	}

	public String getTask() {
		return Task;
	}

	public void setTask(String task) {
		Task = task;
	}

	public String getCounts() {
		return Counts;
	}

	public void setCounts(String counts) {
		Counts = counts;
	}

   	@Column(name="Task")
	 private String Task; 
	 
	 @Column(name="Counts")
	 private String Counts;
		 
}
