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
    
    private int _crid;
    private int _cid;
    private int _uid;
    private int _rate;

    /**
     * @return the _crid
     */
    public int getCrid() {
        return _crid;
    }

    /**
     * @param _crid the _crid to set
     */
    public void setCrid(int _crid) {
        this._crid = _crid;
    }

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
     * @return the _rate
     */
    public int getRate() {
        return _rate;
    }

    /**
     * @param _rate the _rate to set
     */
    public void setRate(int _rate) {
        this._rate = _rate;
    }
}
