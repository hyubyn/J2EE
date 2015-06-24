/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import static javassist.CtMethod.ConstParameter.string;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.format.annotation.DateTimeFormat;
/**
 *
 * @author NguyenVu
 */
public class Answered implements java.io.Serializable{
    
    public Answered(){
    }
    
    private int asid;
    private int usid;
    private int qid;
    private int questionParentId;
    private int answeredResultId;
    private String answeredResultValue;
    private Date answeredTime; 

    /**
     * @return the asid
     */
    public int getAsid() {
        return asid;
    }

    /**
     * @param asid the asid to set
     */
    public void setAsid(int asid) {
        this.asid = asid;
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
     * @return the questionParentId
     */
    public int getQuestionParentId() {
        return questionParentId;
    }

    /**
     * @param questionParentId the questionParentId to set
     */
    public void setQuestionParentId(int questionParentId) {
        this.questionParentId = questionParentId;
    }

    /**
     * @return the answeredResultId
     */
    public int getAnsweredResultId() {
        return answeredResultId;
    }

    /**
     * @param answeredResultId the answeredResultId to set
     */
    public void setAnsweredResultId(int answeredResultId) {
        this.answeredResultId = answeredResultId;
    }

    /**
     * @return the answeredResultValue
     */
    public String getAnsweredResultValue() {
        return answeredResultValue;
    }

    /**
     * @param answeredResultValue the answeredResultValue to set
     */
    public void setAnsweredResultValue(String answeredResultValue) {
        this.answeredResultValue = answeredResultValue;
    }

    /**
     * @return the answeredTime
     */
    public Date getAnsweredTime() {
        return answeredTime;
    }

    /**
     * @param answeredTime the answeredTime to set
     */
    public void setAnsweredTime(Date answeredTime) {
        this.answeredTime = answeredTime;
    }

     /**
     * Insert Answered
     */
   
   public int insertAnswered(){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
             String sql = "Select e.asid, e.usid, e.qid, e.questionParentId, e.answeredResultId, e.answeredResultValue"
                     + "e.answeredTime from "
                    + Answered.class.getName() + " e ";
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();
            this.asid = Integer.parseInt(datas.get(0)[0].toString());
            for (int i = 0; i < datas.size(); i++) {
                int id = Integer.parseInt(datas.get(i)[0].toString());
                if (this.asid < id) {
                    this.asid = id;
                }
            }
            this.asid ++;
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
            
            String sql = "Select e.asid, e.usid, e.qid, e.questionParentId, e.answeredResultId, e.answeredResultValue"
                     + "e.answeredTime from "
                    + Answered.class.getName() + " e where e.asid = " + id;
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();

            for (Object[] emp : datas) {
                this.asid = Integer.parseInt(emp[0].toString());
                this.usid = Integer.parseInt(emp[1].toString());
                this.qid =  Integer.parseInt(emp[2].toString());
                this.questionParentId = Integer.parseInt(emp[3].toString());
                this.answeredResultId = Integer.parseInt(emp[4].toString());
                this.answeredResultValue =  emp[5].toString();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
                try {
                        this.answeredTime  = formatter.parse(emp[6].toString());
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
    
    
    /**
     * Get answered by question id
     */
    
    public List<Answered> getAnsweredByQuestionId(int qid){
        Session session = null;
        Transaction ta;
        List<Answered> answereds = null;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
            
            String sql = "Select e.asid, e.usid, e.qid, e.questionParentId, e.answeredResultId, e.answeredResultValue"
                     + "e.answeredTime from "
                    + Answered.class.getName() + " e where e.qid = " + qid;
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();
            
            for (Object[] emp : datas) {
                Answered ans = new Answered();
                ans.asid = Integer.parseInt(emp[0].toString());
                ans.usid = Integer.parseInt(emp[1].toString());
                ans.qid =  Integer.parseInt(emp[2].toString());
                ans.questionParentId = Integer.parseInt(emp[3].toString());
                ans.answeredResultId = Integer.parseInt(emp[4].toString());
                ans.answeredResultValue =  emp[5].toString();
                SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
                try {
                        ans.answeredTime  = formatter.parse(emp[6].toString());
                } catch (ParseException e) {
                        e.printStackTrace();
                }
                answereds.add(ans);
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
        return answereds;
    }
    
   
    
  
}
