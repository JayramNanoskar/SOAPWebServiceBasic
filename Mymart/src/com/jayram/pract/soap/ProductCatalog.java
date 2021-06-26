package com.jayram.pract.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.jayram.pract.soap.model.Product;
import com.jayram.pract.soap.service.ProductServiceImpl;

@WebService(name="MyMartCatalog", portName="MyMartCatalogPort", serviceName="MyMartCatalogService", targetNamespace="http://www.testmart.com")
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();
	
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public List<String> getProductCategories(){
		return productService.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category){
		return productService.getProducts(category);
	}
	
	@WebMethod
	public List<Product> getProductsv2(String category){
		return productService.getProductsv2(category);
	}

	@WebMethod
	public boolean addProduct(String category, String product){
		return productService.addProduct(category, product);
	}
}
