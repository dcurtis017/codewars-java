package com.curtis.codewars;


public class Circle {
	  public static double area(double radius) throws IllegalArgumentException{
		  if(radius <=0)
		  {
			  throw new IllegalArgumentException();
		  }
		  Double area = Math.PI * (radius *radius);
		  java.text.DecimalFormat df2 = new java.text.DecimalFormat("###.##");
		  return Double.valueOf(df2.format(area));
		  // return (new BigDecimal(Math.PI * radius * radius)).setScale(2, RoundingMode.HALF_UP).doubleValue();
	  }
}
