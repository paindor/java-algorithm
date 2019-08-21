package study06;

public class Service {
	public String getBmi(Member member) {
		String result = "정상";
		String name = member.getName();
		double height = member.getHeight();
		double weight = member.getWeight();
		return result;
	}
	public String getReportCard(Member member) {
		String result = "";
		int kor = member.getKor();
		return result;
	}
	public String getTax(Member member) {
		String result = "";
		
		return result;
	}
}