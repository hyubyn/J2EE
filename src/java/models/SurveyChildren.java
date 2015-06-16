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
public class SurveyChildren {
    
    public SurveyChildren(){
    
    }
    
    private int scid;
    private int sid;
    private String surveyChildName;
    private String surveyChildDescription;
    private String surveyChildCreated;
    private String surveyChildModified;
    private String surveyChildPosition;
    private String surveyChildStatus;

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
     * @return the sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(int sid) {
        this.sid = sid;
    }

    /**
     * @return the surveyChildName
     */
    public String getSurveyChildName() {
        return surveyChildName;
    }

    /**
     * @param surveyChildName the surveyChildName to set
     */
    public void setSurveyChildName(String surveyChildName) {
        this.surveyChildName = surveyChildName;
    }

    /**
     * @return the surveyChildDescription
     */
    public String getSurveyChildDescription() {
        return surveyChildDescription;
    }

    /**
     * @param surveyChildDescription the surveyChildDescription to set
     */
    public void setSurveyChildDescription(String surveyChildDescription) {
        this.surveyChildDescription = surveyChildDescription;
    }

    /**
     * @return the surveyChildCreated
     */
    public String getSurveyChildCreated() {
        return surveyChildCreated;
    }

    /**
     * @param surveyChildCreated the surveyChildCreated to set
     */
    public void setSurveyChildCreated(String surveyChildCreated) {
        this.surveyChildCreated = surveyChildCreated;
    }

    /**
     * @return the surveyChildModified
     */
    public String getSurveyChildModified() {
        return surveyChildModified;
    }

    /**
     * @param surveyChildModified the surveyChildModified to set
     */
    public void setSurveyChildModified(String surveyChildModified) {
        this.surveyChildModified = surveyChildModified;
    }

    /**
     * @return the surveyChildPosition
     */
    public String getSurveyChildPosition() {
        return surveyChildPosition;
    }

    /**
     * @param surveyChildPosition the surveyChildPosition to set
     */
    public void setSurveyChildPosition(String surveyChildPosition) {
        this.surveyChildPosition = surveyChildPosition;
    }

    /**
     * @return the surveyChildStatus
     */
    public String getSurveyChildStatus() {
        return surveyChildStatus;
    }

    /**
     * @param surveyChildStatus the surveyChildStatus to set
     */
    public void setSurveyChildStatus(String surveyChildStatus) {
        this.surveyChildStatus = surveyChildStatus;
    }

   
}
