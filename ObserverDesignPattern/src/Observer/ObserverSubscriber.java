package Observer;

import Observable.IObservablePublisher;

public class ObserverSubscriber implements  IObserverSubscriber{

    String emailId;
    IObservablePublisher observalble;

    public ObserverSubscriber(String emailId, IObservablePublisher observable){
        this.emailId = emailId;
        this.observalble = observable;
    }

    @Override
    public void update() {

        sendMail(emailId);
    }

    public void sendMail(String emailId){
        System.out.println("This new article has been send to "+ emailId);
    }
}
