package com.Api.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Api.Repository.DeclarationRepository;
import com.Api.entity.Declaration;

@Service

public class DeclarationService {
	
@Autowired 
private DeclarationRepository  declarationRepository  ;  

@PersistenceContext
private EntityManager entityManager  ; 

public  List<Declaration> getAllDeclarations(){
	List<Declaration>  liste = new  ArrayList<>()  ;  
	declarationRepository.findAll()
	.forEach(liste :: add);
	
	return liste; 
}


public Declaration  getOneDeclaration (int num_decl , int  num_bur  ,  int anne_decl)  {
	Declaration  declaration =  new Declaration()  ;  
	
	String  hql  = "FROM Declaration WHERE num_decl = ? and code_bur =? " ; 
	declaration  = (Declaration) entityManager.createQuery(hql).setParameter(0, num_decl).setParameter(1, num_bur).getSingleResult() ; 
	//int  cout  =  entityManager.createQuery(hql).setParameter(1, title).setParameter(2, category).getResultList()
		
    return declaration   ;  
}





}
