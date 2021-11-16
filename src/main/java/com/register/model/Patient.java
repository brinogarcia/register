package com.register.model;


import java.util.Date;


public class Patient {
    private String name;
    private Date birthDate;
    private String maritalStatus;
    private String profession;
    private String address;
    private Integer phone;
    private String email;

    public Patient(){

    }
    public Patient(String name, Date birthDate, String maritalStatus, String profession, String address, Integer phone, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.maritalStatus = maritalStatus;
        this.profession = profession;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
