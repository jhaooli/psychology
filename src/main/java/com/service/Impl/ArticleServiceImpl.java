package com.service.Impl;

import com.dao.ArticleDao;
import com.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author jhao
 * @Date 2019/5/26 23:36
 * @Description
 * @Modified by:
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;
}
