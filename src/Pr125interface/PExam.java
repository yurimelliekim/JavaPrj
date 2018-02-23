package Pr125interface;

public class PExam extends Exam{

	private int com;

	public PExam() {
		this(0,0,0,0);
	}
	
	public PExam(int kor, int eng, int math, int com) {
		super(kor,eng,math);
		this.com = com;
	}
	
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
 
	
	@Override
	public int total() {
		return super.total()+com;
	}
	
	
	@Override
	public float avg() {
		return total()/4.0f;
	}
	
	
	
}
