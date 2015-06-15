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
    
    private int _qid;
    private int _scid;
    private String _questionType;
    private String _questionName;
    private String _questionPosition;

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
     * @return the _questionType
     */
    public String getQuestionType() {
        return _questionType;
    }

    /**
     * @param _questionType the _questionType to set
     */
    public void setQuestionType(String _questionType) {
        this._questionType = _questionType;
    }

    /**
     * @return the _questionName
     */
    public String getQuestionName() {
        return _questionName;
    }

    /**
     * @param _questionName the _questionName to set
     */
    public void setQuestionName(String _questionName) {
        this._questionName = _questionName;
    }

    /**
     * @return the _questionPosition
     */
    public String getQuestionPosition() {
        return _questionPosition;
    }

    /**
     * @param _questionPosition the _questionPosition to set
     */
    public void setQuestionPosition(String _questionPosition) {
        this._questionPosition = _questionPosition;
    }
}
