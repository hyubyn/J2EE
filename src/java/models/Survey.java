/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Transaction;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author NguyenVu
 */
public class Survey implements java.io.Serializable{
   
    private int sid;
    private String surveyName;
    private String surveyDescription;
    
    public Survey(){
        
    }
    
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
    
    /**
     * Insert Survey
     */
    
   public int insertSurvey(){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
             String sql = "Select e.sid, e.surveyName, e.surveyDescription from "
                    + Survey.class.getName() + " e ";
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();
            this.sid = Integer.parseInt(datas.get(0)[0].toString());
            for (int i = 0; i < datas.size(); i++) {
                int id = Integer.parseInt(datas.get(i)[0].toString());
                if (this.sid < id) {
                    this.sid = id;
                }
            }
            this.sid ++;
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
     * Get survey by id
     */
    
    public void getSurveyById(int id){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
            
            String sql = "Select e.sid, e.surveyName, e.surveyDescription from "
                    + Survey.class.getName() + " e where e.sid = " + id;
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();

            for (Object[] emp : datas) {
                this.sid = Integer.parseInt(emp[0].toString());
                this.surveyName = emp[1].toString();
                this.surveyDescription =  emp[2].toString();
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
     * Get survey by id
     */
    
    public void getSurveyByName(String name){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
            
            String sql = "Select e.sid, e.surveyName, e.surveyDescription from "
                    + Survey.class.getName() + " e where e.surveyName = " + name;
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();

            for (Object[] emp : datas) {
                this.sid = Integer.parseInt(emp[0].toString());
                this.surveyName = emp[1].toString();
                this.surveyDescription =  emp[2].toString();
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
