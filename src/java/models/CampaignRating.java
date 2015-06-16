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
public class CampaignRating implements java.io.Serializable{
    
    public CampaignRating(){
    }
    
    private int crid;
    private int cid;
    private int uid;
    private int rate;

    /**
     * @return the _crid
     */
    public int getCrid() {
        return crid;
    }

    /**
     * @param _crid the _crid to set
     */
    public void setCrid(int _crid) {
        this.crid = _crid;
    }

    /**
     * @return the _cid
     */
    public int getCid() {
        return cid;
    }

    /**
     * @param _cid the _cid to set
     */
    public void setCid(int _cid) {
        this.cid = _cid;
    }

    /**
     * @return the _uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * @param _uid the _uid to set
     */
    public void setUid(int _uid) {
        this.uid = _uid;
    }

    /**
     * @return the _rate
     */
    public int getRate() {
        return rate;
    }

    /**
     * @param _rate the _rate to set
     */
    public void setRate(int _rate) {
        this.rate = _rate;
    }
}
