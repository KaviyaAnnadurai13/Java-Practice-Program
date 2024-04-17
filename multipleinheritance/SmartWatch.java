package multipleinheritance;

public class SmartWatch extends Electronics{
private int price;
public SmartWatch(int warranty,int price) {
	super(warranty);
	this.price=price;
}
public void setprice(int price) {
	this.price=price;
}
public int getprice() {
	return price;
}
public String toString() {
	return super.toString()+" "+price;
}
}
