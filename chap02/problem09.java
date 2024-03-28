package problem;

import java.util.Scanner;

public class problem09 {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner in = new Scanner(System.in);
        System.out.print("전공 이수 학점 : ");
        n1 = in.nextInt();
        System.out.print("교양 이수 학점 : ");
        n2 = in.nextInt();
        System.out.print("일반 이수 학점 : ");
        n3 = in.nextInt();

        System.out.println((n1+n2+n3 >= 140 && ((n1>=70 && ((n2>=30&&n3>=30) || (n2+n3>=80)))))?"졸업 가능":"졸업 불가능");
    }
}
