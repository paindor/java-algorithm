package study01;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;
public class Month {

	public static void main(String[] args) {
		
		//t month = 1;
		Scanner scan = new Scanner(System.in);
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String now = sdf.format(dt);
		System.out.println(dt);
		System.out.println(now);
		
		
		System.out.print("몇월이냐?>");
		// month = scan.nextInt();
		//String month = now.substring(6, 7);
		int imonth = Integer.parseInt(now.substring(6,7));
		
		String eval = "";
		switch(imonth) {
		case 1 : 
			eval = "1월";
			break;
		case 2:
			eval = "2월";
			break;
		case 3:
			eval = "3월";
			break;
		case 4:
			eval = "4월";
			break;
		case 5:
			eval = "5월";
			break;
		case 6:
			eval = "6월";
			break;
		case 7:
			eval = "7월";
			break;
		case 8:
			eval = "8월";
			break;
		case 9:
			eval = "9월";
			break;
		case 10:
			eval = "10월";
			break;
		case 11:
			eval = "11월";
			break;
		case 12:
			eval = "12월";
			break;
			
		default:
			System.out.println("잘못된입력");
			break;
		
		}
		System.out.println(eval);
		
		
		
		
	}

}
