import java.util.Scanner;
import java.util.Random;


public class NumberGuessingGame {
  
    Random ran = new Random();
    private int Randomnum ;
    private int score = 100;
    public static final int Attempt=10;

public NumberGuessingGame(){
     Randomnum = 1 + ran.nextInt(20);
    }
    
    public int getRanNum(){
        return Randomnum;
    }
    public int getscore(){
        return score;
    }
    public void lessscore(){
    score-=10;
}
public String toString(){
    return String.format("The number of attempts = %d , Score = %d",Attempt,getscore());
}
}
