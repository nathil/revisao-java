// CodeWars: https://www.codewars.com/kata/5601409514fc93442500010b/train/java

class BestScore {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int sum = 0;
    
    for(int i=0; i<classPoints.length; i++){
      sum += classPoints[i]; 
    }
    return yourPoints > (sum + yourPoints)/(classPoints.length + 1); 
  }
}