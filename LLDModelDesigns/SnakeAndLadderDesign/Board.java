package LLDModelDesigns.SnakeAndLadderDesign;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
     Cells[][] cells;
     Deque<Player> dq;
     Dice dice;
     Board(int size,int snakes,int ladders){
        initialize(size);
        addSnakesAndLadders(snakes,ladders);

     }

     void initialize(int s){
        cells=new Cells[s][s];
        for(int i=0;i<s;i++){
            for(int j=0;j<s;j++){
                Cells obj=new Cells(Type.NULL);
                cells[i][j]=obj;
            }
        }
     }
     void addSnakesAndLadders(int snakes,int ladders){
          while(snakes>0){
             int st=ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
             int end=ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
              if(end>=st) continue;
              cells[st][end].start=st;
              cells[st][end].end=end;
              cells[st][end].type=Type.SNAKE;
              snakes--;
            }
            
          while(ladders>0){
              int st=ThreadLocalRandom.current().nextInt(0,cells.length*cells.length);
              int end=ThreadLocalRandom.current().nextInt(0,cells.length*cells.length);
              if(st>=end) continue;
              cells[st][end].start=st;
              cells[st][end].end=end;
              cells[st][end].type=Type.LADDER;
              ladders--;
          }
     }

     void startGame(int numOfPlayers){
        dq=new ArrayDeque<>();
        Scanner sc=new Scanner(System.in);

        while(numOfPlayers>0){
            System.out.println("Enter name of player :"); 
            String name=sc.nextLine();
            Player player=new Player(name,0);
            dq.add(player);
            numOfPlayers--;
        }
        System.out.println("Enter number of dices: ");
        int d=sc.nextInt();
         dice=new Dice(d);
        boolean winner=false;
        while(!winner){
            Player currPlayer=dq.removeFirst();
            int currPos=currPlayer.currPos;
            int lastIdx=cells.length*cells.length-1;
            if(currPlayer.currPos==lastIdx){
                System.out.println("Winner is player: "+ currPlayer.name);
                winner=true;
                break;
            }

            int sum=dice.rollDice();
            if(sum>lastIdx-currPos) {
                dq.addLast(currPlayer);
                continue;
            }
            else{
                int newPos=currPos+sum;
                int row=newPos/10;
                int col=currPos-(row*cells.length);
                if(cells[row][col].start!=-1){
                     if(cells[row][col].type==Type.LADDER){
                        currPlayer.currPos=cells[row][col].end;
                        if(currPlayer.currPos==lastIdx){
                            System.out.println("Winner is player: "+ currPlayer.name);
                                   winner=true;
                                    break;
                        }
                     }
                     else{
                        currPlayer.currPos=cells[row][col].end;
                        dq.addLast(currPlayer);
                     }

                }
                else{
                    currPlayer.currPos=newPos;
                    dq.addLast(currPlayer);
                }
            }
        }
        sc.close();

       
     }

    
}
