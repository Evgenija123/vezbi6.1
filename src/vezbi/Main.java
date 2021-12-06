package vezbi;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        List<String> footballClubs = new ArrayList<String>();
        footballClubs.add("Manchester U");
            footballClubs.add("Manchester C");
        footballClubs.add("Real Madrid");

        footballClubs.remove(1);

        System.out.println("Goleminata na listata e:  " + footballClubs.size());

    }
}