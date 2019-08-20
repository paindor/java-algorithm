

package study03;

import java.util.Scanner;

public class Student {
// bmi, rangking, howmuch, reportCard
	
	public String getBmi(String name, double weight, double height) {
		Scanner scan = new Scanner(System.in);
		
		
		double bmi = weight / (height * height);
		
		String bmiResult ="";
		
		
		if(bmi > 30.0) {
			bmiResult ="고도비만";
		}else if(bmi > 25.0 && bmi <= 30.0) {
			bmiResult = "비만";
		}else if(bmi > 23.0 && bmi <= 25.0) {
			bmiResult = "과체중";
		}else if(bmi > 18.5) {
			bmiResult = "정상";
		}else if(bmi <= 18.5) {
			bmiResult = "저체중";
			
		}
		String result = String.format("%s의 bmi는 %s 입니다.", name, bmiResult);
		
		
		return bmiResult;
		
	}
	
	public String getRank(double[] records) {
		
		//정렬
		for(int i = 0 ;i < 3 ; i++) {
			for(int j = 0 ;  j <3 -1; j++ ) {
				if(records[j] > records[j+1] ) {
					double tempDB = records[j];
					records[j] = records[j+1];
					records[j+1] = tempDB;
					
										
				}
			}
		}
		
		
		
		
		
		//출력
		//for(int i = 0; i < numOfPlayer; i++) {
		//	System.out.printf("%d등: %s: 선수기록(%.1f) \n", i+1, players[i], records[i]   );
	//	}
		return "등수를 계산중";
	}
	
	public String howMuch(int price , int num) {
		
		int pay = price *100;
		
		int dc = pay / 10;
		
		int fPay = pay - dc;
		
			
		String result = String.format("%d원입니다, 할인된가격은 %d입니다,", pay, fPay);
		
			
			
			
			
			
		
		
		return result;
	
	}
	
	public void getReportCard() {
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
