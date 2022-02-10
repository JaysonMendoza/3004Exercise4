import java.util.List;

public class CBC extends Channel {
    CBC(List<NewsAgency> agencies) {
        super(agencies,"CBC");
    }

    @Override
    public boolean validate(NewsItem n) {
        return super.validate(n);
    }

}
