package pack1;

public class Main {
	
	//create a method
	public int sum(int a,int b,int c) {
		int result= a+b+c;
		return result;
	}
	
	public int sub(int num1,int num2) {
		int res= num1-num2;
		return res;
	}
	

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		int c=30;
		
		Main sc= new Main();
		Summation obj = new Summation();
		System.out.println("Sum is: "+sc.sum(a,b,c));
		System.out.println("Subtraction is: "+sc.sub(20,10));
		System.out.println(obj.num1);
		

	}

}
