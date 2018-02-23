package Pr;

public class Test {
int kor;
int eng;
int math;
public int getKor() {
	
	return kor;
}
public int getEng() {
	
	return eng;
}
public int getMath() {
	
	return math;
}
public int total() {
	
	return kor+eng+math;
}
public void setKor(int kor) {
	this.kor=kor;
	
}
public void setEng(int eng) {
	this.eng = eng;
	
}
public void setMath(int math) {
	this.math = math;
	
}
public float avg() {
	
	return total()/3;
}


}
