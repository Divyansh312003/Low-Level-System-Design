package LLDModelDesigns.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int showId;
    Movie movie;
    Screen screen;
    int startTime; 
    List<Seat> bookedSeats = new ArrayList<>();
    void setShowId(int showId) {
        this.showId = showId;
    }
    int getShowId() {
        return showId;
    }
    void setMovie(Movie movie) {
        this.movie = movie;
    }
    Movie getMovie() {
        return movie;
    }
    void setScreen(Screen screen) {
        this.screen = screen;
    }
    Screen getScreen() {
        return screen;
    }
    void setStartTime(int startTime) {
        this.startTime = startTime;
    }
    int getStartTime() {
        return startTime;
    }   
    List<Seat> getBookedSeats() {
        return bookedSeats;
    }
    void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
    
}
