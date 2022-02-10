import java.util.HashSet;
import java.util.List;

public abstract class Channel implements Observer {
    protected HashSet<NewsAgency> subAgencies;
    private final String channelName;

    Channel(List<NewsAgency> agencies,String channelName) {
        subAgencies = new HashSet<>(agencies);
        this.channelName = channelName;
        for(NewsAgency agency : subAgencies) {
            agency.registerObserver(this);
        }
    }

    /**
     * This method receives any NewsItem updates from news agencies
     * and discriminates against a critera before broacasting
     * to subscribers.
     *
     * @param n A new NewsItem to be considered for broadcasting.
     */
    public void update(NewsItem n) {
        if(validate(n)) {
            broadcast(n);
        }
    }

    /**
     * Default method provided is a tautology.
     *
     * Subclasses can override this method to
     * implement a validation sequence.
     * @param n A news Item that will be validated against a criteria.
     * @return true if the NewsItem passes validation, false otherwise.
     */
    public boolean validate(NewsItem n) {
        return true;
    }

    /**
     * Broadcasts a new NewsItem to subscribers.
     * @param n The news Item to be brodcast.
     */
    public void broadcast(NewsItem n) {
        System.out.println(channelName + " reports "+n);
    }


}

