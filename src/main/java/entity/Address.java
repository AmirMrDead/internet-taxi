package entity;

import base.BaseEntity;

public class Address implements BaseEntity {

    private Integer id;
    private String province;
    private String city;
    private String description;

    public Address(String province, String city, String description) {
        this.province = province;
        this.city = city;
        this.description = description;
    }

    public Address() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
