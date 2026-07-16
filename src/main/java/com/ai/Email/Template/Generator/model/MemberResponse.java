package com.ai.Email.Template.Generator.model;

public class MemberResponse {

    private String AB_User_Id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public String getAB_User_Id() {
        return AB_User_Id;
    }

    public void setAB_User_Id(String AB_User_Id) {
        this.AB_User_Id = AB_User_Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}