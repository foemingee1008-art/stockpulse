package Model;

import java.time.LocalDate;

public class stockBatch {
    private String batchID;
    private String productID;
    private int quantity;
    private LocalDate expiredDate;
    private LocalDate receivedDate;

    public void setStockBatch(String batchID, String productID, int quantity, LocalDate expiredDate, LocalDate receivedDate) {
        if (batchID.length() == 8) {
            this.batchID = batchID;
        } else {
            System.out.println("Invalid batch ID");
            return;
        }
        if (productID.length() == 8) {
            this.productID = productID;
        } else {
            System.out.println("Invalid product ID");
            return;
        }
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity should be a positive number");
            return;
        }
        this.expiredDate = expiredDate;
        this.receivedDate = receivedDate;
    }

    public String getBatchID() { return this.batchID; }

    public String getProductID() { return this.productID; }

    public int getQuantity() { return this.quantity; }

    public LocalDate getExpiredDate() { return this.expiredDate; }

    public LocalDate getReceivedDate() { return this.receivedDate; }
}
