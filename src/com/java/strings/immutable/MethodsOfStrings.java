package com.java.strings.immutable;

public class MethodsOfStrings {

	public static void main(String[] args) {
		String str = "   MISSION IMPOSSIBLE ";

		System.out.println(str.length());
		System.out.println(str.charAt(3));// indexing starts from 0

//		str = "";
		System.out.println(str.isEmpty());

		str = str.trim();
		// MISSION IMPOSSIBLE
		System.out.println(str);

		boolean contains = str.contains("ON");
		System.out.println(contains);

		int indexOfStart = str.indexOf('S');
		System.out.println(indexOfStart);

		int indexOfEnd = str.lastIndexOf('S');
		System.out.println(indexOfEnd);

		// ISSIO
//		start , end - 1
		String substring = str.substring(1, 6);// start index is inclusive, end index is exclusive
		System.out.println(substring);
		
		str = str.toLowerCase();
		System.out.println(str);
		
		str = str.concat("- The Final Reckoning");
		System.out.println(str);
		
		str =  str + " !!!";
		System.out.println(str);
		
		str += "##";
		System.out.println(str);



	}

}
