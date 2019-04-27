package com.pojo;

/**
 * @Author jhao
 * @Date 2019/4/25 19:48
 * @Description
 * @Modified by:
 */
public class Student {

    private String usernamed;
    private String password;
    private String salt;

    public String getUsernamed() {
        return usernamed;
    }

    public void setUsernamed(String usernamed) {
        this.usernamed = usernamed;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "User{" +
                "usernamed='" + usernamed + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}
