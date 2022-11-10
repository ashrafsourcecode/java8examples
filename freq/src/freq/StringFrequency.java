package freq;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringFrequency {

	public static void main(String[] args) {

		String s = "ashraf";

		List<String> lis = Arrays.asList(s);
		
		String c[] = s.split("");

		for(int i=0;i<s.length();i++) {
			//c[i] = s.split("");
			
		}
		
		List<String> lic = Arrays.asList(c);
		
		Set<String> hs = new HashSet<String>();
		
		hs.addAll(lic);
		for (String str : hs) {
			
			System.out.println("Character passed is : "+str +" frequency is : "+Collections.frequency(lic, str));
		}
		
		/*
		 * int count=0; for(int i =0;i<s.length();i++) {
		 * 
		 * c[i] = s.charAt(i);
		 * 
		 * 
		 * }
		 */
		
		
		
	}

}
