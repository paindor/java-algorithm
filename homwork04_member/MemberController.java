package homwork04_member;
import javax.swing.JOptionPane;
public class MemberController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem = null;
		MemberService mems = new MemberService();
		
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.Join 2.마이페이지 3.Bmi 4.tax")) {
			case "0" : JOptionPane.showInputDialog("종료");
			return;
				
			case "1":
				mem = new Member();
				
				JOptionPane.showInputDialog("회원가입");
				mem.setId(JOptionPane.showInputDialog("아이디"));
				mem.setPw(JOptionPane.showInputDialog("비번"));
				mem.setName(JOptionPane.showInputDialog("이름"));
				mem.setSsn(JOptionPane.showInputDialog("주민번호"));
				mem.setBlood(JOptionPane.showInputDialog("혈액형"));
				mem.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키")));
				mem.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게")));
				mem.setIncome(Integer.parseInt(JOptionPane.showInputDialog("연봉")));
				
				break;
			case "2":
				JOptionPane.showMessageDialog(null,mem.toString());
				break;
			case "3":
				JOptionPane.showInputDialog("bmi");
				JOptionPane.showMessageDialog(null,mems.getBmi(mem));
				break;
			case "4":
				JOptionPane.showInputDialog("당신의세금은?");
				JOptionPane.showMessageDialog(null, mems.getTax(mem));
				break;
				
			}
			
		}

	}

}
