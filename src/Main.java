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
        System.out.println(">Traitement a démarré");
        ArrayList<Tweet> data = read(pathList);
        long end_read = System.currentTimeMillis();
        data = Analyse(data);
        long end = System.currentTimeMillis();
        long countBiden = data.stream().filter(tweet -> tweet.getFrom().contains("biden")).count();
        long countTrump =  data.size() - countBiden;
        System.out.println("\n>Total final: "+data.size()+"\n\tfrom biden: "+countBiden+"\n\tfrom trump: "+countTrump);
        write(data);
        String log = "\n[importations en: "+ formatTime(end_read-start)+" || \ttraité en: "+formatTime(end-start)+"]";
        System.out.println(log);
    }
}
