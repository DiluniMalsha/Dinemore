package lk.ijse.dinemore.server.entity;

public class TelephoneOperator {

    private String tpID;
    private String tpName;
    private String tpTel;
    private String tpOrderQty;

    public TelephoneOperator(String tpID, String tpName, String tpTel, String tpOrderQty) {
        this.tpID = tpID;
        this.tpName = tpName;
        this.tpTel = tpTel;
        this.tpOrderQty = tpOrderQty;
    }

    public TelephoneOperator() {
    }

    public String getTpID() {
        return tpID;
    }

    public void setTpID(String tpID) {
        this.tpID = tpID;
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName;
    }

    public String getTpTel() {
        return tpTel;
    }

    public void setTpTel(String tpTel) {
        this.tpTel = tpTel;
    }

    public String getTpOrderQty() {
        return tpOrderQty;
    }

    public void setTpOrderQty(String tpOrderQty) {
        this.tpOrderQty = tpOrderQty;
    }
}
