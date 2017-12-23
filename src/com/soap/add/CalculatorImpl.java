package com.soap.add;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CalculatorImpl{
	
	@WebMethod
	public int add(int param1, int param2) {
		return param1 + param2;
	}
	

}
