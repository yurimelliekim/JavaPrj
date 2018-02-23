package ex5.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		//FileInputStream fis = new FileInputStream("C:\연습\\test.txt");이렇게 하면 인식을 못해서 파일 이동 시 \\두개
		//FileInputStream fis = new FileInputStream("C:\\연습\\test.txt");
		FileInputStream fis = new FileInputStream("res/test.txt");//상대적. res뒤에 \하나임!
											//이클립스 폴더에 res폴더를 만들고 텍스트파일을  복사해온 형태. 
		
		
		Scanner fscan = new Scanner(fis);
		//System.out.printf("%d %d %d\n", fscan.nextInt(),fscan.nextInt(),fscan.nextInt());
		
		/*
		for (int num = 0; num<3 ; num++)
			System.out.printf("%d ",fscan.nextInt());
		*/
		
		//int num = 0;//변수 선언을 for문 안에 해야함, 연산자가 아니라서 준비물은 반복을 하지 않음. 연산만함. 
		               //다른 영역에도 영향을 미치나 포문안에서만씀
		//for(int i = 0; i<3 ; i++) {
		//	num = fscan.nextInt();
		//	System.out.printf("%d ",num);
		//}
		
		
		/*
		for(int i = 0; i<3 ; i++) {
				int num = fscan.nextInt();
				System.out.printf("%d ",num);
		}
		*/
		
		//데이터의 총 합을 구해서 출력하는 코드를 작성하시오.
		/*int total = 0;
		for(int i = 0; i<3 ; i++) {
			int num1 = fscan.nextInt();
			//System.out.printf("%d ",num1);
			total += num1;			
		}
		System.out.printf("%d ", total);
		*/
		
		//위와 같은코드
		/*int total1 = 0;
		for(int i = 0; i <3; i++)
			total1 += fscan.nextInt();
		System.out.printf("%d", total1);
		*/
		
	/*	int total = 0;
		while(fscan.hasNext())//다음값이 있으면 참이라서 계속 돌아감, 다음값이 없을 때 멈춤
			total += fscan.nextInt();
		System.out.printf("%d", total);
		
	*/	
		//앞의 문제에서 읽어들인 값이 50보다 작거나 같은 값만 총합을 구하시오
	/*	int total = 0;
		while(fscan.hasNext()) { 
			if (fscan.nextInt() <= 50)//앞에 hasNext라서 뒤에꺼부터됨. 30출력.오류임 테스트파일에 20 30 70써져있음
			total += fscan.nextInt();
			}
		System.out.printf("%d", total);
	*/	
	/*	int total = 0;
		while(fscan.hasNext()) {
			int num = fscan.nextInt();
			if (num <= 50)
			total += num;
			}
		System.out.printf("%d", total);*/
		
		
		
	//위의 문제에서 70(제외)을 만날 때 까지의 합을 구해서 출력하는 코드를 작성하세요	
		/*int total = 0;
		while(fscan.hasNext()) {
			int num = fscan.nextInt();
			if ( num == 70)
			break;
			total += num;	
		}	
		System.out.printf("%d", total);
		*/
		
		
	//위의 문제를 수정하여 70 만나기 전까지는 모두 skip하도록 하시오
		int total = 0;
		boolean check = false;
		while(fscan.hasNext()) {
			int num = fscan.nextInt();
			if ( num != 70 && check ==false) 
			continue;//70이 아니면 밑에실행안하고 다시와일문으로 올라감
			
			check = true;
			total += num;
		}	
		System.out.printf("%d", total);
		
		
		
		
		fis.close();
		
		System.out.println(" 완료");
	}

}
