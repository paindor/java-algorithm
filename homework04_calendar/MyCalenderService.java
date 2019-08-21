package homework04_calendar;

public class MyCalenderService {

	public String getEndDay(MyCalender mc) {
	
		String end = "";
		switch(mc.getMonth()) {
		case 2:
			end = "29일";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			end = "30일";
			break;
		default:
			end = "31일";
				break;
		}
		return end;
		
	}
	public String isLeapYear(MyCalender mc) {
		String isLeap = "";
		switch(mc.getYear()% 4) {
		case 0:
			if(mc.getYear() %100 == 0) {
				if(mc.getYear()%400 == 0) {
					isLeap = "윤년";
				}
				else{isLeap = "평년";}
			}
			isLeap = "윤년";
			break;
			
		default:
			isLeap ="평년";
			break;
		}
		return isLeap;
		
	}
}
