package demodemo;

import sec03.Computer;
import sec03.Controllable;
import sec03.TV;

public class ControllableDemo2 {
	public static void main(String[] args) {
		Controllable[] controllable = { new TV(), new Computer() };

		for (Controllable c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllable.reset();
	}
}
