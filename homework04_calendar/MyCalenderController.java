package homework04_calendar;
import javax.swing.JOptionPane;
public class MyCalenderController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCalender mc = null;
		MyCalenderService ms = new MyCalenderService();
		
		
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료     1.몇일까지?   2.윤년계산기")) {
			case "0":
				return;
			case "1":
				mc = new MyCalender();
				mc.setMonth(Integer.parseInt(JOptionPane.showInputDialog("월입력")));
				JOptionPane.showMessageDialog(null, ms.getEndDay(mc));
						
				
				break;
			case "2":
				mc = new MyCalender();
				mc.setYear(Integer.parseInt(JOptionPane.showInputDialog("연도입력")));
				JOptionPane.showMessageDialog(null,ms.isLeapYear(mc));
				break;
			
			}
		
		}
	}

}
