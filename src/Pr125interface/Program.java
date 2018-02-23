package Pr125interface;

public class Program {

	public static void main(String[] args) {
		
		//공통분모생성
		PExam pexam = new PExam();
		ExamConsole console = new ExamConsole();
		PConsoleListener consolelistener = new PConsoleListener();
		//방법1.새로운 클래스에서 구현
	
		console.setConsolelistener(consolelistener);
		console.setExam(pexam);
		
		console.input();
		console.print();
	}

}
