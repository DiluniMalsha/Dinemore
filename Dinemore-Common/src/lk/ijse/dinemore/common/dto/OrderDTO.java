package lk.ijse.dinemore.common.dto;

import java.io.Serializable;

public class OrderDTO implements Serializable{

    private String orderID;        
    private String customerName;
    private String customerTel;    
    private String date;
    private String status;
    private int qty;
    private String addedTime;
    private String takenTime;
    private String finishedTime;
    private String tpID;
    private String chefID;

    public OrderDTO(String orderID, String customerName, String customerTel, String date, String status, int qty, String addedTime, String takenTime, String finishedTime, String tpID, String chefID) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.customerTel = customerTel;
        this.date = date;
        this.status = status;
        this.qty = qty;
        this.addedTime = addedTime;
        this.takenTime = takenTime;
        this.finishedTime = finishedTime;
        this.tpID = tpID;
        this.chefID = chefID;
    }

    public OrderDTO() {
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(String addedTime) {
        this.addedTime = addedTime;
    }

    public String getTakenTime() {
        return takenTime;
    }

    public void setTakenTime(String takenTime) {
        this.takenTime = takenTime;
    }

    public String getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(String finishedTime) {
        this.finishedTime = finishedTime;
    }

    public String getTpID() {
        return tpID;
    }

    public void setTpID(String tpID) {
        this.tpID = tpID;
    }

    public String getChefID() {
        return chefID;
    }

    public void setChefID(String chefID) {
        this.chefID = chefID;
    }
    
    }
