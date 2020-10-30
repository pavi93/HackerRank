package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtractor {

	public static void main(String[] args){
		
		String test = "<h1><h1>HELLO</h1></h1><h2>PAVI</h2></\\\\1>";
		/*
		 * Below Pattern does the following 
		 * 1.Captures the substring   between < > usings . - Matches any character and * - any number of occurences as group 1
		 * 2.Captures the substring excluding < in a group(group2)
		 * 3.Marks the pattern as ending with </{{term in group 1}}>
		 * 4. Group 1 gives tagname Group 2 gives Extracted Strings
		 */
		Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
		List<String> tagExtractions = new ArrayList<String>();
		Matcher tagMatcher =  p.matcher(test);
		//find gives first occurence and doing it in a while loops it until it is false
		boolean f = false;
		while(tagMatcher.find()) {
			f = true;
			tagExtractions.add(tagMatcher.group(2));
		}
		if(!f)
			tagExtractions.add("None");

		tagExtractions.stream().forEach(System.out::println);	
		
				
		//tagExtractions.stream().collect(Collectors.joining("\n"));
	}
}
