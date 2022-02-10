import java.util.List;

public class PBS extends Channel {
    boolean isActive;
    PBS(List<NewsAgency> agencies) {
        super(agencies,"PBS");
        isActive = true;
    }

    @Override
    public boolean validate(NewsItem n) {
        if(isActive && n.time.compareToIgnoreCase("AM")!=0)
        {
            isActive=false;
            for(NewsAgency agency : subAgencies)
            {
                agency.removeObserver(this);
            }
        }
        return isActive;
    }
}
