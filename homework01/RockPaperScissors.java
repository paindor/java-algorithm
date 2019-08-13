package homework01;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rd  = new Random();
		int player = 0 , com =0;
		String isWin = null , pl, comStr = "";
		
		System.out.println("가위 바위 보!");
		System.out.println("1.가위  2.바위  3.보  4.랜덤");
		player = scan.nextInt();
		
		
		switch(player) {
		case 4: player = rd.nextInt(3)+1;
		
			break;
		}
		com = rd.nextInt(3)+1;
		
		
		
		
		switch(player) {
		case 1: pl = "가위";
		switch(com)
		{
		case 1:  comStr = "가위" ; isWin = "무승부";break;
		case 2:  comStr = "바위" ; isWin = "너의 패배";break;
		case 3:  comStr = "보" ; isWin = "당신의 승리";break;
		
		
		}
		
			break;
		case 2:	
			pl = "바위";
			switch(com)
			{
			case 1:  comStr = "가위" ; isWin = "당신의 승리";break;
			case 2:  comStr = "바위" ; isWin = "무승부";break;
			case 3:  comStr = "보" ; isWin = "너의 패배";break;
			
			
			}
			break;
		case 3:	
			pl = "보";
			switch(com)
			{
			case 1:  comStr = "가위" ; isWin = "너의 패배";break;
			case 2:  comStr = "바위" ; isWin = "당신의 승리";break;
			case 3:  comStr = "보" ; isWin = "무승부";break;
			
			
			}break;
		default:  System.out.println("잘못된 입력");   return;
		
		
		
		
		}
				
		System.out.println(String.format("                         com> %s", comStr));
		
		System.out.println(String.format("             %s", isWin ));
		
		System.out.println(String.format("당신:> %s", pl ));
		
		

	}

}
