package ex10.oop.example;

import java.util.Scanner;

public class Console {

	private Board board;
	private Stone stone;
	
	private char[][] buf;
	public Console() {
		board = new Board();//객체생성
		//stone = new Stone();//이거는 한번만 불러오는게 아니라서 여기에쓰는게 아님.
		int height = board.getHeight();
		int width = board.getWidth();
		
		
		
		buf = new char [height][width];
		//버프는 출력하는 놈이 가지고 있는거.
	}
	
	
	public void printBoard(){
		int height = board.getHeight();
		int width = board.getWidth();
		Stone[] stones = board.getStones();
		
		for(int y=0;y<height;y++) {
			for(int x=0;x<width;x++) {
				buf[y][x] = '╉';
			}
		}
                        //stones.length
		for(int i=0;i<board.getStoneSize();i++) {

			int sx = stones[i].getX();
			int sy = stones[i].getY();
			char stype = stones[i].getType();
			
			buf[sy][sx] =stype;

			
		}
		
		
		
		for(int y=0;y<height;y++) {
			for(int x=0;x<width;x++) {
				System.out.printf("%c",buf[y][x]);
			}
			System.out.println();
		}
		
	//출력버퍼를 사용하지 않고 절차로만 출력하면 안됨!!!!	
	/*	for(int y=0;y<height;y++) {
			for(int x=0;x<width;x++) {
				if(?)
					System.out.printf("%c",stone);
				else
				System.out.printf("%c",'╉');
			}
		System.out.println();
	} */
	}
	public void inputStone(){
		
		Scanner scan = new Scanner(System.in);//컨트롤시프트오
		
		System.out.print("(x sp y): ");
		
		int x, y;
		char type = '○';
		x=scan.nextInt();
		y=scan.nextInt();
		
		stone = new Stone(x,y,type);//이 함수를 불러올때마다 가져와야해서 여기에씀
	}

	public void putStoneOnBoard() {
		board.putStone(stone);
		
	}
	
	
}
