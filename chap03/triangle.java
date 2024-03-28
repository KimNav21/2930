package problem;

public class triangle {
	public static void main(String[] args) {
		int a, b, c;

		for (a = 1; a < 20; a++) {
			for (b = 1; b < 20; b++) {
				for (c = 1; c < 20; c++) {
					if (((a * a) + (b * b) == (c * c)) && (a + b + c <= 20))
						System.out.printf("a = %d, b =%d, c = %d\n", a, b, c);
				}
			}
		}
	}
}
