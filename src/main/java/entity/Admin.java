package entity;

import base.LoginInformation;

public class Admin extends Person implements LoginInformation {

    private String username;
    private String password;

    public Admin(String firstname, String lastname, String nationalCode, String phoneNumber, String username, String password) {
        super(firstname, lastname, nationalCode, phoneNumber);
        this.username = username;
        this.password = password;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Admin() {
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}
