package pack1;

public class Constructor {
	
	Constructor(int a,int b){
		System.out.println("Sum of 2 numbers are: "+(a+b));
	}
	

	public static void main(String[] args) {
		int num1=3,num2=8;
		Constructor obj= new Constructor(num1,num2);
		

	}

}
