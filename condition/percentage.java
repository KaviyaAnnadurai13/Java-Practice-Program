package condition;

public class percentage {
	public static void main(String[] args) {
		int salary = 900000;
		if (salary < 1000000 && salary >= 700000) {
			System.out.println("Net Amount= " + (salary - (salary * 25 / 100)));
		} else if (salary < 700000 && salary >= 500000) {
			System.out.println("Net Amount= " + (salary - (salary * 15 / 100)));
		} else if (salary < 500000 && salary >= 300000) {
			System.out.println("Net Amount= " + (salary - (salary * 10 / 100)));
		} else {
			System.out.println("no tax");
		}
	}
}
//net amount formula
//salary-salary*percentage(25%)/100