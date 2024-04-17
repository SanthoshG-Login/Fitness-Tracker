package com.example.WebApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.WebApp.Service.FtService2;

@Controller
public class FtController2 {
	
	@Autowired
	private FtService2 service2; 
	
	@RequestMapping("/DeleteTasks/{S_No}")
	public String deleteTasks(@PathVariable("S_No") int S_No) {
		service2.deleteTaskById(S_No);
		
		return "redirect:/Today_Task";
		
	}

}
