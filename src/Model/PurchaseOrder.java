package Model;

public class PurchaseOrder {
    private String productName;
    private String supplierName;
    private int quantity;
    private double totalCost;
    private String status;

    public void setPurchaseOrder(String productName, String supplierName, int quantity, double totalCost, String status) {
        this.productName = productName;
        this.supplierName = supplierName;
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity should be a positive number");
            return;
        }
        if (totalCost > 0) {
            this.totalCost = totalCost;
        } else {
            System.out.println("Total cost should be a positive number");
            return;
        }
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getStatus() {
        return status;
    }
}
