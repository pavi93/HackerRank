package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TokenExtractor {
	public static void main(String[] args){
		String test = "afsag@fafas$Sdas";
		Pattern p = Pattern.compile("([^a-zA-Z ])");
		Matcher s = p.matcher(test);
		System.out.println(p.matcher(test).matches());
		List<Integer> indexList = new ArrayList<Integer>();
		while(s.find()) {
			//System.out.println(s.start());
			indexList.add(s.start());
			/*
			 * System.out.println(test.split(""+test.charAt(s.start()))[0]);
			 * test=test.substring(s.start()+1); System.out.println(test.charAt(s.start()));
			 */
		}
		System.out.println(indexList);
		int tempInd = 0;
		int i=0;
		String finalStr = "";
		while(i<indexList.size()) {
			System.out.println(test.substring(tempInd,indexList.get(i)));
			finalStr = test.substring(indexList.get(i)+1);
			tempInd = indexList.get(i)+1;
			i++;
			
		}
		System.out.println(finalStr);
		
		String check ="He is a very very good boy, isn't he?";
		System.out.println(check.split("[ !,?._'@]+").length);
		String[] str = check.split("[ !,?._'@]+"); 
		
		Arrays.stream(str).forEach(System.out::println);
	}
}
