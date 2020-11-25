package function;

public class Tweet {
    private String created_at;
    private String tweet_id;
    private String tweet;
    private String likes;
    private String retweet_count;
    private String source;
    private String user_id;
    private String user_name;
    private String user_screen_name;
    private String user_description;
    private String user_join_date;
    private String user_followers_count;
    private String user_location;
    private String lat;
    private String lon;
    private String city;
    private String country;
    private String continent;
    private String state;
    private String state_code;
    private String collected_at;

    public Tweet(String created_at, String tweet_id, String tweet, String likes, String retweet_count, String source, String user_id, String user_name, String user_screen_name, String user_description, String user_join_date, String user_followers_count, String user_location, String lat, String lon, String city, String country, String continent, String state, String state_code, String collected_at) {
        this.created_at = created_at;
        this.tweet_id = tweet_id;
        this.tweet = tweet;
        this.likes = likes;
        this.retweet_count = retweet_count;
        this.source = source;
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_screen_name = user_screen_name;
        this.user_description = user_description;
        this.user_join_date = user_join_date;
        this.user_followers_count = user_followers_count;
        this.user_location = user_location;
        this.lat = lat;
        this.lon = lon;
        this.city = city;
        this.country = country;
        this.continent = continent;
        this.state = state;
        this.state_code = state_code;
        this.collected_at = collected_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(String tweet_id) {
        this.tweet_id = tweet_id;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getRetweet_count() {
        return retweet_count;
    }

    public void setRetweet_count(String retweet_count) {
        this.retweet_count = retweet_count;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_screen_name() {
        return user_screen_name;
    }

    public void setUser_screen_name(String user_screen_name) {
        this.user_screen_name = user_screen_name;
    }

    public String getUser_description() {
        return user_description;
    }

    public void setUser_description(String user_description) {
        this.user_description = user_description;
    }

    public String getUser_join_date() {
        return user_join_date;
    }

    public void setUser_join_date(String user_join_date) {
        this.user_join_date = user_join_date;
    }

    public String getUser_followers_count() {
        return user_followers_count;
    }

    public void setUser_followers_count(String user_followers_count) {
        this.user_followers_count = user_followers_count;
    }

    public String getUser_location() {
        return user_location;
    }

    public void setUser_location(String user_location) {
        this.user_location = user_location;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState_code() {
        return state_code;
    }

    public void setState_code(String state_code) {
        this.state_code = state_code;
    }

    public String getCollected_at() {
        return collected_at;
    }

    public void setCollected_at(String collected_at) {
        this.collected_at = collected_at;
    }
}
