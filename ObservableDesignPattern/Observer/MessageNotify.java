package ObservableDesignPattern.Observer;

import ObservableDesignPattern.Observable.Observable;

public class MessageNotify implements Observer{
     Observable obj;
    String phoneNum;
    //constructor injection
    public MessageNotify(Observable ob,String phone){
        this.obj=ob;
        this.phoneNum=phone;
    }

    @Override
    public void update() {
       sendMail(phoneNum,"Message send on number "+phoneNum);
        
    }

    public void sendMail(String email,String content){
        System.out.println(content);
    }
}
