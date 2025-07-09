package LLDModelDesigns.TicTacToeDesign;

public class Player {
    String name;
    PlayerPiece type;
    public Player(String name,PlayerPiece type){
        this.name=name;
        this.type=type;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setPieceType(PlayerPiece type){
        this.type=type;
    }

    public PlayerPiece getPieceType(){
        return type;
    }

}
