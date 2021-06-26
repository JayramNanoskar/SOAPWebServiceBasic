package com.jayram.pract.soap.service;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {
	
	List<String> bookList = new ArrayList<String>();
	List<String> musicList = new ArrayList<String>();
	List<String> movieList = new ArrayList<String>();
	
	public ProductServiceImpl(){
		bookList.add("Book1");
		bookList.add("Book2");
		bookList.add("Book3");
		
		musicList.add("Music1");
		musicList.add("Music2");
		musicList.add("Music3");
		
		movieList.add("Movie1");
		movieList.add("Movie2");
		movieList.add("Movie3");
	}
	
	public List<String> getProductCategories(){
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movie":
			return movieList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product){
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			break;
		case "music":
			bookList.add(product);
			break;
		case "movies":
			bookList.add(product);
			break;
		default:
			return false;
		}
		return true;
	}
}
