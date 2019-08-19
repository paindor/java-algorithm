package homework03;

public class Student {
	
	
	public String getArithmeticCalculator(String op , int n1, int n2) {
		
		int numResult = 0;
		int rest = 0;
		switch(op) {
		case "+":
			numResult = n1 + n2;
			break;
		case "-": numResult = n1 - n2;break;
		case "*": numResult = n1 * n2; break;
		case "/":numResult = n1 / n2; rest = numResult = n1%n2; break;
		}
		String result = "";
		if(op.equals("/")) {
		
			result = String.format("%d %s %d = %d[%d]", n1,op ,n2, numResult, rest);
			
		}else {
			result = String.format("%d %s %d = %d", n1,op ,n2, numResult);
		}
	
	
		
		
		return result;
		
	}
	
	public String getbmi(String name, double height, double weight) {
		
		double bmi = weight / (height * height);
		String bmiResult = "";
		if(bmi > 30.0) {
			bmiResult = "고도비만";
		}else if(bmi > 25.0) {
			bmiResult = "비만";
		}else if(bmi > 23.0) {
			bmiResult = "과체중";
		}else if(bmi > 18.5) {
			bmiResult = "정상";
			
		}else {
			bmiResult = "저체중";
		}
		
		String result = String.format("mbmi 지수 : %.1f, %s입니다.", bmi, bmiResult );
		
		
		
		return result;
	}
	
	public String howMuch(int price , int num) {
		
		int pay = price * num;
		int fPay = pay - (pay/10);
		String result ="";
		result = String.format("총 %d원입니다. 할인되어서 %d입니다.", pay , fPay);
		return result;
	}
	
	public String join(String id, String pw, String name, String birth, boolean adult, 
			double height, double weight, String blood) {
		
		String result ="";
		result = String.format("아이디: %s \n비밀번호: %s\n이름:%s \n생년월일:%s \n성인여부:%b \n키:%.1f \n 몸무게:%.1f \n혈액형:%s",
				id, pw, name, birth, adult, height, weight, blood);
				
		
		return result;
	}
	
	
	public String getLeapYear(int year) {
		String whatYear = "";
		switch(year %4) {
		case 0:
			if(year %100 ==0) {
				if(year %400 == 0) {
					whatYear ="윤년";
				}
				else {
					whatYear ="평년";
				}
				
			}else {
				whatYear ="윤년";
			}
			break;
		default:
			whatYear = "평년";
			break;
			
		}
		String result = String.format("%d년은 %s입니다.", year, whatYear);
		return result;
	}
	
	public String getMonthEndDay(int month) {
		int day = 0;
		switch(month) {
		case 2: day = 29;
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
			default: day = 31;
			break;
			
		}
		String result = String.format("%d월은 %d일까지입니다.", month,day);
		
		return result;
	}
	
	public String getPassOrFail(String name, int[] scores) {
		for(int i = 0 ; i < 3; i++) {
			scores[3] += scores[i];
			
		}
		String pass = "";
		scores[4] = scores[3]/ 3;
		if(scores[4] >= 90) {
			pass = "장학생";
		}else if(scores[4] >= 70 && scores[4] <90) {
			pass = "합격";
		}else {
			pass = "불합격";
			
			
		}
		
		String result = String.format("성명    국어    영어    수학    총점    평균    합격여부\n ========================================================\n%s   %d   %d   %d   %d   %d   %s ",
				name, scores[0],scores[1],scores[2],scores[3],scores[4], pass);
		return result;
	}
	public String getRank( double[] records) {
		for(int i = 0; i < records.length; i++) {
			for(int j = 0 ; j < records.length -1; j++) {
				if(records[j] > records[j+1]) {
					double tempd = records[j];
					records[j] = records[j+1];
					records[j+1] = tempd;
											
					
				}
			}
		}
		String result ="";
		for(int i = 0 ;i < 3; i++) {
			 result += String.format("%d등 기록 : %.1f \n" , i+1, records[i] );
		}
		
		return result;
	}
	public String getReportCard(String name , int[] scores) {
		String pass = "";
		for(int i = 0; i< 3; i++) {
			scores[3] += scores[i];
		}
		scores[4] = scores[3] / 3;
		if(scores[4] >= 90) {
			pass = "장학생";
		}else if( scores[4] >= 70 && scores[4] <90) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		String result ="";
		result = String.format("이름    국어    영어    수학    총점    평균    합격여부\n%s   %d   %d   %d   %d   %d   %s " , 
				name,scores[0], scores[1],scores[2],scores[3],scores[4], pass);
				
		return result;
	}
	
	public String getScoreCalc(int[] numbers) {
		int sum = 0;
		String result ="";
		for(int i = 0 ; i< numbers.length; i++) {
			
			sum += numbers[i] ;
		}
		int avg = sum / numbers.length;
		for(int i = 0 ; i < numbers.length; i++) {
			if(i == numbers.length-1) {
				 result += numbers[i] + "=";
			}else {
				result += numbers[i] + "+";
			}
		}
		result += String.format("%d이고 평균은 %d입니다.", sum , avg);
		
		return result;
	}
	public String getTax(String name, int income ) {
		double tax = income * (9.7 / 100.0);
		
		String result = String.format("연봉 %d만원을 받는 %s님의 세금은 %.1f만원 입니다.", income, name, tax);
		return result;
	}
	public String getTimeCalc(int time) {
		int min = time/ 60;
		int hour = (time/60) /60;
		int sec = time%60;
		String result = String.format("%d시간 %d분 %d초", hour, min, sec);
		
		
		return result;
	}
	
	

}
