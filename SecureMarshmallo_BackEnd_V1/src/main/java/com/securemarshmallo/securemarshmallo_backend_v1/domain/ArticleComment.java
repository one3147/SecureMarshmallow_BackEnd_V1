package com.securemarshmallo.securemarshmallo_backend_v1.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id;
    private  Article article;
    private String content;


    private LocalDateTime createdAt;
    private String createBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
