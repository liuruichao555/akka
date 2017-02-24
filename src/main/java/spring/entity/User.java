package spring.entity;

import java.io.Serializable;

/**
 * User
 * 
 * @author liuruichao
 * Created on 2016-01-29 10:59
 */
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
