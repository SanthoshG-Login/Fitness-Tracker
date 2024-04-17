package com.example.WebApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.WebApp.Entity.FtEntity;

@Repository
public interface FtRepository extends  JpaRepository<FtEntity,Integer>{

	

	
}
