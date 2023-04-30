package com.securemarshmallo.securemarshmallo_backend_v1.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Article {
    private long id;
    private String title;
    private String content;
    private String hashtag;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
