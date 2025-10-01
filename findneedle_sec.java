class FindNeedleSec {
  public static String findNeedle(Object[] haystack) {
    int len = haystack.length; 
    int pos = 0; 
    
    for(int i=0; i<len; i++){
      if(haystack[i] instanceof String && haystack[i].equals("needle")){
          pos = i; 
      }
    }
    
      return "found the needle at position " + pos;
  }

}