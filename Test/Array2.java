package pack1;

public class Array2 {

	public static void main(String[] args) {
		int[] numbers= {10,31,330,45,50};
		int min=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min=numbers[i];
			}
		}
		System.out.println("Minimum number is: "+min);
		

	}

}
