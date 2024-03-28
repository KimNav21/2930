package problem;

class Printer {
	private int numOfPapers;

	public Printer(int numOfPapers) {
		this.numOfPapers = numOfPapers;
	}

	public void print(int amount) {
		if (numOfPapers >= amount) {
			numOfPapers = numOfPapers - amount;
			System.out.println(amount + "장 출력했습니다. 현재 " + numOfPapers + "장 남아 있습니다.");
		} else if (numOfPapers <= 0)
			System.out.println("용지가 없습니다.");
		else if (numOfPapers < amount) {
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다. %d장만 출력합니다.\n", (amount - numOfPapers), numOfPapers);
			numOfPapers -= numOfPapers;
		}
	}

}

public class PrinterTest4 {
	public static void main(String[] args) {
		Printer p = new Printer(10);
		p.print(2);
		p.print(20);
		p.print(10);
	}
}
