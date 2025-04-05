package Flyweight_Pattern;

import java.util.ArrayList;
import java.util.List;

public class DemoFlyweight {
    public static void main(String[] args) {
        List<LocationMarker> map = new ArrayList<>();

        map.add(new LocationMarker("Hospital #1", 123, -654, MarkerStyleFactory.getMarkerStyle("hospital")));
        map.add(new LocationMarker("Hotel #1", 9631, 13, MarkerStyleFactory.getMarkerStyle("hotel")));
        map.add(new LocationMarker("Museum #1", 201, 8, MarkerStyleFactory.getMarkerStyle("museum")));
        map.add(new LocationMarker("Hotel #2", 547, -41, MarkerStyleFactory.getMarkerStyle("hotel")));
        map.add(new LocationMarker("Hotel #3", -96, 13, MarkerStyleFactory.getMarkerStyle("hotel")));
        map.add(new LocationMarker("Restaurant #1", 4538, 87, MarkerStyleFactory.getMarkerStyle("restaurant")));
        map.add(new LocationMarker("Shop #1", -637, 9, MarkerStyleFactory.getMarkerStyle("shop")));
        map.add(new LocationMarker("Restaurant #2", -58, -115, MarkerStyleFactory.getMarkerStyle("restaurant")));

        for (LocationMarker marker : map) {
            marker.render();
        }

        System.out.println("\nTotal styles created: " + MarkerStyleFactory.getStyleCount());
        System.out.println("Total markers: " + map.size());
    }
}
