
package homework02;
/*여기는 비트헬스 입니다.
입력받을 정보는 아래와 같습니다.
값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
프로그램을 보여주세요
=== 회원가입 ===
아이디 : 
비밀번호 : 
이름 : 
생년월일(예) 1980-01-01 : 
성인여부(성인true,미성년false) : 
키(소수점 첫째자리까지) :
몸무게(소수점 첫째자리까지) : 
혈액형(A) : 
입력이 종료되면 ...아래처럼 보이게 해주세요
=== 회원정보 ===
아이디 : hong
비밀번호 : 1234
이름 : 홍길동
생년월일(예) 1990-05-05 : 
성인여부(성인true,미성년false) : 성인
키(소수점 첫째자리까지) : 178.5 cm
몸무게(소수점 첫째자리까지) : 75kg
혈액형(A) : B형
*/

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String id = "", pw = "", name = "", birth = "", blood ="";
		double height = 0, weight = 0;
		boolean isAdult = true;
		
		System.out.println("==== 회원가입 ====");
		//정보입력
		System.out.print("아이디:>");
		id = scan.next();
		System.out.print("비밀번호>");
		pw = scan.next();
		System.out.print("이름>");
		name = scan.next();
		System.out.print("생년월일(예) 1980-01-01 >");
		birth = scan.next();
		
		System.out.print("성인여부(성인true, 미성년false)>");
		isAdult = scan.nextBoolean();
		System.out.print("키(소수점 첫째자리까지)>");
		
		height = scan.nextDouble();
		System.out.print("몸무게(소수점 첫째자리까지)>");
		weight = scan.nextDouble();
		double weightIs = Math.round((weight*100)/100.0);
		System.out.print("혈액형(A)>");
		blood = scan.next();
		//출력
		System.out.println("==== 회원정보 ====");
		System.out.printf("아이디:%s \n비밀번호: %s \n이름: %s \n생년월일: %s \n성인여부: %s \n키: %.1f \n몸무게: %.1f \n혈액형: %s",
				id, pw, name, birth, ((isAdult)? "성인" : "미성년"), height, weightIs, blood );
		
		

	}

}

