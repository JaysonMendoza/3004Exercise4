import java.util.HashSet;

public class OlympicsWire implements Subject {
    private final HashSet<Observer> observers = new HashSet<>();

    OlympicsWire() {
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(NewsItem n) {
        /*
        We will take simple case and copy the observer before
        iterating over the dataset to avoid concurrency issues
        when a user changes subscription status while we iterate.

        Alternatively we could have implemented thread safety but
        this would require significantly more changes.
        */
        HashSet<Observer> tmp = new HashSet<>(observers);
        for(Observer o : tmp)
        {
            o.update(n);
        }
    }

    public void broadcast(NewsItem o) {
        System.out.println("New Olympic News Item!!");
        notifyObservers(o);
    }
}
