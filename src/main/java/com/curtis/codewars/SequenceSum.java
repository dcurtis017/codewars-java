package com.curtis.codewars;

public class SequenceSum {
	public static int[] sumOfN(int n) {
		if(n == 0)
		{
			return new int[]{0};
		}
		int absN = Math.abs(n);
		int[] intList = new int[absN+1];
		for(int i = 0; i <= absN; ++i)
		{
			int j = (n < 0)?i*-1:i;
			intList[i] = (i > 0)?intList[i-1]+j:0;
		}
		return intList;
  }
}
/*
IntStream.rangeClosed(0, Math.abs(n)).forEach(
i -> {range[i] = i == 0 ? 0 : range[i - 1] + i * modifier;}
);
*/