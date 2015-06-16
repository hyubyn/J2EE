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
    
    private int cid;
    private int uid;
    private String campaignTitle;
    private Date postTime;
    private Date startTime;
    private Date endTime;
    private String campaignAge;
    private String campaignGender;
    private String campaignLocation;

    /**
     * @return the cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(int cid) {
        this.cid = cid;
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
     * @return the campaignTitle
     */
    public String getCampaignTitle() {
        return campaignTitle;
    }

    /**
     * @param campaignTitle the campaignTitle to set
     */
    public void setCampaignTitle(String campaignTitle) {
        this.campaignTitle = campaignTitle;
    }

    /**
     * @return the postTime
     */
    public Date getPostTime() {
        return postTime;
    }

    /**
     * @param postTime the postTime to set
     */
    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    /**
     * @return the startTime
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the campaignAge
     */
    public String getCampaignAge() {
        return campaignAge;
    }

    /**
     * @param campaignAge the campaignAge to set
     */
    public void setCampaignAge(String campaignAge) {
        this.campaignAge = campaignAge;
    }

    /**
     * @return the campaignGender
     */
    public String getCampaignGender() {
        return campaignGender;
    }

    /**
     * @param campaignGender the campaignGender to set
     */
    public void setCampaignGender(String campaignGender) {
        this.campaignGender = campaignGender;
    }

    /**
     * @return the campaignLocation
     */
    public String getCampaignLocation() {
        return campaignLocation;
    }

    /**
     * @param campaignLocation the campaignLocation to set
     */
    public void setCampaignLocation(String campaignLocation) {
        this.campaignLocation = campaignLocation;
    }

   
   
}
