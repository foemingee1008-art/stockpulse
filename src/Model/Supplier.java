package Model;

public class Supplier {
    private String supplierID;
    private String supplierName;
    public String contact;

    public void setSupplier(String supplierID, String supplierName, String contact) {
        if (supplierID.length() == 8) {
            this.supplierID = supplierID;
        } else {
            System.out.println("Invalid supplier ID");
            return;
        }
        this.supplierName = supplierName;
        boolean validContact = true;
        for (int i = 0; i < contact.length(); i++) {
            if (contact.charAt(i) > '9' || contact.charAt(i) < '0') {
                validContact = false;
            }
        }
        if (contact.length() >= 10 && contact.length() <= 11 && validContact) {
            this.contact = contact;
        } else {
            System.out.println("Invalid contact number");
        }
    }

    public String getSupplierID() { return this.supplierID; }

    public String getSupplierName() { return  this.supplierName; }

    public String getContact() { return contact; }
}
