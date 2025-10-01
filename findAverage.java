// CodeWars: https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/train/java

class findAverage {
    public static double findAverage(int[] array) {
      float sum = 0; 
      
      if(array.length == 0){
        return 0; 
      }
      
      for(int i=0; i<array.length; i++){
        sum += array[i]; 
      }
        return sum/array.length; 
    }
}