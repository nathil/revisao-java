// CodeWars: https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/java

class CountSum{
    public static int[] countPositivesSumNegatives(int[] input){
      if(input == null || input.length == 0){
        return new int[0]; 
      }
      
      int countPos = 0, sumNeg = 0; 
      
      for(int i=0; i<input.length; i++){
        if(input[i] > 0){
          countPos++; 
        } else {
          sumNeg += input[i]; 
        }
      }
      int[] result = {countPos, sumNeg}; 
      
        return result; //return an array with count of positives and sum of negatives
    }
}