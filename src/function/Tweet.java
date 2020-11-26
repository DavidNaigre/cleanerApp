package function;

public class Tweet {
    private final String created_at;
    private final String tweet_id;
    private final String tweet;
    private final String likes;
    private final String retweet_count;
    private final String source;
    private final String user_id;
    private final String user_name;
    private final String user_screen_name;
    private final String user_description;
    private final String user_join_date;
    private final String user_followers_count;
    private final String user_location;
    private final String lat;
    private final String lon;
    private final String city;
    private final String country;
    private final String continent;
    private final String state;
    private final String state_code;
    private final String collected_at;
    private final String from;

    public Tweet(String created_at, String tweet_id, String tweet, String likes, String retweet_count, String source, String user_id, String user_name, String user_screen_name, String user_description, String user_join_date, String user_followers_count, String user_location, String lat, String lon, String city, String country, String continent, String state, String state_code, String collected_at, String from) {
        this.created_at = created_at;
        this.tweet_id = tweet_id;
        this.tweet = tweet.replaceAll("\\s+|,|\""," ");
        this.likes = likes;
        this.retweet_count = retweet_count;
        this.source = source.replaceAll("\\s+|,|\""," ");
        this.user_id = user_id;
        this.user_name = user_name.replaceAll("\\s+|,|\""," ");
        this.user_screen_name = user_screen_name.replaceAll("\\s+|,|\""," ");
        this.user_description = user_description.replaceAll("\\s+|,|\""," ");
        this.user_join_date = user_join_date;
        this.user_followers_count = user_followers_count;
        this.user_location = user_location.replaceAll("\\s+|,|\""," ");
        this.lat = lat;
        this.lon = lon;
        this.city = city.replaceAll("\\s+|,|\""," ");
        this.country = country.replaceAll("\\s+|,|\""," ");
        this.continent = continent.replaceAll("\\s+|,|\""," ");
        this.state = state.replaceAll("\\s+|,|\""," ");
        this.state_code = state_code;
        this.collected_at = collected_at.replaceAll("\\s+|,|\""," ");
        this.from = from;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getTweet_id() {
        return tweet_id;
    }

    public String getTweet() {
        return tweet;
    }

    public String getLikes() {
        return likes;
    }

    public String getRetweet_count() {
        return retweet_count;
    }

    public String getSource() {
        return source;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_screen_name() {
        return user_screen_name;
    }

    public String getUser_description() {
        return user_description;
    }

    public String getUser_join_date() {
        return user_join_date;
    }

    public String getUser_followers_count() {
        return user_followers_count;
    }

    public String getUser_location() {
        return user_location;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getContinent() {
        return continent;
    }

    public String getState_code() {
        return state_code;
    }

    public String getCollected_at() {
        return collected_at;
    }

    public String getFrom() {
        return from;
    }
}
