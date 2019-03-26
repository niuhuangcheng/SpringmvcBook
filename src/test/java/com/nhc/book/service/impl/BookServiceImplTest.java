package com.nhc.book.service.impl;

import com.nhc.book.entity.Book;
import com.nhc.book.service.BookService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext_dao.xml"})
public class BookServiceImplTest {


    @Test
    public void queryBookList1() throws Exception {
        Book book = new Book();
        book.setName("雪");
        List<Book> books = bookService.queryBookList();
        System.out.println(books);

    }

    @Autowired
    BookService bookService;

    @Before
    public void beforeTest(){


    }

    @Test
    public void addBook() throws Exception {

        Book book = new Book();
        book.setBook_id("123456");
        book.setCategory("小说");
        book.setDescription("好小说");
        book.setImgurl("www.baidu.com");
        book.setName("笑傲江湖");
        book.setPnum(1);
        book.setPrice(10);
        bookService.addBook(book);

    }

    @Test
    public void queryBookList() throws Exception {
        List<Book> books = bookService.queryBookList();
        System.out.println(books);
    }

    @Test
    public void queryBookById() throws Exception {


        Book book = bookService.queryBookById(2);
        System.out.println(book);
    }

    @Test
    public void updateBook() throws Exception {
        Book book = new Book();
        book.setId(1);
        book.setBook_id("123456");
        book.setCategory("金庸小说");
        book.setDescription("好小说了");
        book.setImgurl("http://www.baidu.com");
        book.setName("笑傲江湖");
        book.setPnum(11);
        book.setPrice(101);
        bookService.updateBook(book);
    }

    @Test
    public void deleteBooks() throws Exception {

        Integer[] arrs = {7,8};
        bookService.deleteBooks(arrs);
    }
}