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
public class Campaign implements java.io.Serializable{
    
    public Campaign(){
    }
    
    private int _cid;
    private int _uid;
    private String _campaignTitle;
    private Date _postTime;
    private Date _startTime;
    private Date _endTime;
    private String _campaignAge;
    private String _campaignGender;
    private String _campaignLocation;

    /**
     * @return the _cid
     */
    public int getCid() {
        return _cid;
    }

    /**
     * @param _cid the _cid to set
     */
    public void setCid(int _cid) {
        this._cid = _cid;
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
     * @return the _campaignTitle
     */
    public String getCampaignTitle() {
        return _campaignTitle;
    }

    /**
     * @param _campaignTitle the _campaignTitle to set
     */
    public void setCampaignTitle(String _campaignTitle) {
        this._campaignTitle = _campaignTitle;
    }

    /**
     * @return the _postTime
     */
    public Date getPostTime() {
        return _postTime;
    }

    /**
     * @param _postTime the _postTime to set
     */
    public void setPostTime(Date _postTime) {
        this._postTime = _postTime;
    }

    /**
     * @return the _startTime
     */
    public Date getStartTime() {
        return _startTime;
    }

    /**
     * @param _startTime the _startTime to set
     */
    public void setStartTime(Date _startTime) {
        this._startTime = _startTime;
    }

    /**
     * @return the _endTime
     */
    public Date getEndTime() {
        return _endTime;
    }

    /**
     * @param _endTime the _endTime to set
     */
    public void setEndTime(Date _endTime) {
        this._endTime = _endTime;
    }

    /**
     * @return the _campaignAge
     */
    public String getCampaignAge() {
        return _campaignAge;
    }

    /**
     * @param _campaignAge the _campaignAge to set
     */
    public void setCampaignAge(String _campaignAge) {
        this._campaignAge = _campaignAge;
    }

    /**
     * @return the _campaignGender
     */
    public String getCampaignGender() {
        return _campaignGender;
    }

    /**
     * @param _campaignGender the _campaignGender to set
     */
    public void setCampaignGender(String _campaignGender) {
        this._campaignGender = _campaignGender;
    }

    /**
     * @return the _campaignLocation
     */
    public String getCampaignLocation() {
        return _campaignLocation;
    }

    /**
     * @param _campaignLocation the _campaignLocation to set
     */
    public void setCampaignLocation(String _campaignLocation) {
        this._campaignLocation = _campaignLocation;
    }

   
}
