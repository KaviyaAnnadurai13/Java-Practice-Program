package arraylist;

import java.util.ArrayList;

public class UseEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee("kaviya", 20, 3000, "female", "day");
		Employee emp2 = new Employee("kavi", 25, 6000, "female", "night");
		Employee emp3 = new Employee("ram", 28, 90000, "male", "day");
		Employee emp4 = new Employee("ravi", 29, 10000, "male", "night");
		Employee emp5 = new Employee("thabanya", 22, 20000, "female", "day");
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
//		System.out.println(emp);
//		for (int i = 0; i < emp.size(); i++) {
//			System.out.println(emp.get(i));
//		}
//		for (Employee a : emp) {
//			if (a.getgender().equals("female")) {
//				System.out.println(a);
//			}
//			emp.forEach(x -> {
//				if (x.getsalary() >= 10000) {
//					System.out.println(x);
//				}
//			});

//			emp.forEach(x -> {
//				if (x.getgender().equals("male")) {
//					x.setsalary(x.getsalary() + x.getsalary() * 25 / 100);
//
//				}
//			});
//			System.out.println(emp);
			ArrayList<Employee> nightshift = new ArrayList<>();
			for (int i = 0; i < emp.size(); i++) {
				if (emp.get(i).getshift().equals("night")) {
					nightshift.add(emp.get(i));
				}
			}
			System.out.println(nightshift);

		}

	}

//}
