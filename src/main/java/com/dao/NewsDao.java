package com.dao;

import com.pojo.News;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/27 10:54
 * @Description
 * @Modified by:
 */
public interface NewsDao {

    /**
     * @Description 新增新闻
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/27 10:55
     */
    int insertNews(News news);

    /**
     * @Description 删除新闻
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/27 10:56
     */
    int deleteNews(News news);

    /**
     * @Description 修改新闻内容
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/27 10:57
     */
    int updateNews(News news);

    /**
     * @Description 获取所有新闻
     * @author      jhao
     * @param
     * @return
     * @exception
     * @date        2019/4/27 10:57
     */

    List<News> listAllNews();

    News selectNews(News news);
}
