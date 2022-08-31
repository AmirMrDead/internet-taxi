package entity;

import base.LoginInformation;
import entity.enums.DriverAccessType;

import java.util.LinkedList;

public class Driver extends Person implements LoginInformation {

    private String username;
    private String password;
    private Float totalIncome;
    private DriverAccessType accessType;
    private Integer carId;
    private final LinkedList<Integer> travelsId = new LinkedList<>();

    public Driver(String firstname, String lastname, String nationalCode, String phoneNumber, String username, String password, Float totalIncome, DriverAccessType accessType, Integer carId) {
        super(firstname, lastname, nationalCode, phoneNumber);
        this.username = username;
        this.password = password;
        this.totalIncome = totalIncome;
        this.accessType = accessType;
        this.carId = carId;
    }

    public Driver(String username, String password, Float totalIncome, DriverAccessType accessType, Integer carId) {
        this.username = username;
        this.password = password;
        this.totalIncome = totalIncome;
        this.accessType = accessType;
        this.carId = carId;
    }

    public Driver() {
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

    public Float getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Float totalIncome) {
        this.totalIncome = totalIncome;
    }

    public DriverAccessType getAccessType() {
        return accessType;
    }

    public void setAccessType(DriverAccessType accessType) {
        this.accessType = accessType;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public LinkedList<Integer> getTravelsId() {
        return travelsId;
    }
}
