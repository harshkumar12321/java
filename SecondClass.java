public class SecondClass {


    static int a = 13;
	public static void main(String []args) {
	
		//System.out.println("Inside the Second Class");
		//Third t = new Third();
		//t.fun();
		//System.out.println(a);
		//fun(12);
		SecondClass s = new SecondClass();
		s.fun(12);
	
	}
    
     void fun(int a) {
		System.out.println(a);
		System.out.println(this.a);
	}

}




class Third {

	int a = 10;
	int b = 20;
	
	
	void fun() {
		System.out.println("Calling the function from the Third Class");
	}
	

}