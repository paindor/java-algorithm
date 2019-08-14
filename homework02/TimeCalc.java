package homework02;
import java.util.Scanner;


/*초단위로 알려주는 시험이 있는데
이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.*/


public class TimeCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0, min = 0 , hour = 0, sec = 0;
		
		System.out.println("시간계산기");
		while(true) {
			System.out.println("값을 입력하세요>");
			num = scan.nextInt();
			
			min = num / 60;
			hour = (num /60) / 60;
			sec = num % 60;
			
			System.out.printf("%d시간 %d분 %d초 ", hour, min , sec);
			System.out.print("계속입력: 아무버튼 , 종료: 0");
			num = scan.nextInt();
			if(num == 0 ) {
				return;}
			
		}
		
		
		
		
		
		
		//System.out.println(sec);
	}

}
