package function;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class WriteData {
    private final static String[] HEADERS = {"created_at","tweet_id","tweet","likes","retweet_count","source","user_id","user_name","user_screen_name","user_description","user_join_date","user_followers_count","user_location","lat","long","city","country","continent","state","state_code","collected_at"};
    private static String[] colums = {"Date", "NbWords", "NbUsers", "Percent_?", "Percent_! ", "Percent_RIP", "Percent_H", "Percent_URL"};
    private static String[] colums2 = {"Date", "NbWords", "NbUsers", "Percent_?", "Percent_! ", "Nb_Hastags", "Percent_URL", "Percent_Energy"};

    public static void write(List<String> data, String path, int selector) throws IOException {

        try (PrintWriter writer = new PrintWriter(new File(path))){
            StringBuilder sb = new StringBuilder();

            if(selector < 2){
                for(String index : colums){
                    sb.append(index);
                    sb.append("\t");
                }
            }
            else{
                for(String index : colums2) {
                    sb.append(index);
                    sb.append("\t");
                }
            }

            for(String singledata : data){
                sb.append("\n"+singledata);
            }

            writer.write(sb.toString());
            System.out.println("\n\nVous trouverez l'analyse dans: " + path);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}

