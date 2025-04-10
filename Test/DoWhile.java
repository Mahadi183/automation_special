package pack1;

public class DoWhile {

	public static void main(String[] args) {
		int i=1;
		do {
			if(i==9) {
				System.out.println("Texas");
			}
			else if(i==21) {
				System.out.println("Virginia");
			}
			else {
				System.out.println(i);
			}
			
			i=i+4;
		}while(i<=21);

	}

}
