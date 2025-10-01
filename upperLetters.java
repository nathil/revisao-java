// CodeWars: https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java

class UpperLetters {

	public String upperLetters(String phrase) {
    String newPhrase = ""; 
    
    if(phrase == null || phrase.isEmpty()){
      return null; 
    }
    
    String[] words = phrase.split(" "); 
    
    for(int i=0; i<words.length; i++){
      words[i] =  Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1); 
    }
    
    for(String word: words){
      newPhrase = String.join(" ", words); 
    }
    
		return newPhrase;
    
	}

}