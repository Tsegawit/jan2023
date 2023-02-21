package com.example.jan2023.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.naming.Name;
import java.awt.*;
@EntityScan
public class employ {
    public void getallemploys() {
    }

    public class Employtable {
        private int empno;
        private String empname;
        private String empdesignation;
        private String empdepartment;
        public int getempno() {return empno;}
        public void setempno (int empno) {this.empno= empno;}
        public String getempname() { return empname;}
        public void setempname(String empname) {this.empname= empname;}
        public String getempdesignation() {return empdesignation;}
        public void setemploydesignation(String empdesignation) {this.empdesignation=empdesignation;}
        public String getempdepartment() {return empdepartment;}
        public void setempdepartment(String empdepartment) {this.empdepartment= empdepartment;}




    }
}
