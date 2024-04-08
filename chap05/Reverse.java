package string;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		String strResult;
		String strTemp;
		int nLen;
		System.out.print("문자열을 입력하시오 : ");
		str = scan.next();
		
		nLen = str.length();
		strResult="";
		for (int i=nLen-1; i >= 0; i--)
		{
			strTemp="";
			strTemp = String.format("%c", str.charAt(i));
			strResult = strResult.concat(strTemp);
		}
	
		System.out.println(strResult);
	}
}
