package Flyweight_Pattern;

public class LocationMarker {
    private final String name;
    private final int x;
    private final int y;
    private final MarkerStyle markerStyle;

    public LocationMarker(String name, int x, int y, MarkerStyle markerStyle) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.markerStyle = markerStyle;
    }

    public void render() {
        markerStyle.render(name, x, y);
    }
}
