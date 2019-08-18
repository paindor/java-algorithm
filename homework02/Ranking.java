package homework02;

import java.util.Scanner;

/*저희는 비트올림픽 위원회입니다.
한번의 트랙에서 육상선수는 총 3명 입니다.
총 세명의 100m 기록을 입력받아서 
1, 2, 3 등을 가려야 합니다.

A 선수 기록 : 10.5초
B 선수 기록 : 10.8초
C 선수 기록 : 10.1초 
라고 입력받았다면

###### 성적 랭킹 #######

1등 : C 선수 기록 (10.1초)
2등 : A 선수 기록 (10.5초)
3등 : B 선수 기록 (10.8초)

라고 출력시켜주세요.
*/

public class Ranking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfPlayer = 3;
		Scanner scan = new Scanner(System.in);
		double[] records = new double[numOfPlayer];
		String[] players = new String[] {"A" , "B" ,"C"};
		
		
		System.out.println("기록입력기");
		for(int i = 0 ;i < numOfPlayer; i++) {
			System.out.printf("%s 선수 기록>", players[i]);
			records[i] = scan.nextDouble();
						
		}
		//정렬
		for(int i = 0 ;i < numOfPlayer ; i++) {
			for(int j = 0 ;  j <numOfPlayer -1; j++ ) {
				if(records[j] > records[j+1] ) {
					double tempDB = records[j];
					records[j] = records[j+1];
					records[j+1] = tempDB;
					
					String tempST = players[j];
					players[j] = players[j+1];
					players[j+1] = tempST;
					
				}
			}
		}
		
		
		
		
		
		//출력
		for(int i = 0; i < numOfPlayer; i++) {
			System.out.printf("%d등: %s: 선수기록(%.1f) \n", i+1, players[i], records[i]   );
		}
		

	}

}
