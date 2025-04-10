package pack1;

public class Array {

	public static void main(String[] args) {
		int[] numbers=new int[10];
		numbers[5]=23;
		numbers[7]=35;
		numbers[9]=10;
		System.out.println(numbers[7]);
		System.out.println(numbers[5]);
		System.out.println(numbers[7]+numbers[5]);
		System.out.println(numbers[5]-2+numbers[7]+10);
		//System.out.println(numbers[9]/0+numbers[5]-23);
		System.out.println(0/numbers[7]+numbers[5]-23);
		
		

	}

}
