// Codewars: https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java

class CountSheep {
  public static String countingSheep(int num) {
    String murmur = ""; 
    
    for(int i=1; i<=num; i++){
      murmur += i + " sheep..."; 
    }
    
    return murmur;
  }
  
}