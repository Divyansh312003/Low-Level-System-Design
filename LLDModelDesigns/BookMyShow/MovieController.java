package LLDModelDesigns.BookMyShow;
import java.util.*;
public class MovieController {
    Map<City,List<Movie>> movieMap;
    List<Movie> movies;
    public MovieController() {
        movieMap = new HashMap<>();
        movies = new ArrayList<>();
    }

    void addMovie(Movie movie, City city) {
        movies.add(movie);
       List<Movie> prevList= movieMap.get(city);
       prevList.add(movie);
       movieMap.put(city, prevList);
    }

    Movie getMovieByName(String name,City city){
       
        for(Movie movie:movieMap.get(city)){
            if(movie.getName().equals(name)){
                return movie;
            }
        }
        return null;
    }

}
