package LLDModelDesigns.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    int id;
    String address;
    City city;
    List<Screen> screens=new ArrayList<>();
    List<Show> shows=new ArrayList<>();
    int getId() {
        return id;
    } 
    void setId(int id) {
        this.id = id;
    }          
    String getAddress() {
        return address;
    }
    void setAddress(String address) {
        this.address = address;
    }
    City getCity() {
        return city;
    }
    void setCity(City city) {
        this.city = city;
    }
    List<Screen> getScreens() {
        return screens;
    }  
    void setScreens(List<Screen> screens) {
        this.screens = screens;
    }  
    List<Show> getShows() {
        return shows;
    }  
    void setShows(List<Show> shows) {
        this.shows = shows;
    }
    
    
}
