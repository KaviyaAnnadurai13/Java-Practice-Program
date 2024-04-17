package multipleinheritance;

public class Watch extends SmartWatch {
	private String name;
public Watch(int warranty,int price,String name) {
	super(warranty,price);
	this.name=name;
}
public void setname() {
	this.name=name;
}
public String getname() {
	return name;
}
public String toString() {
	return super.toString()+" "+name;
}
}
