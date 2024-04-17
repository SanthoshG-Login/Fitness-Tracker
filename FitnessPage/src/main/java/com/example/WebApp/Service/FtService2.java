package com.example.WebApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.WebApp.Entity.FtEntityy;
import com.example.WebApp.Repository.FtRepository2;

@Service
public class FtService2 {
	@Autowired
	private FtRepository2 ftrepo;
	
	public void todaytask(@ModelAttribute FtEntityy ftrack)
	{
		 ftrepo.save(ftrack);
	}
	public List<FtEntityy> getTodayTask(){
		
		return ftrepo.findAll();
	}
	public void deleteTaskById(int S_No) {
		// TODO Auto-generated method stub
		ftrepo.deleteById(S_No);
	}
}
