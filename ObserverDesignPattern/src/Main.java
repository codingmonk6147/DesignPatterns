import Observable.ObservablePublisher;
import Observer.ObserverSubscriber;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        ObservablePublisher publisher = new ObservablePublisher();

        ObserverSubscriber observer1 = new ObserverSubscriber("xyz@gmail.com",publisher);

        ObserverSubscriber observer2 = new ObserverSubscriber("abc@gmail.com",publisher);
//Two observers
       publisher.subscribe(observer1);
       publisher.subscribe(observer2);
//Update in observable triggers notification
       publisher.mainLogic("New Article");

//One observer is removed
       publisher.unsubscribe(observer1);
//Changed to see the output
       publisher.mainLogic("New arti");
        publisher.mainLogic("New Article");
        }
    }
