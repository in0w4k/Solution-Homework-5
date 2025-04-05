package Proxy_Pattern;

public class DemoProxyPattern {
    public static void main(String[] args) {
        Image image = new ProxyImage("building.png");

        image.displayThumbnail();
        System.out.println("_-_-_-_-_-_-_");
        image.displayImage();
    }
}
