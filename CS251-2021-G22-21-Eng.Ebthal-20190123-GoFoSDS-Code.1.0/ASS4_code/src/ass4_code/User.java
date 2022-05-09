/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass4_code;

/**
 *
 * @author Hoda
 */

import java.util.Scanner;

public class User {
    protected String name;
    protected static int ID;
    protected String password;
    protected String email;
    protected String phone;
    protected String defaultlocation;
    //protected Ewallet ewallet;
    /**
     * default constructor
     */
    public User(){
       

    }
    
    public User(String n, String p, String E, String T, String L ) {
        name=n;
        password=p;
        email=E;
        phone=T;
        defaultlocation=L;

    }
    
    public void  increamentId(){
        ID++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }


    public void setDefaultlocation(String defaultlocation) {
        this.defaultlocation = defaultlocation;
    }

    public String getDefaultlocation() {
        return defaultlocation;
    }

}