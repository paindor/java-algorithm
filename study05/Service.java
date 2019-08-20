package study05;

public class Service {

	public String getBmi(Member member) {
		String result ="";
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		double bmi = member.getWeight() / (member.getHeight() * member.getHeight());
		String bmiCheck ="";
		if (bmi >30) {
			bmiCheck = "고도비만";
		}else if(bmi > 25) {
			bmiCheck = "비만";
		}else if(bmi > 23) {	
			bmiCheck = "과체중";
		}else if(bmi >18.5) {
			bmiCheck = "정상";
		}else {
			bmiCheck = "저체중";
		}
		result = String.format("bmi 수치는 %.1f , %s입니다."  , 
				bmi, bmiCheck);
		
		
		return result;
		
		
	}
	public String getReportCard(Member member) {
		String result = "";
		String pass = "";
		int sum = member.getEng() + member.getKor()+ member.getMath();
		int avg = sum / 3;
		if(avg >= 90) {
			pass = "장학생";
		}else if(avg >=70) {
			pass = "합격";
		}else {
			pass = "불합격";
		}
		result = String.format("이름    국어    영어    수학    총점    평균    합격여부\n%s   %d   %d   %d   %d   %d   %s", 
				member.getName(), member.getKor(), member.getEng(), member.getMath(), sum, avg, pass);
		
		return result;
		
	}
	public String getTax(Member member) {
		String result = "";
		double tax = member.getSalary() * 0.097;
		result = String.format("%d만원을 받으시는 %s님의 세금은 %.1f만원입니다.",member.getSalary(), member.getName(), tax);
		return result;
		
		
	}
}
