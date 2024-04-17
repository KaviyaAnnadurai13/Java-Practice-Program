package inheritance;

public class Electronics {
private int warranty;
public Electronics(int warranty) {
	this.warranty=warranty;
}
public void setwarranty(int warranty) {
	this.warranty=warranty;
}
public int getwarranty() {
	return warranty;
}
public String toString() {
	return  "Warranty"+warranty;
}
}
