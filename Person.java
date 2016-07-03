public class Person {
	protected static final int PER_ID = 100;
	int p;
	Person(){
		//super();
		p=100;
		System.out.println("Person Class Default Constructor"+p);
	}
	
	Person(int p){
		this();
		this.p=p;
		System.out.println("Person Class Parameter Constructor"+this.p);
		System.out.println("**********");
	}
	
	public void print1 (){
	
	int PerID=PER_ID;
	System.out.println("PerID "+PerID);
		//System.out.println("Person");
		System.out.println("Person Class parameter Constructor " +this.p);
		System.out.println("**** **** ****");
	}
}
