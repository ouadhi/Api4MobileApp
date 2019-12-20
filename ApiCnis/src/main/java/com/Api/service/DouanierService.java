package com.Api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.Repository.DouanierReposotry;
import com.Api.entity.Douanier;


@Service
public class DouanierService {

	@Autowired
	DouanierReposotry douanierRepo   ; 
	
	public  List<Douanier> getAllDouanier(){
		List<Douanier>  liste = new  ArrayList<>()  ;  
		douanierRepo.findAll()
		.forEach(liste :: add);
		
		return liste; 
	}
}
