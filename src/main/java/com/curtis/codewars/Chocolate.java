package com.curtis.codewars;

public class Chocolate {
	public static int breakChocolate(int n, int m) {
	    int tmp = (n*m)-1;
	    return (tmp < 0)?0:tmp;
	    //Math.max(n * m - 1, 0);
	    //or Integer.max
	}
}
