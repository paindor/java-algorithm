package homework03;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Student st = new Student();
		
		int choice = 0;
		String result = "";
		
	
		while(true) {
			choice = scan.nextInt();
			switch(choice) {
			case 0: System.out.println( "종료");return;
			case 1:
				int n1 = 0, n2 = 0 ;
				String op="";// ArithmeticCalculator
				System.out.println("연산기");
				System.out.print("연산 입력>");
				n1 = scan.nextInt();
				op = scan.next();
				n2 = scan.nextInt();
				result = st.getArithmeticCalculator(op, n1, n2);
				System.out.println(result);
								
				break;
			case 2:
				double height = 0.0 , weight = 0.0;
				String name ="";
				
				System.out.println("BMI");// bmi
				System.out.print("이름>");
				name = scan.next();// bmi
				System.out.print("키(m)>");// bmi
				height = scan.nextDouble();
				System.out.print("체중(kg)>");
				weight = scan.nextDouble();// bmi
				result = st.getbmi(name, height, weight);
				System.out.println(result);
				break;
			case 3:
				int price = 0, num = 0;
				System.out.println("howmuch");//HowMuch
				System.out.print("얼마에요?");
				price = scan.nextInt();//HowMuch
				System.out.println("몇개드릴까요?");
				num = scan.nextInt();//HowMuch
				result = st.howMuch(price, num);
				System.out.println(result);
				break;
			case 4:				//join
				String id = "", pw = "", blood = "", birth ="" ;
				boolean adult = true;
				System.out.println("회원가입");
				
				System.out.print("아이디:");
				id = scan.next();
				System.out.print("패스워드:");
				pw = scan.next();
				System.out.print("이름:");
				name = scan.next();
				System.out.print("생년월일:");
				birth = scan.next();
				System.out.print("성인여부:");
				adult = scan.nextBoolean();
				System.out.print("키:");
				height = scan.nextDouble();
				System.out.print("몸무게:");
				weight = scan.nextDouble();
				System.out.print("혈액형:");
				blood = scan.next();
				result = st.join(id, pw, name, birth, adult, height, weight, blood);
				System.out.println(result);
				
				break;
			case 5:
				int year = 0;//leapyear
				System.out.println("윤년계산기");
				System.out.print("몇년?>");
				year = scan.nextInt();
				result = st.getLeapYear(year);
				System.out.println(result);
				break;
			case 6:				//monthEndDay
				System.out.println("몇일까지");
				System.out.print("몇월?>");
				int month = scan.nextInt();
				result = st.getMonthEndDay(month);
				
				System.out.println(result);
				break;
			case 7:
				int[] scores = new int[5];
				System.out.print("점수입력>");  // pass or fail
				System.out.print("이름>");
				// pass or fail
				name = scan.next();
				
				System.out.print("국어, 영어, 수학>");  // pass or fail
				for(int i = 0 ;  i < 3; i++) {
					scores[i] = scan.nextInt();
				}
					
				result = st.getPassOrFail(name, scores);
				System.out.println(result);
				break;
			case 8:   // rangking
				double[] d = new double[3];
				System.out.println("기록측정");
				
				for(int i = 0 ; i < 3; i++) {
					System.out.println("기록입력");
					d[i] = scan.nextDouble();
					
				}
				
				result = st.getRank(d);
				
				System.out.println(result);
				break;
			case 9:   //report card
				System.out.println(result);
				break;
			case 10: // score calc
				System.out.println(result);
				break;
			case 11: //tax
				System.out.println(result);
				break;
			case 12: //time calc
				System.out.println(result);
				break;
			
				
			
			}
		}

	}

}
