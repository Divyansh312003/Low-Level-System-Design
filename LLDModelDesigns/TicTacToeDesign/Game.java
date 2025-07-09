package LLDModelDesigns.TicTacToeDesign;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
    Deque<Player> dq;
    Board gameBoard;
    Scanner sc;
    public Game(){
        init();
    }

    void init(){
        sc=new Scanner(System.in);
        dq=new ArrayDeque<>();
        PlayerPiece pX=new PlayerPieceX();
        Player p1=new Player("Player 1",pX);

        PlayerPiece pO=new PlayerPieceO();
        Player p2=new Player("Player 2",pO);

        dq.addLast(p1);
        dq.addLast(p2);
        gameBoard=new Board(3);
    }

    public void startGame(){
        boolean winner=true;
        while(winner){
            Player player=dq.removeFirst();
            if(!gameBoard.getFreeCells()){
                winner=false;
                continue;
            }

            gameBoard.printBoard();
            System.out.println("Enter the row and column: ");
            int x=sc.nextInt(),y=sc.nextInt();
            if(!gameBoard.addPiece(x,y,player.getPieceType())){
                 System.out.println("Incorrect position , Try again!!");
                 dq.addFirst(player);
                 continue;
            }

            if(gameBoard.isThereWinner(player.getPieceType())){
                gameBoard.printBoard();
               System.out.println("Winner is player: "+player.getName());
               break;
            }
            dq.addLast(player);

          }
          if(!winner){
            System.out.println("Tie Game");
          }
    }
    
}
