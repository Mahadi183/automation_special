package pack1;

public class Method_Overloading {
	
	public void sum() {
		System.out.println("This is method 1");
	}
	public void sum(int a) {
		System.out.println("This is method 2");
	}
	public void sum(int a,int b) {
		System.out.println("Sum of 2 numbers are; "+(a+b));
	}
	
	

	public static void main(String[] args) {
		Method_Overloading obj= new Method_Overloading();
		int a=5,b=10;
		obj.sum();
		obj.sum(20);
		obj.sum(a,b);

	}

}
