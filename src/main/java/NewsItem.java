
public class NewsItem {

	public String time;
	public String country;
	public String sport;
	public String medal;

	public NewsItem(String t, String c, String s, String m) {
		time = t;
		country = c;
		sport = s; 
		medal = m;
	}

	public String toString() {
		String s = " Time " + time + " Country " + country +
			   " Sport " + sport + "Medal " + medal;
		return s;
	}
}
