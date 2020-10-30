package com.hackerrank.array;

public class MaxSubArrayAdjacent {


	public static void main(String[] a) {
		//int[] arr1 = { 10, 2, -12, 5,-2,4,5,-2 };
		int[] arr1 = {-2,1,3,-4,5};
		int sum = arr1[0];
		int max = arr1[0];
		for(int i=1;i<arr1.length-1;i++) {
			int temp = sum+arr1[i+1];
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
