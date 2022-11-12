package com.test;

import java.util.Optional;

public class ChkOpt {
	
	public static void main(String[] args) {
		
		 String[] str = new String[10];
		 
		 Optional<String> chkNull = Optional.ofNullable(str[4]);
		 
		 
		if( chkNull.isPresent()) {
			
			System.out.println("value yes");
		}
		else {
			
			System.out.println("value not ");
		}
		 
		 
	}

}
