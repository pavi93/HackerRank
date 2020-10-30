package com.hackerrank.map;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonSubString {


    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	 
    	// Set<Character> set = s2.chars().mapToObj((c) -> Character.valueOf((char)c)).collect(Collectors.toSet());

    	 Set<String> set1 = new HashSet<String>(Arrays.asList(s1.split(""))); 
         for(int i=0;i<s2.length();i++){
             if(set1.contains(s2.charAt(i)+""))
               return "YES";
         }

         return "NO" ; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    //    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);
            System.out.println(result); 
           // bufferedWriter.write(result);
           // bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
