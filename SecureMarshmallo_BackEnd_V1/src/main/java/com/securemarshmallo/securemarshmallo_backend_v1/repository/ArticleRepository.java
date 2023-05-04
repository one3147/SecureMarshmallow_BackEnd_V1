package com.securemarshmallo.securemarshmallo_backend_v1.repository;

import com.securemarshmallo.securemarshmallo_backend_v1.domain.article.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ArticleRepository extends JpaRepository<Article, Long> {

}