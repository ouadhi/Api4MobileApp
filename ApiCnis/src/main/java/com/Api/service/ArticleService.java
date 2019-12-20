package com.Api.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.Repository.ArticleRepository;
import com.Api.entity.Article;



@Service
public class ArticleService {

	@Autowired 
	private ArticleRepository  articleRepository  ;  

	@PersistenceContext
	private EntityManager entityManager  ; 

	public  List<Article> getAllArticles(){
		List<Article>  liste = new  ArrayList<>()  ;  
		articleRepository.findAll()
		.forEach(liste :: add);
		
		return liste; 
	}


	

	

}
