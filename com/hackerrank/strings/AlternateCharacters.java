package com.hackerrank.strings;

import java.io.IOException;
import java.util.Scanner;

public class AlternateCharacters {


    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int result = 0 ;
        char start = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(start==s.charAt(i))
              result++;
            else
              start = s.charAt(i);   
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);
            System.out.println(String.valueOf(result));
          //  bufferedWriter.write(String.valueOf(result));
          //  bufferedWriter.newLine();
        }

      //  bufferedWriter.close();

        scanner.close();
    }
}
