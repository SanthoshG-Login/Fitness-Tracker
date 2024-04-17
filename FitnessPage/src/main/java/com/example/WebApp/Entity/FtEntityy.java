package com.example.WebApp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Task")
public class FtEntityy {
	
	 @Id
	 private int S_No;
	 
	 	 private String Task_Name; 
		 private String Task; 
		 public FtEntityy(int s_No, String task_Name, String task, String counts) {
			super();
			S_No = s_No;
			Task_Name = task_Name;
			Task = task;
			Counts = counts;
		}
		private String Counts;
		public FtEntityy() {
			super();
			// TODO Auto-generated constructor stub
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

		
}
