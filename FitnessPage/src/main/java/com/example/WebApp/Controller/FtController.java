package com.example.WebApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.WebApp.Entity.FtEntity;
import com.example.WebApp.Entity.FtEntityy;
import com.example.WebApp.Service.FtService;
import com.example.WebApp.Service.FtService2;

@Controller
public class FtController<ftrack> {
	@Autowired
	private FtService service;
	
	@Autowired
	private FtService2 service2;
	
	@GetMapping("/")
	public String Home()
	{
		return "Home.html";
	}

	@GetMapping("/Goals")
	public ModelAndView goals()
	{
		List<FtEntity>list=service.goals();
		/*ModelAndView m=new ModelAndView();
		m.setViewName("Set_Goals");
		m.addObject("FtEntity",list); */
		return new ModelAndView("Goals.html","ftrack",list);
	}  
	
	 @GetMapping("/Set_Goals")
		public String goal()
		{
			return "Set_Goals.html";
		} 
	@PostMapping("/save")
		public String setgoals(@ModelAttribute FtEntity f)
		{
			service.setgoals(f);
			return "redirect:/Goals";
		}
	
	@GetMapping("/Today_Task")
	public String task(Model model)
	{
		List<FtEntityy> list=service2.getTodayTask();
		model.addAttribute("ftrack",list);
		return "Today_Task.html";
	}
	@RequestMapping("/todayTasks/{S_No}")
	public String todayTasks(@PathVariable("S_No") int S_No)
	{
		FtEntity f=service.getTodayTaskById(S_No);
		FtEntityy ft=new FtEntityy(f.getS_No(),f.getTask_Name(),f.getTask(),f.getCounts());
		 service2.todaytask(ft);
		return "redirect:/Today_Task";
	}
}
