package switch_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		String name = null;
		while(true) {
			System.out.println("이름 입력");
			name = input.next();
			System.out.println("당신 이름 : " + name);
			
		}
		*/
		// 날짜를 입력받아 1일이면 '월'2일이면'화'...7일'일'8일'월'숫자에 맞춰 요일을 출력하시오
		/* int num = 0;
		while(true) {
			System.out.print("날짜 입력 :");
			num = input.nextInt();
			switch(num % 7) {
			case 1 : System.out.println(num + " : 월요일");break;
			case 2 : System.out.println(num + " : 화요일");break;
			case 3 : System.out.println(num + " : 수요일");break;
			case 4 : System.out.println(num + " : 목요일");break;
			case 5 : System.out.println(num + " : 금요일");break;
			case 6 : System.out.println(num + " : 토요일");break;
			case 0 : System.out.println(num + " : 일요일");break;
			}
		}
		*/
		int num = 0;
		String s1 = null,s2 = null;
		while(true) {
			System.out.println("1.우리집 등록\n2.회사 등록\n3.등록 보기");
			num = input.nextInt();
			switch(num) {
			case 1 : System.out.print("우리집 입력 : ");
					 s1 = input.next();
					 break;
			case 2 : System.out.print("회사 입력 : ");
					 s2 = input.next();
					 break;
			case 3 : System.out.println("우리집 : " + s1 + "\n회사 : " + s2);break;
			default : System.out.println("다시 입력하세요");
			}
		}
		
	}
}
