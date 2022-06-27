/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sown
 */
public class Account {
    private int id;
    private String user;
    private String pass;
    private String fullname;
    private String email;
    private String phone;
    private boolean role;
    

    public Account() {
    }

    public Account(int id, String user, String pass, String fullname, String email, String phone, boolean role ) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.role = role;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

   
   
}
