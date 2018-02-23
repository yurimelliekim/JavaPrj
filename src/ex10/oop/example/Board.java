package ex10.oop.example;

public class Board {
	private int width;
	private int height;
	
	private Stone[] stones;
	private int index;
	
	public int getStoneSize() {
		return index;
		
	}
	
	public int getWidth() {//게터세터 오른쪽버튼후소스
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Stone[] getStones() {//배열로 리턴되는거라서 Stone[]
		return stones;
	}

	public void setStones(Stone[] stones) {
		this.stones = stones;
	}

	public Board() {//생성자에 초기값넣기
		
		this(30,20);
		/*width =30;
		height = 20;집중화*/
		//stones = new Stone[10];집중화를위해
	}
	
	//overload,오른쪽마우스 소스에서 Generate constructor using field
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		stones = new Stone[10];
	
	}
	
	public void putStone(Stone stone) {//stone들의 누적 Aggregation방식
		stones[index] = stone;
		index++;
	}

	
	
}
