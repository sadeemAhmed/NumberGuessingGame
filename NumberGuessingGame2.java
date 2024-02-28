import java.util.Random;
import java.util.Scanner;

 
public class NumberGuessingGame2 {
   NumberGuessingGame obj =new NumberGuessingGame();
   Scanner input = new Scanner(System.in);
   private int playerGuess;
   private String name;
   private int numOfAttempt = 0;
   
   public NumberGuessingGame2(){
       printandname();
       tryy();
   }
   public boolean check(){
       if(playerGuess < 1 || playerGuess > 20 ){
            try{
                throw new IllegalArgumentException("The number is out of range");
       
            }
            catch(IllegalArgumentException ex){
                System.out.println(ex);
         
            }
        obj.lessscore();
         System.out.printf("score = %d \n",obj.getscore());
        numOfAttempt+=1;
        return true;
        }
        else 
       return false;
   }
 
   public void printandname(){
    System.out.println("WELCOME TO THE NUMBER GUESSING GAME!! \nenter your name");
    name = input.next();
    System.out.printf("Hi %s \n",name);
    System.out.println(obj);
    System.out.println("NOTE: the number between 1 and 20");
    }
    
public void tryy(){
    for(int i=1; i<=NumberGuessingGame.Attempt;i++){
        System.out.printf("Attempt %d Enter the number ",i);
      playerGuess=input.nextInt();
      if(check()==true)
      continue;
      
        if(playerGuess==obj.getRanNum()){
        System.out.printf("congratulation :) !! you win  \n you score is %d \n",obj.getscore());
        break;}
        else if(playerGuess<obj.getRanNum()){
            System.out.printf("the number is greater then %d try again \n",playerGuess);}
        else if(playerGuess>obj.getRanNum()){
            System.out.printf("the number is lower then %d try again \n",playerGuess);}
        else {
        System.out.println("try again"); }
       obj.lessscore();
        System.out.printf("score = %d \n",obj.getscore());
        numOfAttempt+=1;
        
    }
    if(numOfAttempt==NumberGuessingGame.Attempt)
        System.out.println("you lost the game :(");
}
public String toString(){
    return String.format("player name: %s \nnumber of player attempts: %d", name,numOfAttempt);
}
}

