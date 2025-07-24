package LLDModelDesigns.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class BookMyShow {
    MovieController movieController;
    TheatreController theatreController;
    BookMyShow(){
        movieController=new MovieController();
        theatreController=new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();
        bookMyShow.initialize();

        bookMyShow.createBooking(City.Bangalore,"Avengers");
    }

    public void initialize(){
        createMovies();
        createTheatres();
    }

    public void createBooking(City city,String movieName){
        //getting particular movie from the city and name 
         Movie movie= movieController.getMovieByName(movieName,city);
         if(movie==null){
            System.out.println("Movie not present");
            return;
         }
        List<Theatre> theatres= theatreController.getTheatresByCity(city);
         if(theatres.isEmpty()){
            System.out.println("No theatres available in this city");
            return;
         }
         Theatre theatre= theatres.get(0);
            Show show = new Show();
            show.setShowId(1);
            show.setMovie(movie);
            show.setScreen(createScreen());
            show.setStartTime(1200);
            theatre.getShows().add(show);
            System.out.println("Booking created for movie: " + movie.getName() + " in theatre: " + theatre.getAddress());


         


    }

    public Screen createScreen() {
        Screen screen = new Screen();
        screen.setId(1);
        List<Seat> seats = new ArrayList<>();
        for(int i=1;i<10;i++){

            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatType(SeatType.REGULAR);
            seats.add(seat);
        }

        for(int i=10;i<19;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatType(SeatType.GOLD);
            seats.add(seat);
        }

         for(int i=20;i<29;i++){
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatType(SeatType.PLATINUM);
            seats.add(seat);
        }
        return screen;
    }

    public void createMovies(){
       Movie movie=new Movie();
        movie.setId(1);  
        movie.setName("Avengers");
        movie.setDurationInMin(180);

        Movie movie2=new Movie();
        movie2.setId(2);
        movie2.setName("Inception");
        movie2.setDurationInMin(148);

        movieController.addMovie(movie,City.Bangalore);
        movieController.addMovie(movie2,City.Mumbai);

            
    }
    public void createTheatres(){
        Theatre theatre1 = new Theatre();
        theatre1.setId(1);
        theatre1.setAddress("Gandhi Chowk");
        theatre1.setCity(City.Bangalore);

         Theatre theatre2 = new Theatre();
        theatre1.setId(2);
        theatre1.setAddress("Golambar");
        theatre1.setCity(City.Mumbai);
        theatreController.addTheatre(City.Mumbai,theatre2);
        theatreController.addTheatre(City.Bangalore, theatre1);
        theatreController.addTheatre(City.Mumbai, theatre2);
    }

}
