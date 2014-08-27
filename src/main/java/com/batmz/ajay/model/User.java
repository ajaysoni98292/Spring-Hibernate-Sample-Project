package com.batmz.ajay.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ajay on 27/8/14.
 */

@Entity
@Table(name = "USER")
public class User implements Serializable {

    @Id
    @GeneratedValue
    @Column (name = "USER_ID")
    private String userId;

    @Column (name = "USER_NAME")
    private String userName;

    @Column (name = "SALT")
    private String salt;

    @Column (name = "PASSWORD")
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
