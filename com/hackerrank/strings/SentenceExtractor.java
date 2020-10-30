package com.hackerrank.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class SentenceExtractor {

	public static void main(String[] a) {
		String sentence = "John is a good man.John is married.John is workin in IT.John has 2 kids.John lives happily with his parents wife and Children.";
		
		Pattern pattern = Pattern.compile("(John)([^.]+).");
		boolean f = false;
		List<String> tagExtractions = new ArrayList<String>();
		Matcher tagMatcher =  pattern.matcher(sentence);
		while(tagMatcher.find()) {
			f = true;
			tagExtractions.add(tagMatcher.group(2));
		}
		if(!f)
			tagExtractions.add("None");
		System.out.println("JOHN's Attributes");		
		System.out.println(tagExtractions.stream().collect(Collectors.joining("\n*")));	
	}
}
