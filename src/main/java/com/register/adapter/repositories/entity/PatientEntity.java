package com.register.adapter.repositories.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Patient")
public class PatientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_patient")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="birth_date")
    private Date birthDate;
    @Column(name="marital_status")
    private String maritalStatus;
    @Column(name="profession")
    private String profession;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private Integer phone;
    @Column(name="email")
    private String email;

    public PatientEntity(){
    }

    public PatientEntity(Integer id, String name, Date birthDate, String maritalStatus, String profession, String address, Integer phone, String email) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.maritalStatus = maritalStatus;
        this.profession = profession;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
