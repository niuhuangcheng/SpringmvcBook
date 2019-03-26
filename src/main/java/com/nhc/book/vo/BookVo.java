package com.nhc.book.vo;


import lombok.Data;

@Data
public class BookVo {
    private Integer id;
    private  String book_id;
    private String  name;
    private Double  price;
    /**
     * 查询区间最小值
     */
    private Double  minprice;
    /**
     * 查询区间最大值
     */
    private Double  maxprice;
    private String  category;
    private int  pnum;
    private String imgurl;
    private String  description;

}
