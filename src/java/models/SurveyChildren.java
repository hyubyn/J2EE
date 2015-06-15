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
    
    private int _scid;
    private int _sid;
    private String _surveyChildName;
    private String _surveyChildDescription;
    private String _surveyChildCreated;
    private String _surveyChildModified;
    private String _surveyChildPosition;
    private String _surveyChildStatus;

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
     * @return the _sid
     */
    public int getSid() {
        return _sid;
    }

    /**
     * @param _sid the _sid to set
     */
    public void setSid(int _sid) {
        this._sid = _sid;
    }

    /**
     * @return the _surveyChildName
     */
    public String getSurveyChildName() {
        return _surveyChildName;
    }

    /**
     * @param _surveyChildName the _surveyChildName to set
     */
    public void setSurveyChildName(String _surveyChildName) {
        this._surveyChildName = _surveyChildName;
    }

    /**
     * @return the _surveyChildDescription
     */
    public String getSurveyChildDescription() {
        return _surveyChildDescription;
    }

    /**
     * @param _surveyChildDescription the _surveyChildDescription to set
     */
    public void setSurveyChildDescription(String _surveyChildDescription) {
        this._surveyChildDescription = _surveyChildDescription;
    }

    /**
     * @return the _surveyChildCreated
     */
    public String getSurveyChildCreated() {
        return _surveyChildCreated;
    }

    /**
     * @param _surveyChildCreated the _surveyChildCreated to set
     */
    public void setSurveyChildCreated(String _surveyChildCreated) {
        this._surveyChildCreated = _surveyChildCreated;
    }

    /**
     * @return the _surveyChildModified
     */
    public String getSurveyChildModified() {
        return _surveyChildModified;
    }

    /**
     * @param _surveyChildModified the _surveyChildModified to set
     */
    public void setSurveyChildModified(String _surveyChildModified) {
        this._surveyChildModified = _surveyChildModified;
    }

    /**
     * @return the _surveyChildPosition
     */
    public String getSurveyChildPosition() {
        return _surveyChildPosition;
    }

    /**
     * @param _surveyChildPosition the _surveyChildPosition to set
     */
    public void setSurveyChildPosition(String _surveyChildPosition) {
        this._surveyChildPosition = _surveyChildPosition;
    }

    /**
     * @return the _surveyChildStatus
     */
    public String getSurveyChildStatus() {
        return _surveyChildStatus;
    }

    /**
     * @param _surveyChildStatus the _surveyChildStatus to set
     */
    public void setSurveyChildStatus(String _surveyChildStatus) {
        this._surveyChildStatus = _surveyChildStatus;
    }
}
