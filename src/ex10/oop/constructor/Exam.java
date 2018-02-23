package ex10.oop.constructor;

import java.util.Scanner;
//SVC,데이터, 계산식은 여기에, 객체가 될 수 있는 개체
//클래스파일형태로 jar로 압축하여 라이브러리에서 제공
public class Exam {//entity, 개체, 사용자 정의 형식,구조화된데이터 (구조가변경되면함수도영향을받음)
	               //'데이터 구조'를 모아놓은 것
	private int kor;//kor의 이름이 바뀌면 Program2에도 영향을 줌 그래서 구조를 여기클래스로가져옴 그리고 private
    private int eng;
    private int math;
    
   /* public void init() {//함수로 초기화를 대신함
    	//이걸불러오면 또 초기화를 시킬수있어서 이거안씀
    }
    */
  
    //[default constructor생성자]  
   /*	public Exam() {//exam이라는 객체를 초기화시키는 함수
    	kor = 30;
    	eng = 0;
    	math = 0;
    }//중복을 피해야함
      */
    public Exam() {//default 생성자를 overload에서 일처리를 하게함(중복을 피하기 위해)
    	//여기에 다른값을 초기화시키면 안됨!!!
    	this(0,0,0);	
    }
    
    
    //[overload(사용자에게 옵션을 주는 역할,기능은같음) constructor생성자]
    public Exam(int kor, int eng, int math) {//Program2에서 초기화시키는 방법
    	this.kor = kor;//this생략못함
    	this.eng = eng;
    	this.math = math;
    }
    
    
	/*public  int total() {
		return this.kor+this.eng+this.math;
	}this생략가능!!
	*/
    
	public  int total() {
		return kor+eng+math;
	}//this.kor~~~this생략

	/*public static float avg(Exam exam) {//뒷부분에서 받아옴
		return total(exam)/3;
	}*/
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
