package LLDModelDesigns.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    int id;
    List<Seat> seats=new ArrayList<>();
    int getId() {
        return id;
    } 
    void setId(int id) {
        this.id = id;
    }   
    List<Seat> getSeats() {
        return seats;
    }   
    void setSeats(List<Seat> seats) {
        this.seats = seats;
    }  
}
