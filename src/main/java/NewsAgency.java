import java.util.HashSet;

public class NewsAgency implements Subject, Observer{
    private final OlympicsWire wire;
    private final String agencyName;
    private final HashSet<Observer> observers = new HashSet<>();

    NewsAgency(String agencyName,OlympicsWire ow) {
        this.agencyName = agencyName;
        this.wire=ow;
        ow.registerObserver(this);
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

    @Override
    public void update(NewsItem n) {
        notifyObservers(n);
    }
}
