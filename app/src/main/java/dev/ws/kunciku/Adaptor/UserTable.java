package dev.ws.kunciku.Adaptor;

/**
 * Created by Wawan on 5/4/2019
 */
public class UserTable {
    private String uName;
    private String uNumber;
    private String uMail;

    public UserTable(String uName, String uNumber, String uMail) {
        this.uName = uName;
        this.uNumber = uNumber;
        this.uMail = uMail;
    }

    public UserTable(){

    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuNumber() {
        return uNumber;
    }

    public void setuNumber(String uNumber) {
        this.uNumber = uNumber;
    }

    public String getuMail() {
        return uMail;
    }

    public void setuMail(String uMail) {
        this.uMail = uMail;
    }


}
