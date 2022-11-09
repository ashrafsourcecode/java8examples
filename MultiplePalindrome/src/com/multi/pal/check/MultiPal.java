package com.multi.pal.check;

import java.util.HashSet;
import java.util.Set;

public class MultiPal {
	
	public static void main(String[] args) {
		
		String input="MALAYALAM";
		
		    Set<String> palindromes = new HashSet<>();
		    for (int i = 0; i < input.length(); i++) {
		        for (int j = i + 1; j <= input.length(); j++) {
		            if (isPalindrome(input.substring(i, j))) {
		                palindromes.add(input.substring(i, j));
		            }
		        }
		    }
		    
		    System.out.println(palindromes);
		}

		private static boolean isPalindrome(String input) {
		    StringBuilder plain = new StringBuilder(input);
		    StringBuilder reverse = plain.reverse();
		    return ((reverse.toString()).equals(input) && reverse.length()>1 );
		}
		
	}

