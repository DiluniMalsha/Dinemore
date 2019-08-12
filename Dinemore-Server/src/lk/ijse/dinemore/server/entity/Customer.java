package lk.ijse.dinemore.server.entity;

public class Customer {

    private String customerID;
    private String customerName;
    private String customerTel;

    public Customer(String customerID, String customerName, String customerTel) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerTel = customerTel;
    }

    public Customer() {
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }
}
