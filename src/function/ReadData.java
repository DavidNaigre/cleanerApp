package function;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadData {

    public static ArrayList<Tweet> read(List<String> pathList) {
        ArrayList<Tweet> data = new ArrayList<>();
        String[] HEADERS = {"created_at","tweet_id","tweet","likes","retweet_count","source","user_id","user_name","user_screen_name","user_description","user_join_date","user_followers_count","user_location","lat","long","city","country","continent","state","state_code","collected_at","from_csv"};
        try {
            for ( String path: pathList ) {
                String from = path.contains("biden") ? "biden_csv": "trump_csv";
                Reader in = new FileReader(path);
                Iterable<CSVRecord> records = CSVFormat.DEFAULT
                        .withHeader(HEADERS)
                        .withFirstRecordAsHeader()
                        .parse(in);
                int i = 0, t=0, count=0;
                for (CSVRecord record : records) {
                    if(t > 0){
                        if (record.size() == 21) {
                            data.add(new Tweet(record.get("created_at"), record.get("tweet_id"), record.get("tweet"), record.get("likes"), record.get("retweet_count"), record.get("source"), record.get("user_id"), record.get("user_name"), record.get("user_screen_name"), record.get("user_description"), record.get("user_join_date"), record.get("user_followers_count"), record.get("user_location"), record.get("lat"), record.get("long"), record.get("city"), record.get("country"), record.get("continent"), record.get("state"), record.get("state_code"), record.get("collected_at"), from));
                            count++;
                        } else i++;
                    }
                    t++;
                }
                System.out.println("\nFrom:"+from+"\n>Total: "+t +"\t imported: "+count+ "\terror: "+i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
