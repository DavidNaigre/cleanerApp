import function.Tweet;

import static function.Analyse.Analyse;
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
        data = Analyse(data);
        long end = System.currentTimeMillis();
        System.out.println(">Total final: "+data.size());
        String log = "\n>[fichier analysée: "+pathList.get(0)+" || \timportations en: "+ formatTime(end_read-start)+" || \ttraité en: "+formatTime(end-start)+"]";
        System.out.println(log);
    }
}
