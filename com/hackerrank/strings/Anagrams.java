package com.hackerrank.strings;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
    	int result = 0;
    	int[] arrA = new int[26];
    	int[] arrB = new int[26];
    	for(int i = 0;i<a.length();i++) {
    		arrA[a.charAt(i)-'a']++;
    	}
    	for(int i = 0;i<b.length();i++) {
    		arrB[b.charAt(i)-'a']++;
    	}
    	for(int i=0;i<26;i++)
    		result = result + Math.abs(arrA[i]-arrB[i]);
    	return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);
        System.out.println(res);
     //   bufferedWriter.write(String.valueOf(res));
       // bufferedWriter.newLine();

      //  bufferedWriter.close();

        scanner.close();
    }
}
