package lk.ijse.dinemore.common.dto;

public class ChefDTO {

    private String chefID;
    private String chefName;
    private String chefTel;
    private int chefMadeQty;

    public ChefDTO(String chefID, String chefName, String chefTel, int chefMadeQty) {
        this.chefID = chefID;
        this.chefName = chefName;
        this.chefTel = chefTel;
        this.chefMadeQty = chefMadeQty;
    }

    public ChefDTO() {
    }

    public String getChefID() {
        return chefID;
    }

    public void setChefID(String chefID) {
        this.chefID = chefID;
    }

    public String getChefName() {
        return chefName;
    }

    public void setChefName(String chefName) {
        this.chefName = chefName;
    }

    public String getChefTel() {
        return chefTel;
    }

    public void setChefTel(String chefTel) {
        this.chefTel = chefTel;
    }

    public int getChefMadeQty() {
        return chefMadeQty;
    }

    public void setChefMadeQty(int chefMadeQty) {
        this.chefMadeQty = chefMadeQty;
    }
}
