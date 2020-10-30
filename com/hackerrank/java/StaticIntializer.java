package com.hackerrank.java;

import java.util.Scanner;

public class StaticIntializer {
// Exception cannot be thrown in static
// use getClass and getCanonicalName to get full qualified exception name	
		static int B = 0;
		static int H = 0;
		static boolean flag = true;
		static{
		    try{
		Scanner s = new Scanner(System.in);
		 B = s.nextInt();
		 H = s.nextInt();
		 if(B<=0 || H<=0){
		    flag= false;
		   throw new Exception("Breadth and height must be positive");
		  }
		    }
		    catch(Exception e){
		        System.out.println(e.getClass().getCanonicalName()+": "+e.getMessage());
		    }
		    
		}

		public static void main(String[] args){
				if(flag){
					int area=B*H;
					System.out.print(area);
				}
				
			}//end of main

		}//end of class


