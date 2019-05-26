package com.controller;

import com.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author jhao
 * @Date 2019/4/21 15:53
 * @Description
 * @Modified by:
 */
@Controller
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    ArticleService articleService;

}
