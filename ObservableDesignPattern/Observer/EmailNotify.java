package ObservableDesignPattern.Observer;

import ObservableDesignPattern.Observable.Observable;

public class EmailNotify implements Observer {
    Observable obj;
    String email;
    //constructor injection
    public EmailNotify(Observable ob,String e){
        this.obj=ob;
        this.email=e;
    }

    @Override
    public void update() {
       sendMail(email,"Mail send on email"+email);
        
    }

    public void sendMail(String email,String content){
        System.out.println(content);
    }
    
}
