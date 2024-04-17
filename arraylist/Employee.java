package arraylist;

public class Employee {
	private String name;
	private int age;
	private int salary;
	private String gender;
	private String shift;
	public Employee(String name,int age,int salary,String gender,String shift) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.gender=gender;
		this.shift=shift;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setage(int age) {
		this.age=age;
	}
	public void setsalary(int salary) {
		this.salary=salary;
	}
	public void setgender(String gender) {
		this.gender=gender;
    }
	public void setshift(String shift) {
		this.shift=shift;
	}
	public String getname(){
		return name;
	}
	public Integer getage(){
		return age;
	}
	public Integer getsalary() {
		return salary;
	}
	public String getgender() {
		return gender;
	}
	public String getshift() {
		return shift;
	}
	public String toString() {
		return name+" "+age+" "+salary+" "+gender+" "+shift;
	}
	

}
