package homework02;

import java.util.Scanner;

/*안녕하세요. 비트대학입니다.
사용자가 입력한 숫자를 더하다가 끝내고 싶은 순간에 스톱이 되면서 그동안 입력된
숫자값(점수)을 전부 더한 결과값이 나오는 프로그램이 필요합니다.
그런데 교수님께서 자꾸 결과값만 보니까 잘 연산이 되었는지 의심이 된다하시네요.
그래서 결과만 보이지 말고 입력한 값이 전부 보이게 해달랍니다. 

화면은 아래와 같습니다.

더하시려는 숫자를 입력하세요(종료는 -1)
> 50
더하시려는 숫자를 입력하세요(종료는 -1)
> 36
더하시려는 숫자를 입력하세요(종료는 -1)
> 78
더하시려는 숫자를 입력하세요(종료는 -1)
> 77
더하시려는 숫자를 입력하세요(종료는 -1)
> -1
현재까지의 누적값은 50 + 36 + 78 + 77 = 348 이고, 평균은 87 입니다. (소수점이하는 절삭)
*/
public class ScoreCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("점수계산기");
		int count = 0, input = 0;
		//boolean isRun = true;
		int[] numbers = null;
		
		
		
		while(true) {
			//int[] temp = new int[count];
			System.out.print("더하시려는 숫자를 입력하세요(종료는 -1) \n>");
			input = scan.nextInt();
			if(input == -1) {
				break;
								
			}
			
			int[] temp = new int[count];
			//배열임시복사
			for(int i = 0 ;i < count ; i++) {
				temp[i] = numbers[i];
			}
			count++;
			//다시복사
			numbers = new int[count];
			for(int i = 0 ;i < count-1 ; i++) {
				numbers[i]= temp[i];
			}
			
			//numbers = temp;
			
			numbers[count-1] = input;
			
			
			
			
			
			
		}
		//총합, 평균계산
		int sum = 0, avg = 0;
		
		for(int i = 0;i < count ; i++) {
			sum += numbers[i];
			
		}
		avg = sum / count;
		
		
		//출력
		System.out.print("현재까지의 누적값은 ");
		for(int i = 0 ;i < count; i++) {
			if(i == count-1) {
				System.out.printf("%d = ", numbers[i]);
			}
			else {
				System.out.printf("%d + " , numbers[i]);
			}
		}
		System.out.printf("%d 이고 평균은 %d입니다." ,sum , avg);
		
	}

}
