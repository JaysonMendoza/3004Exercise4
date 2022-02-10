
import java.util.List;

public class TF1 extends Channel {
    TF1(List<NewsAgency> agencies) {
        super(agencies,"TF1");
    }

    @Override
    public boolean validate(NewsItem n) {
        return n.country.compareToIgnoreCase("France")==0;
    }
}
