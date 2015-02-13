package com.curtis.codewars;

class WordSearch {
	  static String[] findWord(String x, String[] y){
	    java.util.ArrayList<String> sList = new java.util.ArrayList<String>();
	    for(int i = 0; i < y.length; ++ i)
	    {
	      //System.out.println(x+" -- "+y[i]);
	      if(y[i].toLowerCase().contains(x.toLowerCase()))
	      {
	        sList.add(y[i]);
	        //System.out.println("found "+y[i]);
	      }
	    }
	    System.out.println("size "+sList.size());
	    return (sList.size() == 0)?new String[]{"Empty"}:sList.toArray(new String[sList.size()]);
	  }
}
/*
class WordSearch {
  static String[] findWord(String x, String[] y){
    final String xLower = x.toLowerCase();
    String[] searchResults = Arrays.stream(y)
                                   .filter(s -> s.toLowerCase().contains(xLower))
                                   .toArray(size -> new String[size]);
    return searchResults.length > 0 ? searchResults : new String[] {"Empty"};
  }
}
*/