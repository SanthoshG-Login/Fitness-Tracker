package com.example.WebApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.WebApp.Entity.FtEntity;
import com.example.WebApp.Repository.FtRepository;

@Service
public class FtService {
	
	@Autowired
	private FtRepository frepo;
	
	public void setgoals(@ModelAttribute FtEntity f)
	{
		//(service).save(f);
		 frepo.save(f);
		//return "redirect:/Goals";
	}
	public List<FtEntity> goals(){
		
		return frepo.findAll();
	}
	public FtEntity getTodayTaskById(int S_No)
	{
		return frepo.findById(S_No).get();
	}

}
