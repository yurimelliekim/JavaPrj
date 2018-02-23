package ex9.capsule;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
	    Exam exam = new Exam();//기본형이 아닌것은 다 공유임, Exam 클릭해서 create
		
		int menu;
		final int INPUT = 1;//변수가 아닌 상수로 하기 위해서 앞에 final씀
		final int PRINT = 2;
		
		EXIT:
		while(true) {
			menu=메뉴입력();
			
			switch(menu) {
			case INPUT:	//숫자로 쓰면 식별할 때 의미파악이 잘 안되서 잘 안씀  
				ExamConsole.성적입력(exam);//성적입력 함수가 다른 클래스에 있음 그래서 앞에 클래스 써줘야함
				break;
			case PRINT:
				ExamConsole.성적출력(exam);
				break;
			case 3:
				break EXIT;
				//함수자체를빠져나가야함,이거자체를 함수로 만들이유가없음, [대문자]로 써야함 (소문자는 새로운 symbol로 느껴질 수 있음)
			}
		}
	}

	private static int 메뉴입력() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────────────────────────────────────┐");
		System.out.println("│                  메인 메뉴                                             │");
		System.out.println("└────────────────────────────────────────────┘");
		System.out.println("\t1.성적 입력");
		System.out.println("\t2.성적 출력");
		System.out.println("\t3.종료");
		System.out.print("\t선택 >");
		int menu = scan.nextInt();//안에만 선언이 가능하면 여기에넣는게좋음.  
			
		return menu;
	}
}

	


