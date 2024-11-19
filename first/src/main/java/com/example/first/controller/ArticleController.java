package com.example.first.controller;

import com.example.first.dto.ArticleForm;
import com.example.first.entity.Article;
import com.example.first.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticleController {
    @Autowired  // 스트링부트가 미리 생성해놓은 객체를 가져다가 자동으로 연결
    private ArticleRepository articleRepository;

    @GetMapping("/article/new")
    public String newArticleForm() {
        return "article/new";
    }

    @PostMapping("/article/create")
    public String createArticle(ArticleForm form) {
        log.info(form.toString());
        System.out.println(form.toString());

        // 1. Dto 객체를 변환 -> Entity
        Article article = form.toEntity();
        log.info(article.toString());
        System.out.println(article.toString());


        // 2. Repository에게 Entity를 DB안에 저장하도록 명령
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        log.info(saved.toString());

        return "";
    }
}
