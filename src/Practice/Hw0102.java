package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Hw0102 {

	public static void main(String[] args) throws IOException {
		/*FileInputStream fis = new FileInputStream ("C:\\연습\\test.txt");
		Scanner fscan = new Scanner(fis);*/
		
		/*
		while(fscan.hasNext()) {
			System.out.printf("%d ", fscan.nextInt());
		}
		*/
		
		//총합
		/*int total = 0;
		while(fscan.hasNext()) {
			int num = fscan.nextInt();
			total += num;
			System.out.printf("%d ", num);
		}
		System.out.printf("%d ",total);
		*/
		
		/*for(int j=0; j<5; j++) {
			for(int i=0; i<10 ; i++) {
				System.out.printf("%3d",10*j+i+1);
			}
			System.out.println("");
		}*/
		
		/*for(int j=0; j<5; j++) {
			for(int i=0; i<10 ; i++) {
				if((10*j+i+1)%3==0)
					System.out.printf("[%2d]",10*j+i+1);
				else
				System.out.printf("%3d",10*j+i+1);
			}
			System.out.println("");
		}
		*/
		
		
		//3의배수이면서 홀수인것에는 *처리
		
		
/*		for(int j=0; j<5; j++) {
			for(int i=0; i<10 ; i++) {
				if((10*j+i+1)%3==0 && (10*j+i+1)%2==1) 
					System.out.printf("*");
				else if((10*j+i+1)%2==1)
					System.out.printf("[%2d]",10*j+i+1);
				else
				System.out.printf("%3d",10*j+i+1);
			}
			System.out.println("");
		}
		*/
		
		
		/*FileInputStream fis = new FileInputStream("res/test.txt");
		Scanner fscan = new Scanner(fis);
		
		System.out.printf("%3d", fscan.nextInt());
		*/
		
		
		
		
		//fis.close();

	}

}
