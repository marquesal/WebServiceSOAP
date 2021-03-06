package com.example.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calc {
  
  @WebMethod
  public String squared(String number){
    double num = Double.valueOf(number);
    return Double.toString(num * num);
  }  
  @WebMethod(operationName="add")
  // Annotate this method. Name the operation "add"
  public String addTwo(String aStr, String bStr){
    // Convert strings and calculate result
    double plus = Double.parseDouble(aStr) + Double.parseDouble(bStr);
    return String.valueOf(plus);  
  }
@WebMethod(operationName="subtract")
  // Annotate this method. Name the operation "subtract"
  public String subtractTwo(String aStr, String bStr){
    // Convert strings and calculate result
    double sub = Double.parseDouble(aStr) - Double.parseDouble(bStr);
    return String.valueOf(sub);    
  }
}
