package com.jayram.pract.soap;

import java.util.List;

import javax.jws.WebService;

import com.jayram.pract.soap.model.Product;
import com.jayram.pract.soap.service.ProductServiceImpl;

@WebService(endpointInterface="com.jayram.pract.soap.ProductCatalogInterface", name="MyMartCatalog", portName="MyMartCatalogPort", serviceName="MyMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@Override
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	@Override
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	@Override
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);
	}

	@Override
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
	}
}
