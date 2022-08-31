package entity;

import base.LoginInformation;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Passenger extends Person implements LoginInformation {

    private String username;
    private String password;
    private final LinkedList<Integer> travelsId = new LinkedList<>();
    private Float totalPay;
    private final LinkedList<Integer> addressId = new LinkedList<>();

    public Passenger(String firstname, String lastname, String nationalCode, String phoneNumber, String username, String password, Float totalPay) {
        super(firstname, lastname, nationalCode, phoneNumber);
        this.username = username;
        this.password = password;
        this.totalPay = totalPay;
    }

    public Passenger(String username, String password, Float totalPay) {
        this.username = username;
        this.password = password;
        this.totalPay = totalPay;
    }

    public Passenger() {
    }

    public LinkedList<Integer> getTravelsId() {
        return travelsId;
    }

    public Float getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(Float totalPay) {
        this.totalPay = totalPay;
    }

    public LinkedList<Integer> getAddressId() {
        return addressId;
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
