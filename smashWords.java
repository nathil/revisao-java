// CodeWars: https://www.codewars.com/kata/53dc23c68a0c93699800041d/train/java

class SmashWords {

	public static String smash(String... words) {
    String result = ""; 
    
    for(int i=0; i<words.length; i++){
      result = String.join(" ", words); 
    }
    
    return result;
  }
}