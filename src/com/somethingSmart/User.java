package com.somethingSmart;

public abstract class User {
    private String password;
    private String login;
    private String userName;

    public User(String password, String login, String userName){
        this.password = password;
        this.login = login;
        this.userName = userName;
    }

    public String getLogin() {
        return login;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
