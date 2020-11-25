package function;

import java.util.ArrayList;

public class Analyse {
    public static ArrayList<Tweet> Analyse(ArrayList<Tweet> tweetList){
        tweetList.removeIf(tweet -> tweet.getCountry().equals("") || tweet.getState().equals(""));
        return tweetList;
    }
}
