package LLDModelDesigns.SnakeAndLadderDesign;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min=1,max=6;
    public Dice(int c){
        this.diceCount=c;
    }

    public int rollDice(){
      int rolled=0,sum=0;
      while(rolled<diceCount){
         sum+=(ThreadLocalRandom.current().nextInt(min,max+1));
         rolled++;
      }
      return sum;
    }
}
