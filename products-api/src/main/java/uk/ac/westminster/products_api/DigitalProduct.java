package uk.ac.westminster.products_api;
//Digital Product IS A Product
public class DigitalProduct  extends Product{
    private String downloadUrl;
    private double fileSizeMB;
    public DigitalProduct() {
        //super();
    }
    public DigitalProduct(Long id, String name, double price, String downloadUrl, double fileSizeMB) {
        super(id, name, price); // MUST be the first statement.IF THERE IS A "NO ARG CONSTRUCTOR" IT WILL CALL SUPER AUTOMATICALLY
        //super();
        this.downloadUrl = downloadUrl; this.fileSizeMB = fileSizeMB; }
    public String getDownloadUrl() {
        return downloadUrl;
    }
    public double getFileSizeMB() {
        return fileSizeMB;
    }
}
