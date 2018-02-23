package ex10.oop.example;

public class Stone {





	private int x;
	private int y;
	private char type;
	
	
	public Stone() {//컨트롤스페이스로
		
		
	}


	public Stone(int x, int y, char type) {
		
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public char getType() {
		return type;
	}


	public void setType(char type) {
		this.type = type;
	}	

	
}
