package com.jayram.pract.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {
	
	@WebMethod
	@WebResult(partName="lookupOutput")
	public String getShopInfo(@WebParam(partName="lookupInput") String property){
		String response = "Invalid property";
		if("shopName".equalsIgnoreCase(property)){
			response = "My Mart";
		}
		else if("since".equalsIgnoreCase(property)){
			response = "since 2021";
		}
		return response;
	}
}
