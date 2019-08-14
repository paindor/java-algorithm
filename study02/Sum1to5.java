package study02;

public class Sum1to5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while(true) {}
		String eval ="";
		
		for(int i = 1 ;i <= 5 ; i++){

			eval += (i == 5) ? i+ " = " : i+ " + " ; //삼항연산자   (컨디션) ? 참실행 : 거짓실행 ;
											// 리턴값이 있어야 사용가능
					
		}
		System.out.print(eval);
		
		

	}

}
