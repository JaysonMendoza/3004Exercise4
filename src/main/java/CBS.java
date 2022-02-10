import java.util.List;

public class CBS extends Channel {
    CBS(List<NewsAgency> agencies) {
        super(agencies,"CBS");
    }

    @Override
    public boolean validate(NewsItem n) {
        return n.country.compareToIgnoreCase("US")==0;
    }

}
