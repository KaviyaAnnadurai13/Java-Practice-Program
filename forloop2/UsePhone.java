package forloop2;

public class UsePhone {
	public static void main(String[] args) {
	Phone p1=new Phone();
	p1.brand="vivo";
	p1.price=55000;
	p1.color="blue";
	p1.rating=3.2f;
	p1.year=2018;
	Phone p2=new Phone();
	p2.brand="redmi";
	p2.price=9000;
	p2.color="pink";
	p2.rating=4.2f;
	p2.year=2015;
	Phone p3=new Phone();
	p3.brand="honor";
	p3.price=5000;
	p3.color="skyblue";
	p3.rating=3.5f;
	p3.year=2012;
	
	Phone[] phones= {p1,p2,p3};
     Phone max=phones[0];
     int totalprice=0;
//	for(int i=0;i<phones.length;i++){
		/*if(phones[i].price<=10000) {
			System.out.println(phones[i].brand);
		}*/
	/* if(phones[i].brand.length()%2!=0) {
			System.out.println(phones[i].brand);*/
		
	//System.out.println(phones[i].brand+" "+phones[i].price+" "+phones[i].color+" "+phones[i].rating+" "+phones[i].year);
	//if(phones[i].price>max.price) {
		//max=phones[i];
	//}
		//System.out.println(max.brand+" "+max.price+" "+max.color+" "+max.rating+" "+max.year);
		
		//if(phones[i].brand.length()>max.brand.length()) {
		     //max=phones[i];
		//}
		//System.out.println(max.year);
		//if(phones[i].price>30000 && phones[i].rating<3.5 ) {
			//System.out.println(phones[i].price);
//		for(int i=0;i<phones.length;i++){
//		int totalprice1 = totalprice1+phones[i].price;
//		}
//		if(phones[i].brand.length()<5 && phones[i].price>50000) {
//			System.out.println(phones[i].brand);
//		}
	
	for(int i=0;i<phones.length;i++) {
		totalprice=totalprice+phones[i].price;
		
	}
	System.out.println(totalprice);
		
	}
	

	}

