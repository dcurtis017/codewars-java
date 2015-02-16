package com.curtis.codewars;

public class DRoot {
	  public static int digital_root(int n) {
	    if(n == 0 || (n%10 == n))
	    {
	    	return n;
	    }
	    else
	    {
	    	int tmp = 0;
	    	do
	    	{
	    		tmp+=(n%10);
	    		n = (int)n/10;
	    	}
	    	while(n%10 != n);
	    	return DRoot.digital_root(tmp+n);
	    }
	  }
}