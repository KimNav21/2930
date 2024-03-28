package problem;

import java.util.Scanner;

public class problem06 {
    public static void main(String[] args) {
        double F;
        Scanner in = new Scanner(System.in);
        System.out.print("화씨온도를 입력하세요 : ");
        F = in.nextDouble();
        double C = 5.0 / 9.0 * (F - 32);
        System.out.println("화씨온도 " + F + "-> 섭씨온도 " + C);
    }
}
