package pack1;

import java.util.*;

public class Visit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Budget: ");
		int money = sc.nextInt();
		if(money>=5000 && money<=10000) {
			System.out.println("You can visit Texas");
		}
		else if(money>10000 && money<=15000) {
			System.out.println("you can visit Canada");
		}
		else if(money>15000 && money>=20000) {
			System.out.println("you can visit Switzerland");
		}
		else {
			System.out.println("you can't visit anywhere");
		}
		

	}

}
