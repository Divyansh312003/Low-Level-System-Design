package ObservableDesignPattern.Observable;

import java.util.ArrayList;
import java.util.List;

import ObservableDesignPattern.Observer.Observer;

public class IphoneObservable implements Observable{
    List<Observer> list=new ArrayList<>();
    int stock=0;

    @Override
    public void add(Observer obs) {
        list.add(obs);
        
    }

    @Override
    public void remove(Observer obs) {
        list.remove(obs);
    }

    @Override
    public void notifySubs() {
        for(Observer ob:list) ob.update();
    }

    @Override
    public void setData(int count) {
        if(stock==0){
            notifySubs();
        }
        stock+=count;
    }

    @Override
    public int getCount() {
        return stock;
    }
    
}
