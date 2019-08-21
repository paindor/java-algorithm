package study05;

public class Member {
	
	private String name, id , pw,  ssn ,blood ;
	private double height, weight;
	private int kor, eng , math; 
	private int salary;
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

	public String getPw() {
		return this.pw;
	}

	public String getSsn() {
		return this.ssn;
	}

	public String getBlood() {
		return this.blood;
	}

	public double getHeight() {
		return this.height;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("회원정보\n" 
				+ "이름 : %s\n"
				+"아이디:%s\n"
				+"비밀번호:%s \n"
				+ "주민번호: %s \n"
				+"혈액형: %s\n"
				+"키:%.1f\n"
				+"몸무게:%.1f", name,id, pw, ssn, blood, height, weight);
	}
}
