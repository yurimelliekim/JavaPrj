package ex9.capsule;

import java.util.Scanner;
//SVC
//클래스파일형태로 jar로 압축하여 라이브러리에서 제공
public class Exam {//entity, 개체, 사용자 정의 형식,구조화된데이터 (구조가변경되면함수도영향을받음)
	               //'데이터 구조'를 모아놓은 것
	private int kor;//kor의 이름이 바뀌면 Program2에도 영향을 줌 그래서 구조를 여기클래스로가져옴 그리고 private
    private int eng;
    private int math;
    
	public static int total(Exam exam) {
		return exam.kor+exam.eng+exam.math;
	}
	
	public static float avg(Exam exam) {
		return total(exam)/3;
	}
	
	public static int getKor(Exam exam) {
		
		return exam.kor;
	}
	public static int getEng(Exam exam) {
		
		return exam.eng;
	}
	public static int getMath(Exam exam) {
		
		return exam.math;
	}
	public static void setKor(Exam exam, int kor) {
		exam.kor = kor;
		
	}
	public static void setEng(Exam exam, int eng) {
		exam.eng = eng;
		
	}
	public static void setMath(Exam exam, int math) {
		exam.math = math;
		
	}
	
	
	
}
