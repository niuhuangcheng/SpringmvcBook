package com.nhc.book.controller;


import com.nhc.book.entity.Book;
import com.nhc.book.service.BookService;
import com.nhc.book.vo.BookVo;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @RequestMapping("/query")
    public String bookListQueryByCondition(Model model,BookVo book){
        List<Book> bookList = bookService.queryBookList(book );
        model.addAttribute("bookList",bookList);
        return "products/list";
    }


    @GetMapping("/list")
    public String bookList(Model model){
        List<Book> bookList = bookService.queryBookList();
        model.addAttribute("bookList",bookList);
        return "products/list";
    }

    @GetMapping("/add")
    public String bookAddPage(){
        return "products/add";
    }
    @PostMapping("/saveBook")
    public String saveBook(@RequestParam("imgPath")MultipartFile imgPath,
                           HttpServletRequest request,Book book,Model model) throws IOException {




        String fileName = FilenameUtils.getName(imgPath.getOriginalFilename());
        String fileDir = "/Users/niuhuangcheng/Documents/img";
        File dir = new File(fileDir);
        if(!dir.exists()){
            dir.mkdirs();
        }
        File uploadFile = new File(fileDir+File.separator+fileName);

        System.out.println("upload_file"+uploadFile);
        if(!imgPath.isEmpty()){
            imgPath.transferTo(uploadFile);
        }
        String uuid = UUID.randomUUID().toString().replace("-","");
        book.setBook_id(uuid);
        String path = uploadFile.getAbsolutePath();
        book.setImgurl("http://localhost:8080/img/"+path.substring(path.lastIndexOf("/")+1));
        int rowCount = bookService.addBook(book);
        if(rowCount > 0){
            return "redirect:list";
        }else{
            model.addAttribute("book",book);
            return "products/add";
        }

    }

    @RequestMapping("/edit")
    public String editBookPage(Model model,Integer id){
        Book book = bookService.queryBookById(id);
        model.addAttribute("book",book);
        return "products/edit";
    }

    @RequestMapping("/delete")
    public String deleteBook(Model model,Integer id){
        bookService.deleteBook(id);
        return "redirect:list";
    }
    @RequestMapping("/batchDelete")
    public String deleteBooks(Model model,Integer[] ids){
        bookService.deleteBooks(ids);
        return "redirect:list";
    }


    @RequestMapping("update")
    public String updateBook(@RequestParam("imgPath") MultipartFile imgPath,
                             HttpServletRequest request,Book book,Model model) throws IOException {

        String imgUrl = "";

        if(!imgPath.isEmpty()){
            String fileName = FilenameUtils.getName(imgPath.getOriginalFilename());
            String fileDir = "/Users/niuhuangcheng/Documents/img";
            File dir = new File(fileDir);
            if(!dir.exists()){
                dir.mkdirs();
            }
            File uploadFile = new File(fileDir+File.separator+fileName);
            String path = uploadFile.getAbsolutePath();
            imgPath.transferTo(uploadFile);
            imgUrl = "http://loacalhost:8080/img/"+path.substring(path.lastIndexOf("/")+1);
        }else{
            Book bookOld = bookService.queryBookById(book.getId());
            imgUrl = bookOld.getImgurl();
        }
        book.setImgurl(imgUrl);
        int rowCount = bookService.updateBook(book);
        if(rowCount>0){
            return "redirect:list";
        }else{
            model.addAttribute("book",book);
            return "products/edit";
        }

    }



}
