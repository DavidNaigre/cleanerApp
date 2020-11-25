import function.Tweet;

import static function.ReadData.read;
import static function.formatTime.formatTime;
import static function.WriteData.write;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {
    private final static List<String> pathList = new ArrayList<>(Arrays.asList("src/data/hashtag_joebiden.csv", "src/data/hashtag_donaldtrump.csv"));

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("\n> Traitement a démarré");
        ArrayList<Tweet> data = read(pathList.get(0));
        long end_read = System.currentTimeMillis();
        String log = '['+"fichier analysée: "+pathList.get(0)+" || \timportations en: "+ formatTime(end_read-start)+" || \ttraité en: "+formatTime(end_read-start)+"]";
        System.out.println(log);
    }
}
