package com.hackerrank.strings;

import java.util.Scanner;

public class StringFormatter {



	    public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++)
	            {
	                String s1=sc.next();
	                int x=sc.nextInt();
	                //Complete this line
	                // $1$s - marks first param as string
	                // %2$s  - marks second param as string
	                //to have leading 0 - %1$15s
	                //to have trailing zero - ur input - %1$-15s
	                if(x>=100)
	                    System.out.println(String.format("%1$-14s %2$s",s1,x));
	                else
	                     System.out.println(String.format("%1$-14s %2$s" ,s1,(x<10?"00"+x:"0"+x)));
	            }
	            System.out.println("================================");

	    }
	}



