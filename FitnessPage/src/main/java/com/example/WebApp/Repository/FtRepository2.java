package com.example.WebApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.WebApp.Entity.FtEntityy;

 @Repository
public interface FtRepository2 extends  JpaRepository<FtEntityy,Integer> {

}
