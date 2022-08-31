package entity;

import base.BaseEntity;

public class Travel implements BaseEntity {

    private Integer id;
    private Address origin;
    private Address destination;
    private Integer driverId;
    private Integer passengerId;
    private Float price;

    public Travel(Address origin, Address destination, Integer driverId, Integer passengerId, Float price) {
        this.origin = origin;
        this.destination = destination;
        this.driverId = driverId;
        this.passengerId = passengerId;
        this.price = price;
    }

    public Travel() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Address getOrigin() {
        return origin;
    }

    public void setOrigin(Address origin) {
        this.origin = origin;
    }

    public Address getDestination() {
        return destination;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
