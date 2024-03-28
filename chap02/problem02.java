package problem;

import java.util.Scanner;

public class problem02 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        n = in.nextInt();
        System.out.println(n + "의 제곱은 " + n*n);
    }
}
