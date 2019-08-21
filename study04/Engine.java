
package study04;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student st = new Student();
		
		while(true) {
			int flag = 0;
			
			
			System.out.println("0.종료   1.bmi");
			
			switch(scan.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("BMI: 이름, 키, 몸무게 입력");
				String name = scan.next();
				double height = scan.nextDouble();
				double weight = scan.nextDouble();
				
				String result = st.getBmi(name, height, weight);
				System.out.println(result);
				break;
				
			case 2:
				//
				System.out.println("%%%%");
				name = scan.next();
				String add = scan.next();
				int age = scan.nextInt();
				int bal = scan.nextInt();
				int bel = scan.nextInt();
				
				
				result =  st.unknown(name, add, age , bal, bel);
				System.out.println(result);
				break;
			}
		}
	}

}
