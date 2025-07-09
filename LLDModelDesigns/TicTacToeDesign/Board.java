package LLDModelDesigns.TicTacToeDesign;


public class Board {
    int size;
    PieceType[][] board;

    public Board(int n){
        this.size=n;
        this.board=new PieceType[n][n];
    }

    public boolean addPiece(int row,int column,PlayerPiece type){
        if(board[row][column]!=null) return false;
        board[row][column]=type.pieceType;
        return true;
    }

    public boolean  getFreeCells(){
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null) count++;
                if(count>0) return true;
            }
        }
        return false;
        
    }

    public void printBoard(){
          for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null) System.out.print("|"+"  ");
                else System.out.print(board[i][j]+"  ");
            }
            System.out.println();
          }
    }

    public boolean isThereWinner(PlayerPiece type){
        boolean done=true;
        //for row
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                 if(board[i][j]!=type.pieceType){
                    done=false;
                    break;
                 }
            }
            if(done) return true;
            done=true;
        }
        //for  all columns
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                 if(board[j][i]!=type.pieceType){
                    done=false;
                    break;
                 }
            }
            if(done) return true;
            done=true;
        }

        //for top left to bottom right diagonal 
        for(int i=0;i<size;i++){
           if(board[i][i]!=type.pieceType){
               done=false;
                 break;
           }
        }
        if(done) return true;
         done=true;

        //for top right -> bottom left diagonal
        for(int i=0;i<size;i++){
           if(board[i][size-i-1]!=type.pieceType){
               done=false;
                 break;
           }
        }
        if(done) return true;
        
        return false;
    }
}
