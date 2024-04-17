package inheritance;

public class Fan extends Electronics {
private int price;
private String name;
public Fan(int warranty,int price,String name) {
	super(warranty);
	this.price=price;
	this.name=name;
}
public void setprice(int price) {
	 this.price=price;
}
public void setname(String name) {
	this.name=name;
}
public int getprice() {
	return price;
}
public String getname() {
	return name;
}
public String toString() {
	return super.toString()+price+name;
}
}
