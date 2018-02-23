package ex7.function;

import java.util.Random;

public class ProgramLotto {
	
	/*public static void 로또번호출력(int[] nums) {//정수배열의 변수는 nums
		
		for(int i = 0; i<6; i++)
		System.out.printf("%3d", nums[i]);
	}*/
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] nums = new int[6];
		
		
		로또번호생성(nums); //마우스올려놓고 create
		
		로또번호출력(nums);
		
		int temp;
		temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
		
		
		
	

		
		
	//문제1. 첫번째(인덱스 0)와 두번째 (인덱스1)의 값을 서로 바꿔서 출력하는 코드를 작성하시오.
	//두 위치의 값을 바꾸는 절차
	//1.임시공간 마련
	//2.0번째에 있는 값을 임시공간에 둔다
	//3.1번째에 있는 값을 0번째로 옮긴다.
	//4.임시공간에 둔 값을 1번째로 옮긴다.
	/*	if(nums[0] > nums[1]) {
		int num = 0;
		num = nums[0];
		nums[0] = nums[1];
		nums[1] = num;
		}
		for(int i = 0; i<6; i++)
			System.out.printf("%3d", nums[i]);*/
		
		
//숙제1. 제일 큰 왕초찾기 반복
	//1.만약에 0번째 Index보다 1번째 Index가 크다면 0번째와 1번째 공간의 값을 바꾼다.
	//2.만약에 1번째 Index보다 2번째 Index가 크다면 1번째와 2번째 공간의 값을 바꾼다.
	//3.만약에 2번째 Index보다 3번째 Index가 크다면 2번째와 3번째 공간의 값을 바꾼다.
	//4.만약에 3번째 Index보다 4번째 Index가 크다면 3번째와 4번째 공간의 값을 바꾼다.
	//5.만약에 4번째 Index보다 5번째 Index가 크다면 4번째와 5번째 공간의 값을 바꾼다.
/*
		if(nums[0] > nums[1]) {
			int num = 0;
			num = nums[0];
			nums[0] = nums[1];
			nums[1] = num;
			}
		if(nums[1] > nums[2]) {
			int num = 0;
			num = nums[1];
			nums[1] = nums[2];
			nums[2] = num;
			}
		if(nums[2] > nums[3]) {
			int num = 0;
			num = nums[2];
			nums[2] = nums[3];
			nums[3] = num;
			}
		if(nums[3] > nums[4]) {
			int num = 0;
			num = nums[3];
			nums[3] = nums[4];
			nums[4] = num;
			}
		if(nums[4] > nums[5]) {
			int num = 0;
			num = nums[4];
			nums[4] = nums[5];
			nums[5] = num;
			}
		
		if(nums[0] > nums[1]) { //두번째
			int num = 0;
			num = nums[0];
			nums[0] = nums[1];
			nums[1] = num;
			}
		if(nums[1] > nums[2]) {
			int num = 0;
			num = nums[1];
			nums[1] = nums[2];
			nums[2] = num;
			}
		if(nums[2] > nums[3]) {
			int num = 0;
			num = nums[2];
			nums[2] = nums[3];
			nums[3] = num;
			}
		if(nums[3] > nums[4]) {
			int num = 0;
			num = nums[3];
			nums[3] = nums[4];
			nums[4] = num;
			}
		
		if(nums[0] > nums[1]) { //세번째
			int num = 0;
			num = nums[0];
			nums[0] = nums[1];
			nums[1] = num;
			}
		if(nums[1] > nums[2]) {
			int num = 0;
			num = nums[1];
			nums[1] = nums[2];
			nums[2] = num;
			}
		if(nums[2] > nums[3]) {
			int num = 0;
			num = nums[2];
			nums[2] = nums[3];
			nums[3] = num;
			}
		
		if(nums[0] > nums[1]) { //네번째
			int num = 0;
			num = nums[0];
			nums[0] = nums[1];
			nums[1] = num;
			}
		if(nums[1] > nums[2]) {
			int num = 0;
			num = nums[1];
			nums[1] = nums[2];
			nums[2] = num;
			}
		
		if(nums[0] > nums[1]) { //다섯번째
			int num = 0;
			num = nums[0];
			nums[0] = nums[1];
			nums[1] = num;
			}
			for(int i = 0; i<6; i++)
				System.out.printf("%3d", nums[i]);
		
		
			
		System.out.println(" ");
//숙제2.위의 코드를 반복문으로 바꿔서 작성하시오.
		for(int i=0;i<5;i++)
		if(nums[i]>nums[i+1]) {
			int num = 0;
			num = nums[i];
			nums[i] = nums[i+1];
			nums[i+1] = num;
			}
		for(int i=0;i<4;i++)
			if(nums[i]>nums[i+1]) {
				int num = 0;
				num = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = num;
			}	
		for(int i=0;i<3;i++)
			if(nums[i]>nums[i+1]) {
				int num = 0;
				num = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = num;
			}
		for(int i=0;i<2;i++)
			if(nums[i]>nums[i+1]) {
				int num = 0;
				num = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = num;
			}
		for(int i=0;i<1;i++)
			if(nums[i]>nums[i+1]) {
				int num = 0;
				num = nums[i];
				nums[i] = nums[i+1];
				nums[i+1] = num;
			}
		for(int i = 0; i<6; i++)
			System.out.printf("%3d", nums[i]);*/
//숙제3. 위의 코드를 반복 중첩을 하시오. 단, 이번에는 4번만 반복되도록 하시오. 단, 내부 for문의 반복횟수가 반복할때마다 5->4->3->2씩 반복횟수가 줄도록
	//힌트:
	//for(int i=0;i<5;i++)
	//	for(int j=0;j<[이 부분이 내부 반복횟수];j++)
	//		실행문
	/*
		for(int i=0;i<5;i++) {
			for(int j=0; j<5-i;j++)
			if(nums[j]>nums[j+1]) {
				int num = 0;
				num = nums[j];
				nums[j] = nums[j+1];
				nums[j+1] = num;
			}
		}
		
		 
			
			for(int i = 0; i<6; i++)
			System.out.printf("%3d", nums[i]);
		*/
		
		
//다음숙제: 중복을 제거	
		
	
		
		
		
		
		}
	
	

	public static void 로또번호생성(int[] nums) {
		Random rand = new Random();
		for(int i = 0; i<6; i++) 
			nums[i] = rand.nextInt(45)+1;		
	}
	public static void 로또번호출력(int[] nums) {//정수배열의 변수는 nums
		
		for(int i = 0; i<6; i++)
		System.out.printf("%3d", nums[i]);
	}

}
