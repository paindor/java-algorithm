package study06;
import java.util.Scanner;
public class Engine {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		int a = 4;
		while(true) {
			System.out.println("0.종료 1.회원가입 2.정보보기 3.아이디찾기 4.BMI");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 :
				member = new Member();
				System.out.println("회원가입");
				System.out.println("아이디");
				member.setId(scanner.next());
				System.out.println("비밀번호");
				member.setPw(scanner.next());
				System.out.println("이름");
				member.setName(scanner.next());
				System.out.println("주민번호");
				member.setSsn(scanner.next());
				System.out.println("키");
				member.setHeight(scanner.nextDouble());
				System.out.println("몸무게");
				member.setWeight(scanner.nextDouble());
				System.out.println("혈액형");
				member.setBlood(scanner.next());
				System.out.println("국어점수");
				member.setKor(scanner.nextInt());
				break;
			case 2: 
				System.out.println(member.toString());
				break;
			case 3:
				System.out.println("아이디, 이름을 입력하면 비번과 주민번호 알려줌");
				String searchName = scanner.next(); 
				String searchId = scanner.next();
				if(searchName.equals("a") &&
						searchId.equals("a")) {
					System.out.printf("찾는 아이디 : %s \n"
							+ "주민번호: %s \n",member.getId(), member.getSsn());
				}else {
					System.out.println("찾는 아이디가 없습니다.");
				}
			case 4:
				System.out.println("BMI 구하기");
				System.out.println(service.getBmi(member));
				break;
			}
		}
	}
}