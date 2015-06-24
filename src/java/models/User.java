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
public class User implements java.io.Serializable{
    public User(){
    }
    
    private int id;
    private String name;
    private String email;
    private String password;
    private String address;
    private String sex;
    private String birthday;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the birthday
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    
  /**
     * Insert User
     */
   
   public int insertUser(){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
             String sql = "Select e.id, e.name, e.email, e.password,"
                     + " e.address, e.sex"
                     + "e.birthday from "
                    + User.class.getName() + " e ";
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();
            this.id = Integer.parseInt(datas.get(0)[0].toString());
            for (int i = 0; i < datas.size(); i++) {
                int id = Integer.parseInt(datas.get(i)[0].toString());
                if (this.id < id) {
                    this.id = id;
                }
            }
            this.id ++;
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
     * Get User by id
     */
    
    public void getUserById(int id){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
            
            String sql = "Select e.id, e.name, e.email, e.password,"
                     + " e.address, e.sex"
                     + "e.birthday from "
                    + User.class.getName() + " e where e.id = " + id;
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();

            for (Object[] emp : datas) {
                this.id = Integer.parseInt(emp[0].toString());
                this.name = emp[1].toString();
                this.email =  emp[2].toString();
                this.password = emp[3].toString();
                this.address = emp[4].toString();
                this.sex =  emp[5].toString();
                this.birthday =  emp[6].toString();
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
     * Get User by name
     */
    
    public void getUserById(String name){
        Session session = null;
        Transaction ta;
        try {
            SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
            session = sessionFactory.openSession();
            ta = session.beginTransaction();
            
            String sql = "Select e.id, e.name, e.email, e.password,"
                     + " e.address, e.sex"
                     + "e.birthday from "
                    + User.class.getName() + " e where e.name = " + name;
            Query query = session.createQuery(sql);

          // Thực hiện truy vấn.
            // Lấy ra danh sách các đối tượng Object[]
            List<Object[]> datas = query.list();

            for (Object[] emp : datas) {
                this.id = Integer.parseInt(emp[0].toString());
                this.name = emp[1].toString();
                this.email =  emp[2].toString();
                this.password = emp[3].toString();
                this.address = emp[4].toString();
                this.sex =  emp[5].toString();
                this.birthday =  emp[6].toString();
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
