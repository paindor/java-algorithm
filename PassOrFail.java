package homework02;

import java.util.Scanner;

public class PassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[5];
		String pass ="" , name = "";
		System.out.print("이름입력>");
		name = scan.nextLine();
		
		System.out.println("점수입력(국, 영, 수)");
		
		//name = scan.nextLine();
		for(int i = 0 ;i < 3; i++) {
			System.out.print("점수입력>");
			scores[i] = scan.nextInt();
			
		}
		scores[3] = scores[0] + scores[1] + scores[2];
		scores[4] = scores[3] / 3;
		if(scores[4] >= 90) {
			pass = "장학생";
		}else if(scores[4] >= 70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		System.out.println("학생    국어    영어    수학    총점    평균    합격여부");
		System.out.println("=====================================");
		System.out.printf("%s  ",name);
		for( int i = 0 ; i < scores.length; i++) {
			System.out.printf("%d   ",scores[i]);
			
		}
		System.out.print(pass);

	}

}
