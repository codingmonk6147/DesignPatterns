package Observable;

import Observer.IObserverSubscriber;

import java.util.List;

public interface IObservablePublisher {



    public void subscribe(IObserverSubscriber observer);
    public void unsubscribe(IObserverSubscriber observer);

    public void notifySubscribers();

    public void mainLogic(String statement);

}
