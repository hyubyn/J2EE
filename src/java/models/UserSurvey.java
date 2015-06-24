/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class UserSurvey implements java.io.Serializable{
     
    private int usid;
    private int uid;
    private int scid;
    private int numberQuestions;
    private int numberAnswered;
    private Date surveyTime;

    public UserSurvey(){
    }
    
    /**
     * @return the usid
     */
    public int getUsid() {
        return usid;
    }

    /**
     * @param usid the usid to set
     */
    public void setUsid(int usid) {
        this.usid = usid;
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
     * @return the numberQuestions
     */
    public int getNumberQuestions() {
        return numberQuestions;
    }

    /**
     * @param numberQuestions the numberQuestions to set
     */
    public void setNumberQuestions(int numberQuestions) {
        this.numberQuestions = numberQuestions;
    }

    /**
     * @return the numberAnswered
     */
    public int getNumberAnswered() {
        return numberAnswered;
    }

    /**
     * @param numberAnswered the numberAnswered to set
     */
    public void setNumberAnswered(int numberAnswered) {
        this.numberAnswered = numberAnswered;
    }

    /**
     * @return the surveyTime
     */
    public Date getSurveyTime() {
        return surveyTime;
    }

    /**
     * @param surveyTime the surveyTime to set
     */
    public void setSurveyTime(Date surveyTime) {
        this.surveyTime = surveyTime;
    }

    /**
     * Insert UserSurvey
     */
      
   public int insertUserSurvey(){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
             String sql = "Select e.usid, e.uid, e.scid, e.numberQuestions, e.numberAnswered, "
                     + "e.surveyTime from "
                    + UserSurvey.class.getName() + " e ";
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();
            this.usid = Integer.parseInt(datas.get(0)[0].toString());
            for (int i = 0; i < datas.size(); i++) {
                int id = Integer.parseInt(datas.get(i)[0].toString());
                if (this.usid < id) {
                    this.usid = id;
                }
            }
            this.usid ++;
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
     * Get answered by id
     */
    
    public void getAnsweredById(int id){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
            
             String sql = "Select e.usid, e.uid, e.scid, e.numberQuestions, e.numberAnswered,"
                     + "e.surveyTime from "
                    + UserSurvey.class.getName() + " e where e.usid = " + id;
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();

            for (Object[] emp : datas) {
                this.usid = Integer.parseInt(emp[0].toString());
                this.uid = Integer.parseInt(emp[1].toString());
                this.scid =  Integer.parseInt(emp[2].toString());
                this.numberQuestions = Integer.parseInt(emp[3].toString());
                this.numberAnswered = Integer.parseInt(emp[4].toString());
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
                try {
                        this.surveyTime  = formatter.parse(emp[5].toString());
                } catch (ParseException e) {
                        e.printStackTrace();
                }
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
