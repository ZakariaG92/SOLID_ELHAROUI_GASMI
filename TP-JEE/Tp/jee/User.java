package Tp.jee;



public class User {

    String username ;
    String password;
    String email ;
    String nom;
    String prenom;
    String ip;



    private String address;
    

    private String invoiceAddr;
    

    private Integer phone;
    

    private String fonction;
    
    
    

    public String getAddress() {
        return this.address;
    }
    

    public void setAddress(String address) {
        this.address = address;
    }
    

    public String getInvoiceAddr() {
        return this.invoiceAddr;
    }
    

    public void setInvoiceAddr(String invoiceAddr) {
        this.invoiceAddr = invoiceAddr;
    }
    

    public Integer getPhone() {
        return this.phone;
    }
    

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
    

    public String getFonction() {
        return this.fonction;
    }
    

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }


    public String getToken() {

        return  "tokenExample";
    }
    
}
