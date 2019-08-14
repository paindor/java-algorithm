package study02;
import java.util.Scanner;
public class EvenSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 4 6
		
		Scanner scan = new Scanner(System.in);
		String result = "";
		int sum = 0;
		int st = 0 ; int end = 0;
		System.out.print("값입력1>");
		st = scan.nextInt();
		System.out.print("값입력2>");
		end = scan.nextInt();
		// 10 
		//9 
		if( st > end) {
			int temp = st;
			st = end;
			end = temp;
			
		}
		
		for( int i = st ; i <= end ; i++) {
			
			if(i % 2 == 0) {
				int end2 = 0;
				if(end % 2 == 0) {
					end2 = end;
				} else {
					end2 = end -1;
					
				}
				if(i == end2) {
					result += i + "=";
				} else {
					result += i + "+";
					
				}
				sum += i;
				
			}
		}
		System.out.println(result + sum);
		

	}

}
