package com.securemarshmallo.securemarshmallo_backend_v1.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@ToString
@Table(indexes = {
        @Index(columnList = "content"),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy")
})
@EntityListeners(EntityListeners.class)
@Entity
public class ArticleComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Setter @ManyToOne(optional = false) private  Article article;
    @Setter @Column(nullable = false, length = 500) private String content;


    @CreatedDate
    @Column(nullable = false) private LocalDateTime createdAt;
    @CreatedBy
    @Column(nullable = false, length = 100) private String createdBy;
    @LastModifiedDate
    @Column(nullable = false) private LocalDateTime modifiedAt;
    @LastModifiedBy
    @Column(nullable = false, length = 100) private String modifiedBy;

    protected ArticleComment() { }

    private ArticleComment(Article article, String content) {
        this.article = article;
        this.content = content;
    }

    public static ArticleComment of(Article article, String content) {
        return new ArticleComment(article, content);
    }

    //동일설 검사 동등성 검사
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleComment that = (ArticleComment) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
