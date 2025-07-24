package LLDModelDesigns.BookMyShow;
import java.util.*;
public class TheatreController {
    Map<City, List<Theatre>> threatreMap = new HashMap<>();
    List<Theatre> allTheatres=new ArrayList<>();
    void addTheatre(City city, Theatre theatre) {
        threatreMap.putIfAbsent(city, new ArrayList<>());
        threatreMap.get(city).add(theatre);
        allTheatres.add(theatre);
    }

    List<Theatre> getTheatresByCity(City city) {
        return threatreMap.getOrDefault(city, new ArrayList<>());
    }
    
}
