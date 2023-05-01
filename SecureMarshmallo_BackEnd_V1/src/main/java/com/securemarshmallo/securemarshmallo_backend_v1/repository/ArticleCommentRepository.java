package com.securemarshmallo.securemarshmallo_backend_v1.repository;

import com.securemarshmallo.securemarshmallo_backend_v1.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}