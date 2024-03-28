package problem;

import java.util.Scanner;

public class problem08 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        n = in.nextInt();
        System.out.printf("각 자릿수의 합 = %d\n", n/100 + (n%100)/10 + (n%100)%10);
    }
}
