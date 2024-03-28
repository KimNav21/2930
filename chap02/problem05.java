package problem;

import java.util.Scanner;

public class problem05 {
    public static void main(String[] args) {
        //임의의 소문자로 초기화된 char 타입 변수 c
        char c = 'a'; //'a'의 아스키코드 값 = 97
        char C = 'A'; //'A'의 아스키코드 값 = 65
        int n = (int)c - (int)C; //'a'와 'A'의 아스키코드 값 차이 = 32
        System.out.println("소문자" + c + " -> 대문자" + (char)(c-n));

        //방법 2 - 소문자 입력 받아서 대문자로 바꾸기
        char a, A;
        Scanner in = new Scanner(System.in);
        System.out.print("소문자를 입력하세요 : ");
        a = in.next().charAt(0); //입력받은 글자의 0번째 문자
        A = (char)((int)a - 32);
        System.out.println("소문자" + a + "를 대문자로 변환하면? " + A);
    }
}
