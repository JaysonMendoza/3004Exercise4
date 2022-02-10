import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {

	public static void main(String[] args) {
		OlympicsWire ow = new OlympicsWire();

		NewsAgency reuters = new NewsAgency("Reuters", ow);
		NewsAgency cp = new NewsAgency("Canadian Press", ow);
		NewsAgency ap = new NewsAgency("American Press", ow);

		TF1 tf1 = new TF1(new ArrayList<> (Arrays.asList(reuters)));
		CBC cbc = new CBC(new ArrayList<> (Arrays.asList(reuters, cp, ap)));
		CBS cbs = new CBS(new ArrayList<> (Arrays.asList(ap)));
		PBS pbs = new PBS(new ArrayList<> (Arrays.asList(ap)));

		ow.broadcast(new NewsItem("AM", "France", "slalom ski", "gold"));
		ow.broadcast(new NewsItem("AM", "Canada", "men hockey", "bronze"));
		ow.broadcast(new NewsItem("AM", "US", "team figure skating", "silver"));
		ow.broadcast(new NewsItem("AM", "Japan", "team figure skating", "bronze"));
 		ow.broadcast(new NewsItem("PM", "Canada", "women hockey", "silver"));
		ow.broadcast(new NewsItem("PM", "France", "snowboard", "silver"));
		ow.broadcast(new NewsItem("PM", "Japan", "men figure skating", "silver"));
		ow.broadcast(new NewsItem("PM", "US", "men figure skating", "gold"));
	
	}
}
