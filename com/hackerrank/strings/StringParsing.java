package com.hackerrank.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class StringParsing {
	
	public static void main(String[] args) {
		Map<String,String> resultMap = new HashMap<String,String>();
		   
		 String input = "aAbBcC123!@#";
		 //String[] inputArr = input.split("");
		 Pattern lowerCase = Pattern.compile("[a-z]");
		 Pattern upperCase = Pattern.compile("[A-Z]");
		 Pattern numbers = Pattern.compile("\\d");
	
		 


		String result = ""; 
		  for(int i=0;i<input.length();i++){
		         
		         if(lowerCase.matcher(input.charAt(i)+"").matches()){
		             result  = resultMap.get("lowercase")==null?""+input.charAt(i)+"":resultMap.get("lowercase")+input.charAt(i)+"";
		             resultMap.put("lowercase",result );
		         }
		         else if(upperCase.matcher(input.charAt(i)+"").matches()){
		             result  = resultMap.get("uppercase")==null?""+input.charAt(i)+"":resultMap.get("uppercase")+input.charAt(i)+"";
		             resultMap.put("uppercase",result );
		         }
		          else if(numbers.matcher(input.charAt(i)+"").matches()){
		             result  = resultMap.get("numbers")==null?""+input.charAt(i)+"":resultMap.get("numbers")+input.charAt(i)+"";
		             resultMap.put("numbers",result );
		         }
		         else{
		         result  = resultMap.get("symbols")==null?""+input.charAt(i)+"":resultMap.get("symbols")+input.charAt(i)+"";
		             resultMap.put("symbols",result );
		         }
		             
		      
		}
		System.out.println(resultMap );

	}
}
