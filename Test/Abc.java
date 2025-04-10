package pack1;

public class Abc {
	
	Abc(){
		System.out.println("This is constructor 1");
	}
	
	Abc(int a){
		System.out.println("This is constructor 2");
		System.out.println("Value is: "+a);
	}

	public static void main(String[] args) {
		Abc obj = new Abc();
		Abc obj1= new Abc(5);

	}

}
