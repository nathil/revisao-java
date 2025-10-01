// CodeWars: https://www.codewars.com/kata/56676e8fabd2d1ff3000000c/train/java

class FindNeedle {
  public static String findNeedle(Object[] haystack) {
    int len = haystack.length; 
    int pos = 0; 
    
    for(int i=0; i<len; i++){
      if(haystack[i] instanceof String){
        if(haystack[i].equals("needle")){
          pos = i; 
        }
      }
    }
    
      return "found the needle at position " + pos;
  }

}