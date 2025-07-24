package LLDModelDesigns.BookMyShow;

public class Movie {
    int id;
    String name;
    int durationInMin;
    public void setId(int id){
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMin() {
        return durationInMin;
    }

    public void setDurationInMin(int durationInMin) {
        this.durationInMin = durationInMin;
    }


}
