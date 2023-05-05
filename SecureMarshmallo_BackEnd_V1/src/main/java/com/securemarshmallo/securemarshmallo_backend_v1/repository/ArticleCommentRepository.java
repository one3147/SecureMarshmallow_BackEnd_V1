package com.securemarshmallo.securemarshmallo_backend_v1.repository;

import com.securemarshmallo.securemarshmallo_backend_v1.domain.article.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}