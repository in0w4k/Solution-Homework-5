package Proxy_Pattern;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Display thumbnail - " + fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("Display image - " + fileName);
    }
}
