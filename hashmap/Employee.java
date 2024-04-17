package hashmap;

public class Employee {
   private int empid;
   private String empname;
   private int empsalary;
   private int age;
   private String gender;
   private int experience;
   public Employee(int empid,String empname,int empsalary,int age,String gender,int experience) {
	   this.empid=empid;
	   this.empname=empname;
	   this.empsalary=empsalary;
	   this.age=age;
	   this.gender=gender;
	   this.experience=experience;
   }
   
 

public void setempname(int empid) {
	   this.empid=empid;
   }
   public void setempname(String empname) {
	   this.empname=empname;
   }
   public void setempsalary(int empsalary) {
	   this.empsalary=empsalary;
   }
   public void setage(int age) {
	   this.age=age;
   }
   public void setgender(String gender) {
	   this.gender=gender;
   }
   public void setexperience(int experience) {
	   this.experience=experience;
   }
   public String getempname() {
	   return empname;
   }
   public int getempid() {
	   return empid;
   }
   public int getempsalary() {
	   return empsalary;
   }
   public int getage() {
	   return age;
   }
   public String getgender() {
	   return gender;
   }
   public int getexperience() {
	   return experience;
   }
   public String toString() {
	   return empid+" "+empname+" "+empsalary+" "+age+" "+gender+" "+experience;
   }



 

}
