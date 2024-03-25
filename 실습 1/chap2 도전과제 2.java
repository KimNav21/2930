package scanner;

import java.util.Scanner;

public class SniffleDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String result;
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		num = in.nextInt();

		result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println(result);
	}

}
