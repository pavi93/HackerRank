package com.hackerrank.map;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SherlockAndAnagrams {


	    // Complete the sherlockAndAnagrams function below.
		static int sherlockAndAnagrams(String s) {
			/*Map<String, String> testMap = Arrays.stream(stringarray)
					.collect(Collectors.toMap(ke -> ke, Function.identity(), (a1, a2) -> a1));
			System.out.println(testMap);
			Map<String, Long> map = Arrays.stream(stringarray)
					.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
			System.out.println(map.keySet().stream().count());
			System.out.println(map);
			return 0;*/

			 Map<String,Integer> anagramCouter = new HashMap<String,Integer>();
			
			//Check Duplicate are present if no DUplicates then no anagrams can be formed
			Set<Character> checkDup = s.chars().mapToObj(c-> Character.valueOf((char)c)).collect(Collectors.toSet());
			if(s.length()==checkDup.size())
				return 0;
			
			for(int i=0;i<s.length();i++) {
				for(int j=i+1;j<=s.length();j++) {
					String anagramKey = getAnagramKey(s.substring(i, j));
					//In case of anagrams 2 strings will have same set of char and when sorted they will provide same result
					if(anagramCouter.containsKey(anagramKey))
						anagramCouter.put(anagramKey, anagramCouter.get(anagramKey)+1);
					else
						anagramCouter.put(anagramKey,1);
				}
			}
			return anagramCouter.values().stream().mapToInt(count -> (count*(count-1)/2)).sum();
		
		}

	    private static String getAnagramKey(String ss) {
	    	 // Sort the characters and send it back as string
			return ss.chars().sorted().mapToObj(c->Character.valueOf((char)c)).collect(StringBuilder::new, 
                    StringBuilder::appendCodePoint, 
                    StringBuilder::append).toString();
		}

		private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int q = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int qItr = 0; qItr < q; qItr++) {
	            String s = scanner.nextLine();

	            String aa = "ProtijayiGini";
	            String[] stringarray = aa.split("");

	            System.out.println(getAnagramKey("pavi"));
	           // int result = sherlockAndAnagrams(s);

	         //   bufferedWriter.write(String.valueOf(result));
	         //   bufferedWriter.newLine();
	        }

	       // bufferedWriter.close();

	        scanner.close();
	    }
	}
