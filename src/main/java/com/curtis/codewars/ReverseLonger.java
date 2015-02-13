package com.curtis.codewars;

public class ReverseLonger {


	public static String shorterReverseLonger(String a, String b) {
		Boolean firstIsLonger;
		String tmp;
		StringBuilder reversedString = new StringBuilder("");
		
		if((a.length() > b.length()) || (a.length() == b.length()))
		{
			firstIsLonger = true;
			tmp = a;
		}
		else
		{
			firstIsLonger = false;
			tmp = b;
		}
		for(int i = tmp.length()-1; i >=0; --i)
		{
			reversedString.append(tmp.charAt(i));
		}
		return (firstIsLonger)?b+reversedString.toString()+b:a+reversedString.toString()+a;
	}

}
//stringbuilder has a reverse method