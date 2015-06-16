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
    
    private int asid;
    private int usid;
    private int qid;
    private int questionParentId;
    private int answeredResultId;
    private String answeredResultValue;
    private Date answeredTime; 

    /**
     * @return the asid
     */
    public int getAsid() {
        return asid;
    }

    /**
     * @param asid the asid to set
     */
    public void setAsid(int asid) {
        this.asid = asid;
    }

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
     * @return the qid
     */
    public int getQid() {
        return qid;
    }

    /**
     * @param qid the qid to set
     */
    public void setQid(int qid) {
        this.qid = qid;
    }

    /**
     * @return the questionParentId
     */
    public int getQuestionParentId() {
        return questionParentId;
    }

    /**
     * @param questionParentId the questionParentId to set
     */
    public void setQuestionParentId(int questionParentId) {
        this.questionParentId = questionParentId;
    }

    /**
     * @return the answeredResultId
     */
    public int getAnsweredResultId() {
        return answeredResultId;
    }

    /**
     * @param answeredResultId the answeredResultId to set
     */
    public void setAnsweredResultId(int answeredResultId) {
        this.answeredResultId = answeredResultId;
    }

    /**
     * @return the answeredResultValue
     */
    public String getAnsweredResultValue() {
        return answeredResultValue;
    }

    /**
     * @param answeredResultValue the answeredResultValue to set
     */
    public void setAnsweredResultValue(String answeredResultValue) {
        this.answeredResultValue = answeredResultValue;
    }

    /**
     * @return the answeredTime
     */
    public Date getAnsweredTime() {
        return answeredTime;
    }

    /**
     * @param answeredTime the answeredTime to set
     */
    public void setAnsweredTime(Date answeredTime) {
        this.answeredTime = answeredTime;
    }

  
}
