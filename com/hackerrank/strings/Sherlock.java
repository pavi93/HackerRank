package com.hackerrank.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sherlock {

	// Complete the isValid function below.
	static String isValid(String s) {
		int[] charArr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			charArr[s.charAt(i) - 'a']++;
		}
		int stdCount = 0;
		boolean flag = true;
		/*
		 *      Sample Test Logs
		 *  for(int i=0;i<charArr.length;i++){
		 * System.out.println((char)(i+'a')+ " - "+charArr[i]); }
		 */
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == 0)
				continue;
			else {
				if (stdCount == 0)
					stdCount = charArr[i];
				else if (charArr[i] != stdCount) {
					if (!flag)
						return "NO";
					else {
						if (Math.abs(stdCount - charArr[i]) == 1)
							flag = false;
						else if (charArr[i] == 1)
							flag = false;
						else
							return "NO";
					}
				}

			}

		}
		return "YES";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = isValid(s);
		System.out.println(result);
		/*
		 * bufferedWriter.write(result); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}
