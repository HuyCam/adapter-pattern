package adapterpattern;

public class Driver {
	public static void main(String args[]) {
		CoffeeTouchscreenAdapter machine = new CoffeeTouchscreenAdapter();
		
		machine.chooseFirstSelection();
		machine.chooseSecondSelection();
	}
}
