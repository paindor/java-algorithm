package homework02;
/*프로그램을 하나 개발해야 합니다.
교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
몫과 나머지값으로 출력하면 된답니다.
출력결과물은 예를 들어
5 + 5 = 10
2 - 7 = -5
이렇게 되고,
10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.*/
import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String op ="" , input = "";
		int result = 0;
		int[] num;
		num = new int[4];
		//입력 
		System.out.println("계산기");
		System.out.print("연산선택>");
		op = scan.next();
		for(int i = 0 ;i <num.length-1; i++) {
			if(i < 2) {
				System.out.printf("숫자입력 %d>", i+1);
				num[i] = scan.nextInt();
			}
			else {
				switch(op) {
				case "+": num[i] = num[i-2] + num[i-1]; break;
				case "-": num[i] = num[i-2] - num[i-1]; break;
				case "*": num[i] = num[i-2] * num[i-1]; break;
				case "/": num[i] = num[i-2] / num[i-1]; break;
				
				}
				
			}
			
			
			
		}
		if(op.equals("/")) {
			num[num.length-1] = num[0] % num[1];
			
		}
		
		switch(op) {
		case "/": System.out.printf("%d %s %d = %d [%d]" , num[0], op, num[1], num[2], num[3] ); break;
		default:System.out.printf("%d %s %d = %d"  , num[0], op, num[1] , num[2] ); break;
		
		}

		
	}

}
