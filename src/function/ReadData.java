package function;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;

public class ReadData {

    public static ArrayList<Tweet> read(String path) {
        ArrayList<Tweet> data = new ArrayList<>();
        String[] HEADERS = {"created_at","tweet_id","tweet","likes","retweet_count","source","user_id","user_name","user_screen_name","user_description","user_join_date","user_followers_count","user_location","lat","long","city","country","continent","state","state_code","collected_at"};
        try {
            Reader in = new FileReader(path);
            Iterable<CSVRecord> records = CSVFormat.DEFAULT
                    .withHeader(HEADERS)
                    .withFirstRecordAsHeader()
                    .parse(in);
            int i = 0, t=0;
            for (CSVRecord record : records) {
                if(record.size() == 21) {
                    data.add(new Tweet(record.get("created_at"),record.get("tweet_id"),record.get("tweet"),record.get("likes"),record.get("retweet_count"),record.get("source"),record.get("user_id"),record.get("user_name"),record.get("user_screen_name"),record.get("user_description"),record.get("user_join_date"),record.get("user_followers_count"),record.get("user_location"),record.get("lat"),record.get("long"),record.get("city"),record.get("country"),record.get("continent"),record.get("state"),record.get("state_code"),record.get("collected_at")));
                } else i++;
                t++;
            }
            System.out.println("\n>Total: "+t +"\t imported: "+data.size()+ "\terror: "+i);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
