/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public class Questions implements java.io.Serializable{
 
    public Questions(){
    }
    
    private int qid;
    private int scid;
    private String questionType;
    private String questionName;
    private String questionPosition;

    /**
     * @return the qid
     */
    public int getQid() {
        return qid;
    }

    /**
     * @param qid the qid to set
     */
    public void setQid(int qid) {
        this.qid = qid;
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
     * @return the questionType
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * @param questionType the questionType to set
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    /**
     * @return the questionName
     */
    public String getQuestionName() {
        return questionName;
    }

    /**
     * @param questionName the questionName to set
     */
    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    /**
     * @return the questionPosition
     */
    public String getQuestionPosition() {
        return questionPosition;
    }

    /**
     * @param questionPosition the questionPosition to set
     */
    public void setQuestionPosition(String questionPosition) {
        this.questionPosition = questionPosition;
    }

     /**
     * Insert Question
     */
  
   public int insertQuestion(){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
            String sql = "Select e.qid, e.scid, e.questionType, e.questionName, e.questionPosition from "
                    + Questions.class.getName() + " e ";
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();
            this.qid = Integer.parseInt(datas.get(0)[0].toString());
            for (int i = 0; i < datas.size(); i++) {
                int id = Integer.parseInt(datas.get(i)[0].toString());
                if (this.qid < id) {
                    this.qid = id;
                }
            }
            this.qid ++;
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
     * Get question by id
     */
    
    public void getQuestionById(int id){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
            
             String sql = "Select e.qid, e.scid, e.questionType, e.questionName, e.questionPosition from "
                    + Questions.class.getName() + " e where e.qid = " + id;
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();

            for (Object[] emp : datas) {
                this.qid = Integer.parseInt(emp[0].toString());
                this.scid = Integer.parseInt(emp[1].toString());
                this.questionType =  emp[2].toString();
                this.questionName = emp[3].toString();
                this.questionPosition = emp[4].toString();
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
