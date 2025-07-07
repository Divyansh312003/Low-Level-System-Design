package ObservableDesignPattern;

import ObservableDesignPattern.Observable.IphoneObservable;
import ObservableDesignPattern.Observable.Observable;
import ObservableDesignPattern.Observer.EmailNotify;
import ObservableDesignPattern.Observer.MessageNotify;
import ObservableDesignPattern.Observer.Observer;

public class Main {
    public static void main(String[] args) {
       Observable obj=new IphoneObservable();

       Observer obj1=new EmailNotify(obj,"xyz@gmail.com");
       Observer obj2=new MessageNotify(obj,"1234567890");
       obj.add(obj1);
       obj.add(obj2);
       obj.setData(10);
    }
}
