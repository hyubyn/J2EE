/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author NguyenVu
 */
public class User implements java.io.Serializable{
    public User(){
    }
    
    private int _id;
    private String _name;
    private String _email;
    private String _password;
    private String _address;
    private String _sex;
    private String _birthday;
    

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _email
     */
    public String getEmail() {
        return _email;
    }

    /**
     * @param _email the _email to set
     */
    public void setEmail(String _email) {
        this._email = _email;
    }

    /**
     * @return the _password
     */
    public String getPassword() {
        return _password;
    }

    /**
     * @param _password the _password to set
     */
    public void setPassword(String _password) {
        this._password = _password;
    }

    /**
     * @return the _address
     */
    public String getAddress() {
        return _address;
    }

    /**
     * @param _address the _address to set
     */
    public void setAddress(String _address) {
        this._address = _address;
    }

    /**
     * @return the _sex
     */
    public String getSex() {
        return _sex;
    }

    /**
     * @param _sex the _sex to set
     */
    public void setSex(String _sex) {
        this._sex = _sex;
    }

    /**
     * @return the _birthday
     */
    public String getBirthday() {
        return _birthday;
    }

    /**
     * @param _birthday the _birthday to set
     */
    public void setBirthday(String _birthday) {
        this._birthday = _birthday;
    }

    /**
     * @return the _id
     */
    public int getId() {
        return _id;
    }

    /**
     * @param _id the _id to set
     */
    public void setId(int _id) {
        this._id = _id;
    }
}
