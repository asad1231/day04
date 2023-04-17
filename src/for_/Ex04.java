package for_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/* 숫자를 5번 입력받고, 입력받을 때마다 더해지는 식을 작성해보자.
	    ex.숫자를 입력하세요: 5	출력: 5
		   숫자를 입력하세요: 6	출력: 11
	       숫자를 입력하세요: 3	출력: 14
	       숫자를 입력하세요: 2	출력: 16
	       숫자를 입력하세요: 4	출력: 20
	   */
		int num;
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.print("숫자를 입력하세요 : ");
			num = input.nextInt();
			sum += num;
			System.out.println("출력 : " + sum);
		}
	}
}
