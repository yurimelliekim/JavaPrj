package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Hw01022 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C://연습//test.txt");
		Scanner fscan = new Scanner(fin);
		
		/*for(int i=0; i<5; i++) {
			System.out.printf(" %d", fscan.nextInt());
		}
		*/
		/*
		while(fscan.hasNext())
			System.out.printf(" %d", fscan.nextInt());
		*/
		
		
		//총합 구하기
		/*int total = 0;
		while(fscan.hasNext()) {
			
			total += fscan.nextInt();
		}
		System.out.printf("%5d", total);
		*/
		
		//40보다 작은값들 더하기
		int total = 0;
		while(fscan.hasNext()) {
			int num = fscan.nextInt();
			if(num <= 60) 
			total += num;
		}
		System.out.printf("%5d", total);
		
	
		
		
		
		
		fin.close();

	}

}
