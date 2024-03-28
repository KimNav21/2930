package problem;

import java.util.Scanner;

public class problem03 {
    public static void main(String[] args) {
        double radius, h, area;
        Scanner in = new Scanner(System.in);
        System.out.print("원기둥의 밑면 반지름은? ");
        radius = in.nextDouble();
        System.out.print("원기둥의 높이는? ");
        h = in.nextDouble();
        area = radius * radius * 3.14 * h;
        System.out.println("원기둥의 부피는 " + area);
    }
}
