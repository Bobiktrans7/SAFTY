package org.SAFTY.models;
import jakarta.validation.constraints.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Client {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;
    @Max(value = 18, message = "Age should be greater than 18")
    private int phone;
    @NotEmpty(message = "Name should not be empty")
    @Email(message = "Email should be valid")
    private String mail;
    private String gender;
    private String type_of_insurance;

    public Client() {

    }

    public Client(int id,String name, String mail, int phone, String gender, String type_of_insurance) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.gender = gender;
        this.phone = phone;
        this.type_of_insurance = type_of_insurance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType_of_insurance() {
        return type_of_insurance;
    }

    public void setType_of_insurance(String type_of_insurance) {
        this.type_of_insurance = type_of_insurance;
    }

    public void setId(int id) {
        this.id = id;
    }
}

