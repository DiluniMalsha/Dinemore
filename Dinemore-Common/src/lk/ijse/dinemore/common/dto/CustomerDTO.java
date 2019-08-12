package lk.ijse.dinemore.common.dto;

public class CustomerDTO {

    private String customerID;
    private String customerName;
    private String customerTel;

    public CustomerDTO(String customerID, String customerName, String customerTel) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerTel = customerTel;
    }

    public CustomerDTO() {
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
