package com.service.Impl;

import com.dao.NewsDao;
import com.pojo.News;
import com.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/27 10:55
 * @Description
 * @Modified by:
 */
@Service
public class NewsServiceImpl implements NewsService {
    
    @Autowired
    NewsDao newsDao;
    
    @Override
    public int insertNews(News news) {
        /**
         * @Description
         * @author      jhao
         * @param       [news]
         * @return      int
         * @exception   
         * @date        2019/4/27 11:00
         */
        return newsDao.insertNews(news);
    }

    @Override
    public int deleteNews(News news) {
        /**
         * @Description
         * @author      jhao
         * @param       [news]
         * @return      int
         * @exception   
         * @date        2019/4/27 11:01
         */
        return newsDao.deleteNews(news);
    }

    @Override
    public int updateNews(News news) {
        /**
         * @Description
         * @author      jhao
         * @param       [news]
         * @return      int
         * @exception
         * @date        2019/4/27 11:01
         */
        return newsDao.updateNews(news);
    }

    @Override
    public List<News> listAllNews() {
        /**
         * @Description
         * @author      jhao
         * @param       []
         * @return      java.util.List<com.pojo.News>
         * @exception   
         * @date        2019/4/27 11:03
         */
        return newsDao.listAllNews();
    }

    @Override
    public News selectNews(News news) {
        /**
         * @Description
         * @author      jhao
         * @param       [news]
         * @return      com.pojo.News
         * @exception   
         * @date        2019/4/27 11:21
         */
        return newsDao.selectNews(news);
    }
}
