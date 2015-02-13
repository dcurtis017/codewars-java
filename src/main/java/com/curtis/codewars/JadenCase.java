package com.curtis.codewars;

public class JadenCase {

	public String toJadenCase(String phrase) {
		if(phrase == null || phrase == "")
		{
			return null;
		}
		StringBuffer finalString = new StringBuffer("");
		for(String str : phrase.split(" "))
		{
			finalString.append(Character.toUpperCase(str.charAt(0)) + str.substring(1));
			finalString.append(" ");
		}	
		String jCased = finalString.toString();
		return jCased.substring(0, jCased.length()-1);//could have used trim()
	}

}