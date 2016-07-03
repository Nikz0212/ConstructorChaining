public class Student extends Person {

	protected static final int STU_ID = 200;
	int s;
	Student(){
	super(200);
	s=p+100;
		System.out.println("Student Class Default constructor"+s);
	}
	
	Student(int s){
		this();
		this.s=s+p;
		System.out.println("Student Class Parameter Constructor"+this.s);
		System.out.println("**********");
	}
	public void print2(){
		int Stu_ID = STU_ID+PER_ID+200;
		System.out.println("StuID "+Stu_ID);
		//System.out.println("Student");
		System.out.println("Student Class Parameter Constructor "+this.s);
		System.out.println("**** **** ****");
	}
}
