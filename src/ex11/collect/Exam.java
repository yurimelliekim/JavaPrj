package ex11.collect;//추상클래스

import java.util.Scanner;

public abstract class Exam {//추상클래스('공통분모' 클래스)틀!!!!!!!!재료로 써야함.부품으로 쓰면 안됨.틀로 씀.
	// abstract: exam을 객체화 시킬 수 없게 막는다. ,부품으로 쓸 수 없다. 틀로씀.             
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
	
	
	
	//공통분모이지만 자식이 구현해야하는 avg()->abstract쓰기, 공통분모에서 의미가 없음.
	public abstract float avg(); //★★★★★★★★★★★★★★★★★
	
	
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
