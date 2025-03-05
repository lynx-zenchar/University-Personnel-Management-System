public class Homework8{
  public boolean check(char[] correctPositions, String word) {
    /* your solution goes here */

    if(correctPositions.length == 0){ // return true if list is empty
      return true;
    }

    for(int i = 0; i < correctPositions.length; i++){
      if(correctPositions[i] != '*' && correctPositions[i] != word.charAt(i)){
        return false; // return false if everything in list is not equal to word
      }
    }
    return true; // else return true
  }

  public static void main(String[] args){
    //System.out.println("Bruh."); // debug

    Homework8 hw8 = new Homework8();
    // Test cases
    char[] correctPositions = new char[]{ 'W', '*', 'R'};
    String word = "WoRdle";
  
    System.out.println(hw8.check(correctPositions, word));


    correctPositions = new char[]{ 'W', '*' };
    word = "wordle";

    System.out.println(hw8.check(correctPositions, word));

    correctPositions = new char[]{ 'S', '*', 'G', '*', 'R'};
    word = "SUGAR";

    System.out.println(hw8.check(correctPositions, word));

    correctPositions = new char[]{ }; 
    word = "";

    System.out.println(hw8.check(correctPositions, word));

    
    correctPositions = new char[]{ '*', '*', '*', '*', '*'}; 
    word = "PARADIGMS";

    System.out.println(hw8.check(correctPositions, word));

  }

    
}
