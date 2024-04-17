package overloading;

public class Overloading {
public int add(int a,int b) {
	return a+b;
}
public float add(float a,float b) {
	return a+b;
}
public float add(int a,int b,float c) {
	return a+b+c;
}
public float add(int a,float b,int c) {
	return a+b+c;
}
}
