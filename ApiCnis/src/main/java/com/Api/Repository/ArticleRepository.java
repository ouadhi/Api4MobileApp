package com.Api.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Api.entity.Article;


public interface ArticleRepository extends CrudRepository< Article, Integer> {

}
