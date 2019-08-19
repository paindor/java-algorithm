package homework02;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input =0;
		String month ="";
		
		System.out.println("몇년 ?");
		input = scan.nextInt();
		int result = input %4;
		
	
		
		System.out.printf("%d년은 %s입니다.");
	

	}

}
