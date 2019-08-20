
package study03;

import java.util.Scanner;
import study03.Student;

public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student st = new Student();
		String result ="";
		
		int flag = 0;
		while(true) {
			
			
			System.out.println("0.종료   1.BMI    2.Ranking   3. HowMuch   4.ReportCard");
			flag = scan.nextInt();
			
			switch(flag) {
			case 0: 
				System.out.println("종료");
				return;
			case 1:
				System.out.println("BMI");
				;
				double height = 0.0, weight = 0.0, bmi = 0.0;
				String bmiResult ="";
				System.out.println("BMI체크");
				System.out.print("이름>");
				String name = scan.next();
				System.out.print("체중(kg)>");
				weight = scan.nextDouble();
				
				System.out.print("신장(M)>");
				height =scan.nextDouble();
				result = st.getBmi(name, weight, height);
				System.out.println(result);
				break;
			case 2: 
				System.out.println("Ranking");
				int numOfPlayer = 3;
				//Scanner scan = new Scanner(System.in);
				double[] records = new double[numOfPlayer];
				String[] players = new String[] {"A" , "B" ,"C"};
				
				
				System.out.println("기록입력기");
				for(int i = 0 ;i < numOfPlayer; i++) {
					System.out.printf("%s 선수 기록>", players[i]);
					records[i] = scan.nextDouble();
				}
					
				result = st.getRank(records); 
				break;
			case 3:
				System.out.println("HowMuch");
				
				boolean isRun = true;
				int price = 0, num = 0,  over = 0;
				while(isRun) {
					
					
					System.out.println("자동주문기");
					System.out.println("1.계속  2.종료 ");
					over = scan.nextInt();
					if(over == 2) {
						break;
						
					}
					System.out.print("얼마에요?");
					price = scan.nextInt();
					System.out.printf("%d원 입니다", price);
					System.out.println();
					
					
					System.out.print("몇개드릴까요?");
					
					num = scan.nextInt();
					System.out.printf("%d개 주세요", num);
					//result = price * num;
					
					System.out.printf("총 %d원 입니다." , result);
					//int dc = result / 10;
					//result -= dc; 
					//System.out.printf("10% 할인되어서 %d원입니다." , result);//포맷오류가 발생합니다.			
					System.out.printf("할인되어서 %d원입니다. \n" , result);
					System.out.printf("1. 계속    2. 종료 ");
					over = scan.nextInt();
					if(over == 2) {
						isRun = false;
					}
				}
				System.out.println("프로그램 종료" );
				
				break;
			case 4: 
				System.out.println("ReportCard");
				st.getReportCard();
				break;
			
			
			
			
			}
			switch(flag) {
			case 1:
				break;
			case 3:
				break;
			}
		}

	}

}
