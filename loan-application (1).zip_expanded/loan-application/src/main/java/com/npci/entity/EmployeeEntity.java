package com.npci.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_id;

    private String emp_name;
    private String emp_email_id;
    private String emp_password;

    // Constructors, getters, and setters
 public EmployeeEntity() {
	 
 }
  
    public EmployeeEntity(String emp_name, String emp_email_id, String emp_password) {
        this.emp_name = emp_name;
        this.emp_email_id = emp_email_id;
        this.emp_password = emp_password;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_email_id() {
        return emp_email_id;
    }

    public void setEmp_email_id(String emp_email_id) {
        this.emp_email_id = emp_email_id;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }
}
