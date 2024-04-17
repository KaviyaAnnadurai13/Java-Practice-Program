package encapsulation;

public class Dog  {
	private int height;
	private int size;
	private Animal animals;
	public Dog(int height,int size,Animal animals) {
		this.height=height;
		this.size=size;
		this.animals=animals;
	}
	public void setheight(int height) {
		this.height=height;
	}
	public void setsize(int size) {
		this.size=size;
	}
	public void setanimals(Animal animals) {
		this.animals=animals;
	}
	public int getheight() {
		return height;
	}
	public int getsize() {
		return size;
	}
	public Animal getanimals() {
		return animals;
	}
	public String toString() {
		return height+" "+size+" "+animals;
		}
}
