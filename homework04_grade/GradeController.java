package homework04_grade;
import javax.swing.JOptionPane;
public class GradeController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grade gr = null;
		GradeService gs = new GradeService();
		
		while(true) {
			switch(JOptionPane.showInputDialog(" 성적표 0.종료   1.입력    2.조회")) {
			case "0":
				JOptionPane.showInputDialog("종료");
				return;
			case "1":
				gr = new Grade();
				
				JOptionPane.showInputDialog("성적표");
				gr.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수")));
				gr.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수")));
				gr.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학점수")));
				
				break;
			case "2":
				JOptionPane.showMessageDialog(null, "국어    영어   수학    총점    평균\n" + 
						gr.getKor()+ "    " + gr.getEng() +"   " +gr.getMath() +"   "+ gs.getTotal(gr) +"   " +gs.getAvg(gr));
				
				break;
			}
		}

	}

}
