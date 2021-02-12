package function;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class WriteData {
    private final static String[] HEADERS = {"created_at","tweet_id","tweet","likes","retweet_count","source","user_id","user_name","user_screen_name","user_description","user_join_date","user_followers_count","user_location","lat","long","city","country","continent","state","state_code","collected_at","ORIGIN","sexe","polarity","subjectivity"};

    public static void write(ArrayList<Tweet> data) {
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/result/tweet_data.csv"));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(HEADERS).withEscape('\\'));
            for ( Tweet tweet : data ) {
                csvPrinter.printRecord(
                            tweet.getCreated_at(),
                            tweet.getTweet_id(),
                            tweet.getTweet(),
                            tweet.getLikes(),
                            tweet.getRetweet_count(),
                            tweet.getSource(),
                            tweet.getUser_id(),
                            tweet.getUser_name(),
                            tweet.getUser_screen_name(),
                            tweet.getUser_description(),
                            tweet.getUser_join_date(),
                            tweet.getUser_followers_count(),
                            tweet.getUser_location(),
                            tweet.getLat(),
                            tweet.getLon(),
                            tweet.getCity(),
                            tweet.getCountry(),
                            tweet.getContinent(),
                            tweet.getState(),
                            tweet.getState_code(),
                            tweet.getCollected_at(),
                            tweet.getFrom(),
                            "",
                            "",
                            "");
            }
            csvPrinter.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void write(ArrayList<Tweet> data, int target) {
        try {
            String from = target == 0 ? "biden_": "trump_";
            BufferedWriter writer = Files.newBufferedWriter(Paths.get("src/result/tweet_"+from+"data.csv"));
            CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(HEADERS).withEscape('\\'));
            for ( Tweet tweet : data ) {
                csvPrinter.printRecord(
                            tweet.getCreated_at(),
                            tweet.getTweet_id(),
                            tweet.getTweet(),
                            tweet.getLikes(),
                            tweet.getRetweet_count(),
                            tweet.getSource(),
                            tweet.getUser_id(),
                            tweet.getUser_name(),
                            tweet.getUser_screen_name(),
                            tweet.getUser_description(),
                            tweet.getUser_join_date(),
                            tweet.getUser_followers_count(),
                            tweet.getUser_location(),
                            tweet.getLat(),
                            tweet.getLon(),
                            tweet.getCity(),
                            tweet.getCountry(),
                            tweet.getContinent(),
                            tweet.getState(),
                            tweet.getState_code(),
                            tweet.getCollected_at(),
                            tweet.getFrom(),
                            "",
                            "",
                            "");
            }
            csvPrinter.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

