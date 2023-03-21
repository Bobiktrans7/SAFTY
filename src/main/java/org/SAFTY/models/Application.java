package org.SAFTY.models;
import jakarta.validation.constraints.*;
public class Application {
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;
    @Max(value = 18, message = "Age should be greater than 18")
    private int age;
    @NotEmpty(message = "Name should not be empty")
    @Email(message = "Email should be valid")
    private String mail;

    public Application() {

    }

    public Application(String name, int age, String mail) {
        this.name = name;
        this.mail = mail;
        this.age = age;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }
}

