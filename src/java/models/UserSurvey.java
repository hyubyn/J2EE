/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Date;
/**
 *
 * @author NguyenVu
 */
public class UserSurvey implements java.io.Serializable{
    
    public UserSurvey(){
    }
    
    private int _usid;
    private int _uid;
    private int _scid;
    private int _numberQuestions;
    private int _numberAnswered;
    private Date _surveyTime;

    /**
     * @return the _usid
     */
    public int getUsid() {
        return _usid;
    }

    /**
     * @param _usid the _usid to set
     */
    public void setUsid(int _usid) {
        this._usid = _usid;
    }

    /**
     * @return the _uid
     */
    public int getUid() {
        return _uid;
    }

    /**
     * @param _uid the _uid to set
     */
    public void setUid(int _uid) {
        this._uid = _uid;
    }

    /**
     * @return the _scid
     */
    public int getScid() {
        return _scid;
    }

    /**
     * @param _scid the _scid to set
     */
    public void setScid(int _scid) {
        this._scid = _scid;
    }

    /**
     * @return the _numberQuestions
     */
    public int getNumberQuestions() {
        return _numberQuestions;
    }

    /**
     * @param _numberQuestions the _numberQuestions to set
     */
    public void setNumberQuestions(int _numberQuestions) {
        this._numberQuestions = _numberQuestions;
    }

    /**
     * @return the _numberAnswered
     */
    public int getNumberAnswered() {
        return _numberAnswered;
    }

    /**
     * @param _numberAnswered the _numberAnswered to set
     */
    public void setNumberAnswered(int _numberAnswered) {
        this._numberAnswered = _numberAnswered;
    }

    /**
     * @return the _surveyTime
     */
    public Date getSurveyTime() {
        return _surveyTime;
    }

    /**
     * @param _surveyTime the _surveyTime to set
     */
    public void setSurveyTime(Date _surveyTime) {
        this._surveyTime = _surveyTime;
    }
}
