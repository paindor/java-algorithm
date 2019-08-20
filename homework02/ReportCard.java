<<<<<<< HEAD
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
=======
package homework02;
/*성적표 프로그램 을 하나 개발해야 합니다.
교수는 학생과 국어, 영어, 수학점수만 입력하면
총점, 평균, 합격여부가 출력되는 프로그램 입니다.
오더는 다음과 같이 화면에 출력하라고 합니다.

학생           국어        영어        수학        총점        평균        합격여부
=======================================================
홍길동     90       90      90     270      90       (장학생)

합격여부는 다음과 같다고 합니다.
평균이 90점 이상이면 장학생
0점 이상 90점미만 이면 합격
70미만이면 불합격이라고 하네요.
단) 평균에서 소수점이하는 절삭입니다.
*/
import java.util.Scanner;



public class ReportCard {

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
>>>>>>> edf155587dc3f98ab857f16dfbb8e7df07d876bf
