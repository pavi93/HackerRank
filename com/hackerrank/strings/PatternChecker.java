package com.hackerrank.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code
              try{
               Pattern p = Pattern.compile(pattern);
               p.matcher("").matches(); 
          System.out.println("Valid");

       
		}
        catch(PatternSyntaxException e){
            System.out.println("Invalid");
        }
              testCases--; ;
       /* 
        * Map<String,Long> regexMap = pattern.chars().mapToObj(reg -> (Character.valueOf((char)reg).toString())).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      if((regexMap.get("(")==regexMap.get(")")) && (regexMap.get("[")==regexMap.get("]")))
          System.out.println("Valid");
      else
          System.out.println("Invalid");
          */
		}
	}

}
