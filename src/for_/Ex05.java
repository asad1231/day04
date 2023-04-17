package for_;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 1~100사이의 숫자 n을 입력받고
		 1~100사이에 n의 배수의 개수와 합을 구하세요
		 (1~100 범위를 벗어나면 "잘못된 입력입니다")
		 */
		/*int num,count = 0,sum=0;
		System.out.print("1 ~ 100 사이 숫자 : ");
		num = input.nextInt();
		if(num < 0 || num > 100 ) {
			System.out.println("잘못된 입력입니다");
		}else {
			for(int i = 1; i <= 100; i++) {
				if(i % num == 0) {
					sum += i;
					count++;
				}
			}
		}
		System.out.println(num + "의 배수의 합 : " + sum);
		System.out.println(num + "의 배수의 개수 : " + count);
		*/
		// 1부터 50 사이 짝수의 합과 홀수의 합 각각 구하기 
		/*int evenSum = 0,oddSum = 0;
		for(int i = 1; i <= 50; i++) {
			if(i % 2 == 0) {
				evenSum += i;
			}else {
				oddSum += i;
			}
		}
		System.out.println("1 ~ 50 짝수의 합 : " + evenSum);
		System.out.println("1 ~ 50 홀수의 합 : " + oddSum);
		*/
		/*
				* 
		      * * * 
		    * * * * * 
		  * * * * * * * 
		* * * * * * * * * 
		  * * * * * * * 
		    * * * * * 
		      * * * 
		        * 
		 */
		/*for(int i=1; i<=5; i++) {   
	           for(int j=1; j<=5-i; j++) {
	               System.out.print("  "); 
	           }
	           for(int j=1; j<=i*2-1; j++) { 
	               System.out.print("* "); 
	           }
	           System.out.println();
		}
		for(int i = 4; i > 0; i--) {
				for(int j = 4; j >= i; j--) {
				System.out.print("  ");
				}
				for(int j = 1; j <= i*2-1; j++) {
				System.out.print("* "); 
				}
			System.out.println();
		}
		*/
		int a = 0;
		int i;
		for (i =3 ; i<100; i*=3) {
			a *= i ;
		}
		System.out.println(a);

		System.out.println(i);
	}
}
