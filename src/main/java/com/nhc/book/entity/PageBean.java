package com.nhc.book.entity;

import lombok.Data;

import java.util.List;

@Data
public class PageBean {
	 private List<Book> list;  //查询的数据集合
	 private int  pageNo;   //当前页
	 private int pageSize; //每页需要的数据
	 private int totalPage;  //总页数 ，Math.ceil(totalCount/pageSize)
	 private int startPos;   //当前页面展示的页数的开始位置
	 private int endPos;     //当前页面展示的页数的结束位置
	 private long totalCount;  //该分类的总的数据
	 private String category; //分类

}
