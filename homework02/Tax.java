package homework02;
/*클라이언트에서 프로그램 개발 요청이 왔습니다.
이름과 연봉을 입력받아서
연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원입니다.
로 출력하는 프로그램을 만들어 주세요.
단) 세율이 정책이 바뀔 때 마다 변하니,
관리자가 쉽게 적용가능하도록 만들어 주세요.
현재는 세율이 9.7프로라고 합니다.
*/
import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double taxRate = 9.7 ;
		String name = "";
		int income = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("이름입력>");
		name = scan.next();
		System.out.println("연봉입력(단위:만원)>");
		income = scan.nextInt();
		double tax = (double)income * (taxRate / 100);
		//double taxResult = Math.round((tax*10 ) / 10.0);
		//Math.round메소드를 사용하면 소숫점이 0으로 바뀌고 56.00000이런식으로 나옵니다.
		
		
				
		System.out.printf("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.1f만원입니다." , income, name, tax);
		//System.out.printf("연봉" + income +"만원을 받으시는 " + name + "님께서 납부할 세금은" + tax+"만원입니다.");
		
	}

}
