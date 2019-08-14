package study02;
import java.util.Scanner;

public class OddSequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 9 
		//2 4 6 8 10 
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		String eval = "";
		System.out.print("숫자입력1>");
		int start = scan.nextInt();
		System.out.print("숫자입력2>");
		int end = scan.nextInt();
		/*while(num < 0) {
			System.out.println("잘못된입력");
			System.out.print(" 숫자입력>");
			num = scan.nextInt();
		}*/
		if(start > end) {
			int temp = start;
			start = end;
			end = temp;
		}else if(start ==  end){
			System.out.println("잘못된입력");
			
			
		}
		
		for(int i = start ; i <= end ; i++ ){
			if(i % 2 !=  0){
				int end2 = 0;
				if(end % 2 == 0) {
					end2 = end-1;
				}else {
					end2 = end;
					
				}
				
				sum += i;
				
				
				
				
				
				eval += (i >= end-1 ) ? i + " = " : i+" + ";
				
				//System.out.print(sum + "  ");
			
				
			}
			//eval += (i == 10 ) ? i + " = " : i+" + ";
			
			//ystem.out.print(eval + sum);
			
		}
		System.out.print(eval+sum);
		
	}

}
