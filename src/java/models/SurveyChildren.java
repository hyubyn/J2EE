/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

     /**
     * Insert Survey Children
     */
   public int insertSurveyChildren(){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
             String sql = "Select e.scid, e.sid, e.surveyChildName, e.surveyChildDescription,"
                     + "e.surveyChildCreated, e.surveyChildModified, e.surveyChildPosition"
                     + "e.surveyChildStatus from "
                    + SurveyChildren.class.getName() + " e ";
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();
            this.sid = Integer.parseInt(datas.get(0)[0].toString());
            for (int i = 0; i < datas.size(); i++) {
                int id = Integer.parseInt(datas.get(i)[0].toString());
                if (this.scid < id) {
                    this.scid = id;
                }
            }
            this.scid ++;
            session.save(this);
            ta.commit();
            return 1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Rollback trong trường hợp có lỗi xẩy ra.
            session.getTransaction().rollback();
            return 0;
        } finally {
            session.flush();
            session.close();
            return 1;
        }

    }
    
    /**
     * Get survey children by id
     */
    
    public void getSurveyChildrenById(int id){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
            String sql = "Select e.scid, e.sid, e.surveyChildName, e.surveyChildDescription,"
                     + "e.surveyChildCreated, e.surveyChildModified, e.surveyChildPosition"
                     + "e.surveyChildStatus from "
                    + SurveyChildren.class.getName() + " e where e.scid = " + id;
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();

            for (Object[] emp : datas) {
                this.scid = Integer.parseInt(emp[0].toString());
                this.sid = Integer.parseInt(emp[1].toString());
                this.surveyChildName =  emp[2].toString();
                this.surveyChildDescription = emp[3].toString();
                this.surveyChildCreated = emp[4].toString();
                this.surveyChildModified = emp[5].toString();
                this.surveyChildPosition =  emp[6].toString();
                this.surveyChildStatus = emp[7].toString(); 
            }
            // Commit dữ liệu
            ta.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Rollback trong trường hợp có lỗi xẩy ra.
          session.getTransaction().rollback();
        } finally {
            session.flush();
            session.close();
        }
    }

    /**
     * Get survey children by name
     */
    
    public void getSurveyChildByName(String name){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
            
             String sql = "Select e.scid, e.sid, e.surveyChildName, e.surveyChildDescription,"
                     + "e.surveyChildCreated, e.surveyChildModified, e.surveyChildPosition"
                     + "e.surveyChildStatus from "
                    + SurveyChildren.class.getName() + " e where e.surveyChildName = " + name;
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();

            for (Object[] emp : datas) {
                 this.scid = Integer.parseInt(emp[0].toString());
                this.sid = Integer.parseInt(emp[1].toString());
                this.surveyChildName =  emp[2].toString();
                this.surveyChildDescription = emp[3].toString();
                this.surveyChildCreated = emp[4].toString();
                this.surveyChildModified = emp[5].toString();
                this.surveyChildPosition =  emp[6].toString();
                this.surveyChildStatus = emp[7].toString(); 
            }
            // Commit dữ liệu
            ta.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            // Rollback trong trường hợp có lỗi xẩy ra.
          session.getTransaction().rollback();
        } finally {
            session.flush();
            session.close();
        }
    }
   
}
