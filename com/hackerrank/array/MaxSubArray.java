package com.hackerrank.array;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class MaxSubArray {

	public static void main(String[] a) {
		//int[] arr1 = { 10, 2, -12, 5,-2,4,5,-2 };
		int[] arr1 = { 1, -2, 0, 2,-2,4,5,-2 };
		int sum = arr1[0];
		int max = arr1[0];
		for(int i=1;i<arr1.length;i++) {
			int temp = sum+arr1[i];
			if(temp>max) {
				max = temp;
				sum=max;
			}
			else if(temp<0)
				sum = 0;
			else
				sum = temp;
		}
		System.out.println("MAX "+ max);
		
		
		System.out.println(null+"s");
		
	}	
		
}
