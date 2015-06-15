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
public class Answered implements java.io.Serializable{
    
    public Answered(){
    }
    
    private int _asid;
    private int _usid;
    private int _qid;
    private int _questionParentId;
    private int _answeredResultId;
    private String _answeredResultValue;
    private Date _answeredTime; 

    /**
     * @return the _asid
     */
    public int getAsid() {
        return _asid;
    }

    /**
     * @param _asid the _asid to set
     */
    public void setAsid(int _asid) {
        this._asid = _asid;
    }

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
     * @return the _qid
     */
    public int getQid() {
        return _qid;
    }

    /**
     * @param _qid the _qid to set
     */
    public void setQid(int _qid) {
        this._qid = _qid;
    }

    /**
     * @return the _questionParentId
     */
    public int getQuestionParentId() {
        return _questionParentId;
    }

    /**
     * @param _questionParentId the _questionParentId to set
     */
    public void setQuestionParentId(int _questionParentId) {
        this._questionParentId = _questionParentId;
    }

    /**
     * @return the _answeredResultId
     */
    public int getAnsweredResultId() {
        return _answeredResultId;
    }

    /**
     * @param _answeredResultId the _answeredResultId to set
     */
    public void setAnsweredResultId(int _answeredResultId) {
        this._answeredResultId = _answeredResultId;
    }

    /**
     * @return the _answeredResultValue
     */
    public String getAnsweredResultValue() {
        return _answeredResultValue;
    }

    /**
     * @param _answeredResultValue the _answeredResultValue to set
     */
    public void setAnsweredResultValue(String _answeredResultValue) {
        this._answeredResultValue = _answeredResultValue;
    }

    /**
     * @return the _answeredTime
     */
    public Date getAnsweredTime() {
        return _answeredTime;
    }

    /**
     * @param _answeredTime the _answeredTime to set
     */
    public void setAnsweredTime(Date _answeredTime) {
        this._answeredTime = _answeredTime;
    }

  
}
