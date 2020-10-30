package com.hackerrank.java;

import java.util.Scanner;

public class ReadIp {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String lines ="" ;
        int count = 0;
        while(s.hasNextLine()) {
        	String templine = s.nextLine();
        	if(templine.equals(""))
        		break;
        	else {
        		templine = ++count+" "+templine+"\n" ;
        		lines = lines +templine;
        	}
        }
        
        System.out.println(lines);
    }
}