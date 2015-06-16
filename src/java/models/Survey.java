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
    
    private int sid;
    private String surveyName;
    private String surveyDescription;

    /**
     * @return the _sid
     */
    public int getSid() {
        return sid;
    }

    /**
     * @param _sid the _sid to set
     */
    public void setSid(int _sid) {
        this.sid = _sid;
    }

    /**
     * @return the _surveyName
     */
    public String getSurveyName() {
        return surveyName;
    }

    /**
     * @param _surveyName the _surveyName to set
     */
    public void setSurveyName(String _surveyName) {
        this.surveyName = _surveyName;
    }

    /**
     * @return the _surveyDescription
     */
    public String getSurveyDescription() {
        return surveyDescription;
    }

    /**
     * @param _surveyDescription the _surveyDescription to set
     */
    public void setSurveyDescription(String _surveyDescription) {
        this.surveyDescription = _surveyDescription;
    }
}
