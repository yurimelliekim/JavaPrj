package ex10.oop.example;

public class Program {

	public static void main(String[] args) {
		
		Console console = new Console();
		
		
	while(true) {	
		console.printBoard();
		console.inputStone();
		console.putStoneOnBoard();
	}
		}

}
