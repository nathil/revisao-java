// CodeWars: https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java

class PlayBanjo {
  public static String areYouPlayingBanjo(String name) {
  
    char letter = name.charAt(0); 
      
    if(String.valueOf(letter).equals("r") || String.valueOf(letter).equals("R")){
      return name + " plays banjo"; 
    }
    return name + " does not play banjo"; 
      
  }
}