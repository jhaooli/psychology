package com.service.Impl;

import com.dao.BookDao;
import com.pojo.Book;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/24 22:35
 * @Description
 * @Modified by:
 */
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookDao bookDao;

    @Override
    public List<Book> listAllBooks() {
        /**
         * @Description
         * @author      jhao
         * @param       []
         * @return      java.util.List<com.pojo.Book>
         * @exception   
         * @date        2019/4/24 22:36
         */
        return bookDao.listAllBooks();
    }

    @Override
    public List<Book> listBooksByName(Book book) {
        /**
         * @Description
         * @author      jhao
         * @param       [book]
         * @return      java.util.List<com.pojo.Book>
         * @exception   
         * @date        2019/4/24 22:42
         */
        return bookDao.listBooksByName(book);
    }

    @Override
    public int createBook(Book book) {
        /**
         * @Description
         * @author      jhao
         * @param       [book]
         * @return      int
         * @exception
         * @date        2019/4/24 22:42
         */
        return bookDao.createBook(book);
    }

    @Override
    public int updateBook(Book book) {
        /**
         * @Description
         * @author      jhao
         * @param       [book]
         * @return      int
         * @exception
         * @date        2019/4/24 22:43
         */
        return bookDao.updateBook(book);
    }

    @Override
    public int deleteBook(Book book) {
        /**
         * @Description
         * @author      jhao
         * @param       [book]
         * @return      int
         * @exception
         * @date        2019/4/24 22:43
         */
        return bookDao.deleteBook(book);
    }
}
