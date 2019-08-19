package homework02;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[5];
		System.out.println("이름입력>");
		String name = scan.next();
		System.out.println("점수입력(국어, 영어, 수학)");
		for(int i = 0 ;i < 3; i++) {
			scores[i] = scan.nextInt();
			
		}
		for(int i = 0 ; i< 3; i++) {
			scores[3]+= scores[i];
			
		}
		scores[4] = scores[3]/ 3;
		
		
		
		
		System.out.println("이름    국어     영어    수학    총점    평균    합격여부");
		System.out.print(name);
		for(int i = 0;i < 5; i++) {
			System.out.printf("%d   %d   %d  %d  %d");
			
		}
		System.out.println();

		
	}

}
