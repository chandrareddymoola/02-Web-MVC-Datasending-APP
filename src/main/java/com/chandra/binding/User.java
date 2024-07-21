package com.chandra.binding;

public class User {
    private Integer id;
    private String uname;
    private String email;
    public User(){
        System.out.println("zero param constructor");
    }

    public User(Integer id, String uname, String email) {
        this.id = id;
        this.uname = uname;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
