package homework01;

import java.util.Scanner;

public class GenderChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sex = null , ssn, period = "";
		int num =0;
		
		System.out.print("주민등록번호 입력>");
		ssn = scan.next();
		
		num = Integer.parseInt(ssn.substring(7,8));
		
		
		switch(num) {
		case 0: period = "1800 ~ 1899" ; sex = "여성";break;
		case 1: period = "1900 ~ 1999" ; sex = "남성";break;
		case 2: period = "1900 ~ 1999" ; sex = "여성";break;
		case 3: period = "2000 ~ 2099" ; sex = "남성";break;
		case 4: period = "2000 ~ 2099" ; sex = "여성";break;
		case 5: period = "1900 ~ 1999" ; sex = "외국인 남성";break;
		case 6: period = "1900 ~ 1999" ; sex = "외국인 여성";break;
		case 7: period = "2000 ~ 2099" ; sex = "외국인 남성";break;
		case 8: period = "2000 ~ 2099" ; sex = "외국인 여성";break;
		case 9: period = "1800 ~ 1899" ; sex = "남성";break;
		
		
		
		}
		
		System.out.println(String.format("%s년에 태어난 %s", period, sex));
		
		
		
		
	}

}
