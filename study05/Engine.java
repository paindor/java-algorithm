package study05;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Member member = null;
		Service service = new Service();
		
		while(true) {
			System.out.println("0.종료  1.join   2. 정보보기 3. 아이디찾기   4.BMI   5. 나의성적    6.나의연봉 ");

			switch(scan.nextInt()) {
			case 0:
				return;
				
			case 1:				
				member = new Member();
				System.out.println("회원가입");
				
				System.out.print("아이디:");
				member.setId(scan.next());
				System.out.print("패스워드:");
				member.setPw(scan.next());
				System.out.print("이름:");
				member.setName(scan.next());
				System.out.print("주민번호:");
				member.setSsn(scan.next());
				System.out.print("키:");
				member.setHeight(scan.nextDouble());
				System.out.print("몸무게:");
				member.setWeight(scan.nextDouble());
				System.out.print("혈액형:");
				member.setBlood(scan.next());
				System.out.print("국어점수:");
				member.setKor(scan.nextInt());
				System.out.print("영어:");
				member.setEng(scan.nextInt());
				System.out.print("수학점수:");
				member.setMath(scan.nextInt());
				System.out.print("연봉:");
				member.setSalary(scan.nextInt());
				
				
				
				break;
			case 2:
				System.out.println(member.toString());
				break;
			case 3:
				System.out.println("아이디 이름입력");
				String searchId = scan.next();
				String searchName = scan.next();
				if(searchName.equals(searchId.equals(member.getName()))&& searchId.equals(member.getId())) {
					System.out.printf("찾는id는 %s\n "
							+ "주민번호:%s" ,   member.getId(), member.getSsn());
				}
				else {
					System.out.println("아이디없음");
				}
				break;
			case 4:
				System.out.println("BMI체크");
				System.out.println(service.getBmi(member));
				
				break;
			case 5: 
				System.out.println("성적");
				System.out.println(service.getReportCard(member));
				break;
			case 6:
				System.out.println("너의연봉은");
				System.out.println(service.getTax(member));
				break;
				
				
			}
		}
	}

}
