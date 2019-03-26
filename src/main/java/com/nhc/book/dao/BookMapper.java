package com.nhc.book.dao;


import com.nhc.book.entity.Book;
import com.nhc.book.vo.BookVo;

import java.util.List;

public interface BookMapper {

    public int insertBook(Book book);

    public List<Book> queryBookList();

    public List<Book> queryBookListByCondition(BookVo book);


    public Book queryBookById(Integer id);

    public int updateBook(Book book);

    public void deleteBook(Integer id);

    public void deleteBooks(Integer[] ids);
}
