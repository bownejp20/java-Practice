package inventory;

public class Product{
    int productId;
    String productName;
    double price;
    public Product(int productId, String productName, double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }
    public int getProductId(){
     return this.productId;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }
    public String getProductName(){
        return this.productName;
    }
    public void setProductName(String productName){
        this.productName = productName;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
