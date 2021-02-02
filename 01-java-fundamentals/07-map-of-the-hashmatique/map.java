import java.util.HashMap;

public class map {
    public static void Challange() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Show me some love", "Kisses and hugs");
        map.put("Im real discreet", "Like a thief in the night");
        map.put("Sometimes we laugh", "and Sometimes we cry");
        map.put("I just need sometime", "and a place to come to");

        String val = map.get("Dog Day");

        for (String key : map.keySet()) {
            System.out.println(String.format("Track: %s: Lyrics: %s", key, map.get(key)));
        }


    }
}