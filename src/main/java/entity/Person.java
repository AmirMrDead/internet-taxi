package entity;

import base.BaseEntity;

public class Person implements BaseEntity {

    private Integer id;
    private String firstname;
    private String lastname;
    private String nationalCode;
    private String phoneNumber;

    public Person(String firstname, String lastname, String nationalCode, String phoneNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nationalCode = nationalCode;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
