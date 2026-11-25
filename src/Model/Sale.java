package Model;

import java.time.LocalDate;

public class Sale {
    private String saleID;
    private String productID;
    private int quantitySold;
    private double unitPrice;
    private LocalDate saleDate;

    public void getSale(String saleID, String productID, int quantitySold, double unitPrice, LocalDate saleDate) {
        if (saleID.length() == 8) {
            this.saleID = saleID;
        } else {
            System.out.println("Invalid sale ID");
            return;
        }
        if (productID.length() == 8) {
            this.productID = productID;
        } else {
            System.out.println("Invalid product ID");
            return;
        }
        if (quantitySold >= 0) {
            this.quantitySold = quantitySold;
        } else {
            System.out.println("Quantity should be a positive number");
            return;
        }
        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
        } else {
            System.out.println("Unit price should be a positive number");
            return;
        }
        this.saleDate = saleDate;
    }

    public String getSaleID() { return this.saleID; }

    public String getProductID() { return this.productID; }

    public int getQuantitySold() { return this.quantitySold; }

    public double getUnitPrice() { return this.unitPrice; }

    public LocalDate getSaleDate() { return this.saleDate; }
}
