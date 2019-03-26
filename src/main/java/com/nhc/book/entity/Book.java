package com.nhc.book.entity;

import lombok.Data;

/**
 * Author: bluesky
 * Email: wangwujuan@finupgroup.com
 * Date:2018-12-03
 * Desc:
 */
@Data
public class Book {
    private Integer id;
    private  String book_id;
    private String  name;
    private double   price;
    private String category;
    private int  pnum;
    private String imgurl;
    private String  description;
}
