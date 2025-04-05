package Flyweight_Pattern;

import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getMarkerStyle(String type) {
        if (!styles.containsKey(type)) {
            switch (type) {
                case "hospital": styles.put(type, new SharedMarkerStyle("\uD83C\uDFE5", "red", "normal"));
                break;
                case "shop": styles.put(type, new SharedMarkerStyle("\uD83D\uDECD\uFE0F", "blue", "underline"));
                break;
                case "hotel": styles.put(type, new SharedMarkerStyle("\uD83C\uDFE8", "green", "italic"));
                break;
                case "restaurant": styles.put(type, new SharedMarkerStyle("\uD83C\uDF7D\uFE0F", "yellow", "bold"));
                break;
                case "museum": styles.put(type, new SharedMarkerStyle("\uD83C\uDFDB\uFE0F", "green", "uppercase"));
                break;
            }
        }
        return styles.get(type);
    }

    public static int getStyleCount() {
        return styles.size();
    }
}
