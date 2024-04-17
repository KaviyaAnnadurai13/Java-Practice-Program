package encapsulation;

public class Animal {
	private String name;
	private String color;
	public Animal(String name,String color) {
		this.name=name;
		this.color=color;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public String getname() {
		return name;
	}
	public String getcolor() {
		return color;
	}
	public String toString() {
		return name+" "+color;
	}
}
