package com.jayram.pract.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.jayram.pract.soap.model.Product;

@WebService(targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {
	
	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	public abstract List<String> getProductCategories();
	
	@WebMethod
	public abstract List<String> getProducts(String category);
	
	@WebMethod
	@WebResult(name="Product")
	public abstract List<Product> getProductsv2(String category);
	
	@WebMethod
	public abstract boolean addProduct(String category, String product);

}