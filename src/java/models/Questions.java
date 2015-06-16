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
public class Questions implements java.io.Serializable{
 
    public Questions(){
    }
    
    private int qid;
    private int scid;
    private String questionType;
    private String questionName;
    private String questionPosition;

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
     * @return the questionType
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * @param questionType the questionType to set
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    /**
     * @return the questionName
     */
    public String getQuestionName() {
        return questionName;
    }

    /**
     * @param questionName the questionName to set
     */
    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    /**
     * @return the questionPosition
     */
    public String getQuestionPosition() {
        return questionPosition;
    }

    /**
     * @param questionPosition the questionPosition to set
     */
    public void setQuestionPosition(String questionPosition) {
        this.questionPosition = questionPosition;
    }

   
}
