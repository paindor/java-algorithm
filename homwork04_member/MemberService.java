package homwork04_member;

public class MemberService {
	
	public String getBmi(Member mem) {
		String result = "";
		
		double bmi = mem.getWeight() /( mem.getHeight() * mem.getHeight());
		
		String bmiR = "";
		if(bmi > 30) {
			bmiR = "고도비만";
		}else if(bmi > 25) {
			bmiR = "비만";
		}else if(bmi > 23) {
			bmiR = "과체중";
		}else if(bmi > 18.5) {
			bmiR = "정상";
		}else {
			bmiR = "저체중";
		}
		
		result = String.format("bmi지수 : %.1f , %s", bmi, bmiR);
		


		
		return result ;
		
	}
	public String getTax(Member mem) {
		String result = "";
		double tax = mem.getIncome() * 0.097;
		result = String.format(" %d만원을 받는 %s님의 세금은 %.1f만원입니다." ,mem.getIncome(), mem.getName(), tax);
		return result;
		
	}

}
