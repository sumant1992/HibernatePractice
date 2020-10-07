package com.iterviewexample.Angulardemo.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Project {



   @Id
   @GeneratedValue
   public int pid;

   public String projectname;

   public String remark;


   public int getPid() {
      return pid;
   }

   public void setPid(int pid) {
      this.pid = pid;
   }

   public String getProName() {
      return projectname;
   }

   public void setProName(String proName) {
      this.projectname = proName;
   }

   public String getRemark() {
      return remark;
   }

   public void setRemark(String remark) {
      this.remark = remark;
   }

   @Override
   public String toString() {
      return "Project{" +
              "pid=" + pid +
              ", proName='" + projectname + '\'' +
              ", remark='" + remark + '\'' +
              '}';
   }

   public Project(int pid, String proName, String remark) {
      this.pid = pid;
      this.projectname = proName;
      this.remark = remark;
   }

   public Project() {
   }
}
