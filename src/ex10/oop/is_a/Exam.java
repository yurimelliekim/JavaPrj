package ex10.oop.is_a;

import java.util.Scanner;

public class Exam {
	              
	private int kor;
    private int eng;
    private int math;
      
    public Exam() {	
    	this(0,0,0);	
    }
    
    public Exam(int kor, int eng, int math) {//Program2에서 초기화시키는 방법
    	this.kor = kor;//this생략못함
    	this.eng = eng;
    	this.math = math;
    }
    
	public  int total() {
		return kor+eng+math;
	}//this.kor~~~this생략
	
	public float avg() {//바로 객체를 쓰는거라서 static뺌, 뒤에 this로 전달되어야할게있어야함
		return total()/3.0f;//여기서 this의 의미는 여기서 사용한 객체를 쓴다.와 같은말
	}//return this.total()/3;에서 this가생략됨.
	
	public  int getKor() {//인스턴스함수, 앞에 객체(exam)가있어야함.이걸 this로씀
		
		return kor;//return this.kor;우리가 this를 지워도 컴파일러가 찾아줘서 생략가능
	}
	public int getEng() {
		
		return eng;
	}
	public  int getMath() {
		
		return math;
	}
	public void setKor(int kor/*지역변수*/) {
		this.kor = kor;//지역변수 내에 kor가있어서 둘 다 지역변수 kor로가서 this생략불가
		
	}
	public void setEng(int eng) {
		this.eng = eng;
		
	}
	public void setMath(int math) {
		this.math = math;
		
	}
	
}
