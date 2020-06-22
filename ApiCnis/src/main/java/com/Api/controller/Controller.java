package com.Api.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Api.entity.Article;
import com.Api.entity.Declaration;
import com.Api.entity.Douanier;
import com.Api.service.ArticleService;
import com.Api.service.DeclarationService;
import com.Api.service.DouanierService;

@RestController

public class Controller {
	
	@Autowired
	private DouanierService dService ; 
	@Autowired
	private DeclarationService declarationService  ; 
	@Autowired
	private ArticleService articleService  ; 
	
	@RequestMapping("/hello")
	public String sayhello() {
		return "Bonjour yassines"; 
	}	
	
	
	
	
	@RequestMapping("/getAll")
	public List<Douanier> getAllDouanier() {
		return dService.getAllDouanier() ;
		}	
	
	@RequestMapping("/getAllDeclaration")
	public List<Declaration> getDeclarations() {
		return declarationService.getAllDeclarations() ; 
		}
	@RequestMapping("/getAlarticles")
	public List<Article> getAllArticles() {
		return articleService.getAllArticles() ;  
		}
	
	
	@RequestMapping("/getOneDeclaration/{num_decl}/{num_bur}/{ann_decl}")
	public Declaration getOneDeclaration(@PathVariable("num_decl") Integer num_decl , @PathVariable("num_bur") Integer num_bur , @PathVariable("ann_decl") Integer ann_decl) {
		return declarationService.getOneDeclaration(num_decl , num_bur , ann_decl) ; 
		}
}
