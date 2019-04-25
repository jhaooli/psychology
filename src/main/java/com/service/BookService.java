package com.service;

import com.pojo.Book;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/4/24 22:11
 * @Description
 * @Modified by:
 */
public interface BookService {

    //获取所有的图书
    List<Book> listAllBooks();

    //通过书名获取图书
    List<Book> listBooksByName(Book book);

    //添加图书
    int createBook(Book book);

    //修改图书信息
    int updateBook(Book book);

    //删除图书
    int deleteBook(Book book);
}
