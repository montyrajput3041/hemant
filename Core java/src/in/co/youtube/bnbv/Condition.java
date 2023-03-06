package in.co.youtube.bnbv;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age <18){
			System.out.println("HE is ADULT");
			
		} else {
			System.out.println("18 ke bad pina chalu kiya");
		}
	}

}
