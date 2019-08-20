package homework02;

import java.util.Scanner;

/*월을 입력하면 해당 월이 몇일까지인지
알려주는 프로그램을 작성해 주세요.
단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
출력문장 : "??월은 **일 까지 입니다."
*/

public class MonthEndDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int input = 0, days = 0;
		System.out.print("월을 입력하세요>");
		input = scan.nextInt();
		while(input > 12) {
			System.out.println("잘못된 값입니다");
			System.out.println("재입력해주세요");
			System.out.print("월을 입력하세요>");
			input = scan.nextInt();
		}
		
		switch(input) {
		case 2: days = 29;break;
		case 4:
		case 6:
		case 9:
		case 11: days = 30; break;
		default: days = 31 ; break;
		
			
		}
		
		
		
		
		
		System.out.printf("%d월은 %d일 까지 입니다." , input, days);
	}

}
