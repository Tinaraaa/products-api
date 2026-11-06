package uk.ac.westminster.products_api;
//Digital Product IS A Product
public class DigitalProduct  extends Product implements Discountable{
    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;
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
    @Override
    public String getSummary(){
        return "Digital: " +getName()+" |Download: "+downloadUrl;
    }

    @Override
    public void applyDiscount(double rate){
        this.discountedPrice = getPrice() * (1-rate);
    }
    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }





}
