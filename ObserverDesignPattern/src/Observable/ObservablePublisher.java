package Observable;

import Observer.IObserverSubscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObservablePublisher implements  IObservablePublisher{

  List<IObserverSubscriber> observersList = new ArrayList<>();
    @Override
    public void subscribe(IObserverSubscriber observer) {
            observersList.add(observer);
    }

    @Override
    public void unsubscribe(IObserverSubscriber observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
                for(IObserverSubscriber obs : observersList){
                    obs.update();
                }
    }

    @Override
    public void mainLogic(String statement) {
        System.out.println("This is Business Logic");
        if(Objects.equals(statement, "New Article")){
            notifySubscribers();
        }


    }
}
