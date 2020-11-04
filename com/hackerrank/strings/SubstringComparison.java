package com.hackerrank.strings;

import java.util.Collections;
import java.util.Scanner;

public class SubstringComparison {

	    public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        java.util.TreeSet<String> subStrSet = new java.util.TreeSet<String>();
	        
	        for(int i=0;i<=s.length()-3;i++){
	            subStrSet.add(s.substring(i,i+2));
	         
	        }
	        StringBuffer s1 = new StringBuffer("dsa");
	        s1.reverse().toString();
	        smallest = subStrSet.first();	        
	        largest = subStrSet.last();
            return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}