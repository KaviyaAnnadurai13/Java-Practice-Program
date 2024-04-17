package condition;

public class grade {

	public static void main(String[] args) {
		int mark=45;
		if(mark<=100 && mark>90) {
			System.out.println("Grade A");
		}
		else if(mark<=90 && mark>80) {
			System.out.println("Grade B");
		}
		else if(mark<=80 && mark>60) {
			System.out.println("Grade C");
		}
		else if(mark<=60 && mark>40) {
			System.out.println("Grade D");
		}
		else if(mark<=40 && mark>=0) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid input");
		}
	}

}
