package com.jayram;

import java.math.BigInteger;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;

public class NumConversion {

	public static void main(String[] args) {
		if(args.length != 1){
			System.out.println("Please enter the number");
		}
		else{
			String number = args[0];
			NumberConversion numberConversionService = new NumberConversion(); //Creating instance of service using Service name in WSDL
			NumberConversionSoapType numberConversionSoap = numberConversionService.getNumberConversionSoap(); //Creating SOAP object using Port name in WSDL
			String numberToWords = numberConversionSoap.numberToWords(BigInteger.valueOf(Integer.parseInt(number))); //Calling Web service
			System.out.println(numberToWords);
		}
	}

}
