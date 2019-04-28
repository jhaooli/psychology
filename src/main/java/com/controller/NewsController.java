package com.controller;

import com.pojo.News;
import com.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/21 15:48
 * @Description
 * @Modified by:
 */
@Controller
@RequestMapping("news")
public class NewsController {

    @Autowired
    NewsService newsService;

    /**
     * @Description 新增新闻
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/27 10:55
     */
    @RequestMapping(value = "insertNews",method = RequestMethod.POST)
    public String insertNews(News news){
        newsService.insertNews(news);
        return null;
    }

    /**
     * @Description 删除新闻
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/27 10:56
     */
    @RequestMapping(value = "deleteNews",method = RequestMethod.POST)
    public String deleteNews(News news){
        newsService.deleteNews(news);
        return null;
    }

    /**
     * @Description 修改新闻内容
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/27 10:57
     */
    @RequestMapping(value = "updateNews",method = RequestMethod.POST)
    public String updateNews(News news){
        newsService.updateNews(news);
        return null;
    }

    /**
     * @Description 获取所有新闻
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/27 10:57
     */

    @RequestMapping("listAllNews")
    public String listAllNews(){
        newsService.listAllNews();
        return null;
    }

    /**
     * @Description
     * @author      jhao
     * @param
     * @return      java.lang.String
     * @exception
     * @date        2019/4/27 11:22
     */
    @RequestMapping("selectNews")
    public String selectNews(News news){

        newsService.selectNews(news);
        return null;
    }

}
