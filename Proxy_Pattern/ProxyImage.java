package Proxy_Pattern;

public class ProxyImage implements Image {
    private final String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        this.realImage = null;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Display thumbnail - " + fileName);
    }

    @Override
    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }
}
