package Flyweight_Pattern;

public class SharedMarkerStyle implements MarkerStyle {
    private final String icon;
    private final String color;
    private final String labelStyle;

    public SharedMarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    @Override
    public void render(String name, int x, int y) {
        System.out.println("Rendering " + name + " at " + x + ", " + y + " with icon=" + icon + ", color=" + color + " and labelStyle=" + labelStyle);
    }
}
