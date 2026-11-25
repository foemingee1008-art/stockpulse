package Model;

public class Product {
    private String productID;
    private String productName;
    private String category;
    private double sellingPrice;
    private int minStock;

    public void setProduct (String productID, String productName, String category, double sellingPrice, int minStock) {
        if (productID.length() == 4) {
            this.productID = productID;
        } else {
            System.out.println("Invalid product ID");
            return;
        }
        this.productName = productName;
        this.category = category;
        if (sellingPrice > 0) {
            this.sellingPrice = sellingPrice;
        } else {
            System.out.println("Selling price should be a positive number");
            return;
        }
        if (minStock >= 0) {
            this.minStock = minStock;
        } else {
            System.out.println("minStock cannot be a negative value");
        }
    }

    public String getProductID () { return this.productID; }

    public String getProductName() { return this.productName; }

    public String getCategory() { return category; }

    public double getSellingPrice() { return sellingPrice; }

    public int getMinStock() { return minStock; }
}
