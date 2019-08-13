package step1;
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
			
	
			if(flag2 == 0)
			{
				break;
				
			}
			
			
		}
		System.out.print("while종료");
		

	}

}
