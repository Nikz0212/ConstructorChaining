public class Employee extends Student {

	int e;
	Employee(){
		super(300);
		e=s+200;
		System.out.println("Employee class Default Constructor"+e);
	}
	
	Employee(int e){
		this();
		this.e=e+s;
		
		System.out.println("Employee Class Parameter Constructor"+this.e);
		System.out.println("**********");
	}
	
	public void print3(){
		int EmpID = STU_ID + PER_ID + 300;
		System.out.println("EmpID "+EmpID);
	//	System.out.println("Employee ");
		System.out.println("Employee Class Parameter Constructor "+this.e);
		System.out.println("**** **** ****");
	}

	
}
