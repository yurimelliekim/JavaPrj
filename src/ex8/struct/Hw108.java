package ex8.struct;

public class Hw108 {

	public static void main(String[] args) {
		
		int menu=0;
		int smenu=0;
		
		while(true) {
			menu = 로또판매();
			
			switch(menu) {
				case 1:
					로또구매();
					
					입력벗어남:
					while(true) {
						switch(smenu) {
							case 1:
								수동입력();
								break;
							case 2:
								자동입력();
								break;
							case 3:
								취소();
						}
					break 입력벗어남;
					}
				break;
				case 2:
					당첨번호확인();
					break;
				case 3:
					종료();
		
			}
				
		}

	}

	private static void 종료() {
		
		
	}

	private static void 당첨번호확인() {
		
		
	}

	private static void 취소() {
		
		
	}

	private static void 자동입력() {
		
		
	}

	private static void 수동입력() {
		
		
	}

	private static void 로또구매() {
		
		
	}

	private static int 로또판매() {
		
		return 0;
	}

}
