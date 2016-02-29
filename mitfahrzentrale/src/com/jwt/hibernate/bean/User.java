package com.jwt.hibernate.bean;
 
public class User {
    private int id;
    private String userSurname;
    private String userFamilyname;
    private String password1;
    private String email;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getuserSurname() {
        return userSurname;
    }
 
    public void setuserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
 
    
    public String getuserFamilyname() {
        return userFamilyname;
    }
 
    public void setuserFamilyname(String userFamilyname) {
        this.userFamilyname = userFamilyname;
    }
    
    
    public String getPassword1() {
        return password1;
    }
 
    public void setPassword1(String password1) {
        this.password1 = password1;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
 
}
