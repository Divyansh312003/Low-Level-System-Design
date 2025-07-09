package LLDModelDesigns.TicTacToeDesign;

public class PlayerPiece {
    PieceType pieceType;
    public PlayerPiece(PieceType type){
        this.pieceType=type;
    }
    public PieceType getPieceType(){
        return pieceType;
    }
    public void setPieceType(PieceType type){
        this.pieceType=type;
    }
}
