package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "kaviya", 50000, 23, "female", 5);
		Employee emp2 = new Employee(2, "ram", 3000, 24, "male", 4);
		Employee emp3 = new Employee(3, "kavi", 2000, 34, "female", 7);
		Employee emp4 = new Employee(4, "ravi", 5000, 26, "male", 8);
		HashMap<Integer, Employee> emps = new HashMap<>();
		emps.put(emp1.getempid(), emp1);
		emps.put(emp2.getempid(), emp2);
		emps.put(emp3.getempid(), emp3);
		emps.put(emp4.getempid(), emp4);
//		System.out.println(emps.values());
//		System.out.println(emps.keySet());
//		System.out.println(emps.get(2));
//		System.out.println(emps.remove(4));
		//age
//		for (Employee a : emps.values()) {
//			if (a.getage() > 30) {
//				System.out.println(a);
//			}
//		}
		//gender
//		emps.values().forEach(x -> {
//			if (x.getgender().equals("female")) {
//				System.out.println(x);
//			}
//		});
		//print experience
//		for(Integer x:emps.keySet()) {
//			if(emps.get(x).getexperience()>5) {
//				System.out.println(emps.get(x));
//			}
//		}
		//age salary
//		emps.values().forEach(x->{
//			if(x.getage()>20 && x.getexperience()>2) {
//				x.setempsalary(x.getempsalary()+(x.getempsalary()*10/100));
//				System.out.println(x);
//			}
//		});
		//maximum salary
//		int max=0;
//		for(Employee x:emps.values()) {
//			
//			if(x.getempsalary()>max) {
//				max=x.getempsalary();
//			}
//		}
//		//print using keyset
//		System.out.println(max);
//		for(Integer x:emps.keySet()) {
//			System.out.println(emps.get(x));
	//	} 
		//Iterators
		Iterator <Employee> data=emps.values().iterator();
		while(data.hasNext()) {
			if(data.next().getage()>20) {
				data.remove();
			}
		}
		System.out.println(emps.values());
//		for(Integer  x:emps.keySet()) {
//			if(emps.get(x).getempname().length()>5) {
//				System.out.println(emps.get(x));
//			}
//		}
		
//     //key and values	
//		emps.forEach((x,y)->{
//			if(y.getgender().equals("female")) {
//				System.out.println("keys : "+x+" "+"values : "+y);
//			}
//		});
//		//vowels
//	   for(Integer x:emps.keySet()) {
//		   if(emps.get(x).getempname().contains("a")||emps.get(x).getempname().contains("e")||emps.get(x).getempname().contains("i")||emps.get(x).getempname().contains("o")||emps.get(x).getempname().contains("u")) {
//			   
//			   System.out.println(emps.get(x));
//		   }
//	   }
//	   //length even
//	   for(Integer x:emps.keySet()) {
//		   if(emps.get(x).getempname().length()%2==0) {
//			   System.out.println(emps.get(x));
//		   }
//	   }
//	   //age experience even
//	   for(Integer x:emps.keySet()) {
//		   if(emps.get(x).getage()%2==0 && emps.get(x).getexperience()%2==0) {
//			   System.out.println(emps.get(x));
//		   }
//		
//	   }
//	   prime or not
//		  for(Integer x:emps.keySet()) {
//			  boolean a=true;  
//		for(int i=2;i<x;i++) {
//	   if(x%i==0) {
//			   a=false;
//		   }
//		   
//	   }
//	   if(a==true) {
//		   System.out.println(" is a prime");
//	   }
//	   else {
//		   System.out.println(" is a not prime");
//	   }
//	}
		//key
//		HashMap<Integer,Employee> newemp=new HashMap<>();
//		for(Integer a:emps.keySet()) {
//		if(emps.get(a).getexperience()>2) {
//				emps.get(a).setempname(emps.get(a).getempname().toUpperCase());
//				
//				newemp.put(a,emps.get(a));
//			}
//		}
 //     System.out.println(newemp);
//     for(Integer x:newemp.values()) {
//    	 if(emps.get(x).getexperience()>2) {
//				emps.get(x).setempname(emps.get(x).getempname().toUpperCase());
//				
//				newemp.put(x,emps.get(x));
//			}
//    	 
//     }
}
}