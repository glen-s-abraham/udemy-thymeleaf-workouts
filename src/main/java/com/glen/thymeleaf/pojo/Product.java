package com.glen.thymeleaf.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {
	private Integer id;
	private String courseName;
	private String courseSubtitle;
	private Author author;
	private BigDecimal price;
	private List<Category> productCategories = new ArrayList<>();
	private String imageUrl;
	private String courseDescription;
	public Product() {
	
	}
	public Product(Integer id, String courseName, String courseSubtitle, Author author, BigDecimal price,
			List<Category> productCategories, String imageUrl, String courseDescription) {
		
		this.id = id;
		this.courseName = courseName;
		this.courseSubtitle = courseSubtitle;
		this.author = author;
		this.price = price;
		this.productCategories = productCategories;
		this.imageUrl = imageUrl;
		this.courseDescription=courseDescription;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseSubtitle() {
		return courseSubtitle;
	}
	public void setCourseSubtitle(String courseSubtitle) {
		this.courseSubtitle = courseSubtitle;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public List<Category> getProductCategories() {
		return productCategories;
	}
	public void setProductCategories(List<Category> productCategories) {
		this.productCategories = productCategories;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	
	
	
	
	
	
	
	
}
