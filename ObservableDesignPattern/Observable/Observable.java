package ObservableDesignPattern.Observable;

import ObservableDesignPattern.Observer.Observer;

public interface Observable {
    void add(Observer obs);
    void remove(Observer obs);
    void notifySubs();
    void setData(int count);
    int getCount();

}
