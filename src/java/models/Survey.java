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
public class Survey implements java.io.Serializable{
    
    public Survey(){
    
    }
    
    private int _sid;
    private String _surveyName;
    private String _surveyDescription;

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
     * @return the _surveyName
     */
    public String getSurveyName() {
        return _surveyName;
    }

    /**
     * @param _surveyName the _surveyName to set
     */
    public void setSurveyName(String _surveyName) {
        this._surveyName = _surveyName;
    }

    /**
     * @return the _surveyDescription
     */
    public String getSurveyDescription() {
        return _surveyDescription;
    }

    /**
     * @param _surveyDescription the _surveyDescription to set
     */
    public void setSurveyDescription(String _surveyDescription) {
        this._surveyDescription = _surveyDescription;
    }
}
