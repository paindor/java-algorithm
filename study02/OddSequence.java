package study02;

public class OddSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 3 5 7 9 
		
		int sum = 0;
		String eval = "";
		
		
		for(int i = 1 ;i <= 10 ; i+=2 ){
			if(i % 2 !=  0){
				sum += i;
				eval += (i == 9 ) ? i + " = " : i+" + ";
				
				//System.out.print(sum + "  ");
			
				
			}
			//eval += (i == 10 ) ? i + " = " : i+" + ";
			
			//ystem.out.print(eval + sum);
			
		}
		System.out.print(eval+sum);
		
	}

}
