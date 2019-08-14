package study02;
import java.util.Scanner;

import javax.security.auth.Subject;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] subjects = {"국어", "영어", "수학", "과학", "사회"};
		int[] scores = new int[5];
			
		for( int i = 0; i < subjects.length ; i++) {
			System.out.printf("%s 입력>" , subjects[i] );
			scores[i] = scan.nextInt();
			
		}
		int socie = scan.nextInt();
		
		
		//int[] scores = {kor, eng, math, sci, socie};
		for( int i = 0 ; i < scores.length; i++) {
			System.out.printf("%s 점수:  %d" , subjects[i], scores[i] );
			
		}
		

	}

}
