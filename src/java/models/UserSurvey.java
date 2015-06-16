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
    
    private int usid;
    private int uid;
    private int scid;
    private int numberQuestions;
    private int numberAnswered;
    private Date surveyTime;

    /**
     * @return the usid
     */
    public int getUsid() {
        return usid;
    }

    /**
     * @param usid the usid to set
     */
    public void setUsid(int usid) {
        this.usid = usid;
    }

    /**
     * @return the uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(int uid) {
        this.uid = uid;
    }

    /**
     * @return the scid
     */
    public int getScid() {
        return scid;
    }

    /**
     * @param scid the scid to set
     */
    public void setScid(int scid) {
        this.scid = scid;
    }

    /**
     * @return the numberQuestions
     */
    public int getNumberQuestions() {
        return numberQuestions;
    }

    /**
     * @param numberQuestions the numberQuestions to set
     */
    public void setNumberQuestions(int numberQuestions) {
        this.numberQuestions = numberQuestions;
    }

    /**
     * @return the numberAnswered
     */
    public int getNumberAnswered() {
        return numberAnswered;
    }

    /**
     * @param numberAnswered the numberAnswered to set
     */
    public void setNumberAnswered(int numberAnswered) {
        this.numberAnswered = numberAnswered;
    }

    /**
     * @return the surveyTime
     */
    public Date getSurveyTime() {
        return surveyTime;
    }

    /**
     * @param surveyTime the surveyTime to set
     */
    public void setSurveyTime(Date surveyTime) {
        this.surveyTime = surveyTime;
    }

  
}
