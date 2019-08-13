package study01;
import java.util.Scanner ;

public class Print5Times {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("진행 1     스톱 0");
		int flag = scan.nextInt();
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("안녕");
			
			System.out.println("진행 1     스톱 0");
			int flag2 = scan.nextInt();
			
			switch(flag2) {
			case 0:System.out.println("시스템종료");
			return;
			case 1: System.out.println("계속진행");
			break;
			
			
			}
			
		}
		//System.out.print("while종료");
		

	}

}
