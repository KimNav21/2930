package problem;

import java.util.Scanner;

public class problem07 {
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        x = in.nextInt();
        boolean one = (x % 4 == 0) && (x % 5 == 0);
        boolean two = (x % 4 == 0) || (x % 5 == 0);
        boolean three = (x % 4 == 0 || x % 5 == 0) && !(x % 4 == 0 && x % 5 == 0);
        System.out.println("4와 5로 나누어지는지 : " + one);
        System.out.println("4 또는 5로 나누어지는지 : " + two);
        System.out.println("4나 5 중 하나로 나누어지지만 두 수 모두로는 나누어지지 않는지 : " + three);
    }
}
