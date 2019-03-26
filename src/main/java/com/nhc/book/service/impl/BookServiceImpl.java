package com.nhc.book.service.impl;

import com.nhc.book.dao.BookMapper;
import com.nhc.book.entity.Book;
import com.nhc.book.service.BookService;
import com.nhc.book.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    public int addBook(Book book) {
        return bookMapper.insertBook(book);
    }

    public List<Book> queryBookList() {
        return bookMapper.queryBookList();
    }
    public List<Book> queryBookList(BookVo book) {
        return bookMapper.queryBookListByCondition(book);
    }

    public Book queryBookById(Integer id) {
        return bookMapper.queryBookById(id);
    }

    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    public void deleteBook(Integer id){
         bookMapper.deleteBook(id);
    }
    public void deleteBooks(Integer[] ids){
        bookMapper.deleteBooks(ids);
    }
}
