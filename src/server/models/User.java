package server.models;

import java.net.Socket;

public class User {

    /* Attribute for User*/
    private String _username;
    private String _password;

    private String _firstName;
    private String _surName;
    private int _age;
    private String _address;
    private String _avatar;

    private Socket _socket;

    /*Constructor*/
    User(Socket socket) {
        this._socket = socket;
    }

    /*Set detail information attribute for User*/
    public void setUsername(String username) { this._username = username; }

    public void setPassword(String password) { this._password = password; }

    public void setFirstName(String firstName) {
        this._firstName = firstName;
    }

    public void set_surName(String surName) {
        this._surName = surName;
    }

    public void setAge(int age) {
        this._age = age;
    }

    public void setAddress(String address) {
        this._address = address;
    }

    public void setAvatar(String avatar) {
        this._avatar = avatar;
    }

    /*Get detail information attribute from User*/
    public String getUsername() { return this._username; }

    public String getPassword() { return this._password; }

    public String getFirstName() { return this._firstName; }

    public String getSurName() { return this._surName; }

    public int getAge() { return this._age; }

    public String getAddress() { return this._address; }

    public String getAvatar() { return this._avatar; }

    public Socket getSocket() { return this._socket; }
}
