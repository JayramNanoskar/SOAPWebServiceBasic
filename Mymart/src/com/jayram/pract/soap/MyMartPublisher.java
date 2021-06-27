package com.jayram.pract.soap;

import javax.xml.ws.Endpoint;

public class MyMartPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
	}

}
