package com.controller;

import com.pojo.Article;
import com.service.ArticleService;
import org.apache.mahout.cf.taste.common.TasteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

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


    /**
     * @Description  跳转到获取所有文章信息的页面
     * @author      jhao
     * @param
     * @return      
     * @exception   
     * @date        2019/5/26 23:53
     */
    @RequestMapping("listAllArticles")
    public String listAllArticles(Model model, HttpSession httpSession) throws TasteException {

        int userId = (int) httpSession.getAttribute("studentId");
        if(userId==0){
            return "未登录";
        }
        List<Article> similarityArticleList = articleService.listSimilarityArticle(userId,3);
        List<Article> articleList =  articleService.listAllArticles();
        model.addAttribute("detailList",articleList);
        model.addAttribute("similarityArticleList",similarityArticleList);
        return null;
    }

}
