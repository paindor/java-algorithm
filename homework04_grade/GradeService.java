package homework04_grade;

public class GradeService {

	public String getTotal(Grade gr) {
		String result = "";
		int sum = gr.getEng() + gr.getKor() + gr.getMath();
		result = String.valueOf( sum);
		
		
		return result;
		
	}
	public String getAvg(Grade gr) {
		String avg = "";
		int sum = gr.getEng() + gr.getKor() + gr.getMath();
		avg = String.valueOf(sum/3);
		
		
		return avg;
		
	}

}
