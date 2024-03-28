package problem;

import java.util.Scanner;

public class problem04 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("초 단위 정수를 입력하세요 : ");
        n = in.nextInt();
        int s = n % 60;
        int m = (n / 60) % 60;
        int h = (n / 60) / 60;
        System.out.println(h + "시간 " + m + "분 " + s + "초");
    }
}
