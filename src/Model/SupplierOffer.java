package Model;

public class SupplierOffer {
    private String offerID;
    private String supplierID;
    private String productID;
    private double unitCost;
    private int minOrder;
    private double deliveryFee;
    private int leadTimeDays;

    public void setSupplierOffer(String offerID, String supplierID, String productID, double unitCost, int minOrder, double deliveryFee, int leadTimeDays) {
        if (offerID.length() == 8) {
            this.offerID = offerID;
        } else {
            System.out.println("Invalid offer ID");
            return;
        }
        if (supplierID.length() == 8) {
            this.supplierID = supplierID;
        } else {
            System.out.println("Invalid supplier ID");
            return;
        }
        if (productID.length() == 8) {
            this.productID = productID;
        } else {
            System.out.println("Invalid product ID");
            return;
        }
        if (unitCost >= 0) {
            this.unitCost = unitCost;
        } else {
            System.out.println("Unit cost should be a positive number");
            return;
        }
        if (minOrder >= 0) {
            this.minOrder = minOrder;
        } else {
            System.out.println("Minimum order should be a positive number");
            return;
        }
        if (deliveryFee >= 0) {
            this.deliveryFee = deliveryFee;
        } else {
            System.out.println("Delivery fee should be a positive number");
            return;
        }
        if (leadTimeDays >= 0) {
            this.leadTimeDays = leadTimeDays;
        } else {
            System.out.println("Lead time days should be a positive number");
        }
    }

    public String getOfferID() {
        return offerID;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public String getProductID() {
        return productID;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public int getMinOrder() {
        return minOrder;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public int getLeadTimeDays() {
        return leadTimeDays;
    }
}

