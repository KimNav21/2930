package problem;

class Printer {
	int numOfPapers = 0;

	public void print(int amount) {
		numOfPapers -= amount;
	}
}

public class PrinterTest {
	public static void main(String[] args) {
		Printer a = new Printer();
		a.numOfPapers = 100;
		a.print(70);
		System.out.println(a.numOfPapers);
	}
}
