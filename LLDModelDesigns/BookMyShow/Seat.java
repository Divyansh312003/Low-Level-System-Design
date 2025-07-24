package LLDModelDesigns.BookMyShow;

public class Seat {
    int seatId;
    int row;
    int price;
    SeatType seatType;
    void setSeatId(int seatId) {
        this.seatId = seatId;
    }
    int getSeatId() {
        return seatId;
    }
    void setRow(int row) {
        this.row = row;
    }
    int getRow() {
        return row;
    }
    void setPrice(int price) {
        this.price = price;
    }
    int getPrice() {
        return price;
    }
    void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }
    SeatType getSeatType() {
        return seatType;
    }
    

}
