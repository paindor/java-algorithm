package homework02;
/*사람의 이름을 입력하고, 몸무게 , 키를 입력하면
해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
       BMI = x KG / (y M * y M)
      


Example for 175 cm height and 70 kg weight:
BMI = 70 / (1.75 * 1.75) = 22.86

(bmi > 30.0) 고도비만
(bmi > 25.0) 비만
(bmi > 23.0) 과체중
(bmi > 18.5) 정상
저체중
       이랍니다.
 */
import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double height = 0.0, weight = 0.0, bmi = 0.0;
		String bmiResult ="";
		System.out.println("BMI체크");
		System.out.print("이름>");
		String name = scan.next();
		System.out.print("체중(kg)>");
		weight = scan.nextDouble();
		
		System.out.print("신장(M)>");
		height =scan.nextDouble();
		bmi = weight / (height * height);
		
		if(bmi > 30.0) {
			bmiResult ="고도비만";
		}else if(bmi > 25.0 && bmi <= 30.0) {
			bmiResult = "비만";
		}else if(bmi > 23.0 && bmi <= 25.0) {
			bmiResult = "과체중";
		}else if(bmi > 18.5) {
			bmiResult = "정상";
		}else if(bmi <= 18.5) {
			bmiResult = "저체중";
			
		}
		
		
		System.out.printf("BMI지수 : %f , %s 입니다." , bmi, bmiResult);

	}

}
